-- Scenario 1
DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    -- Apply 1% interest only to savings accounts
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'savings';
END $$

DELIMITER ;

-- Scenario 2
DELIMITER $$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN dept_id INT,
    IN bonus_percent DECIMAL(5,2)
)
BEGIN
    -- Update salary with bonus: salary = salary + (salary * bonus_percent / 100)
    UPDATE employees
    SET salary = salary + (salary * bonus_percent / 100)
    WHERE department_id = dept_id;
END $$

DELIMITER ;

-- Scenario 3
DELIMITER $$

CREATE PROCEDURE TransferFunds(
    IN from_account_id INT,
    IN to_account_id INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE from_balance DECIMAL(10,2);

    -- Get the balance of the source account
    SELECT balance INTO from_balance
    FROM accounts
    WHERE account_id = from_account_id;

    -- Check if sufficient funds are available
    IF from_balance >= amount THEN
        -- Deduct from source account
        UPDATE accounts
        SET balance = balance - amount
        WHERE account_id = from_account_id;

        -- Add to destination account
        UPDATE accounts
        SET balance = balance + amount
        WHERE account_id = to_account_id;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient funds in source account';
    END IF;
END $$

DELIMITER ;
