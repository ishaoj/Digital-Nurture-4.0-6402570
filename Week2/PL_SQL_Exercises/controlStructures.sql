BEGIN
    FOR cust IN (SELECT customer_id, interest_rate, age FROM customers) LOOP
        IF cust.age > 60 THEN
            UPDATE customers
            SET interest_rate = interest_rate - (interest_rate * 0.01)
            WHERE customer_id = cust.customer_id;
        END IF;
    END LOOP;
    
    COMMIT;
END;
/

BEGIN
    FOR cust IN (SELECT customer_id, balance FROM customers) LOOP
        IF cust.balance > 10000 THEN
            UPDATE customers
            SET isVIP = 'Y'
            WHERE customer_id = cust.customer_id;
        END IF;
    END LOOP;

    COMMIT;
END;
/

BEGIN
    FOR loan_rec IN (
        SELECT l.loan_id, c.name, l.due_date 
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date <= SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || loan_rec.loan_id || 
                             ' for customer ' || loan_rec.name ||
                             ' is due on ' || TO_CHAR(loan_rec.due_date, 'DD-MON-YYYY'));
    END LOOP;
END;
/
