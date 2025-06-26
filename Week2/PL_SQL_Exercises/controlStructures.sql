
BEGIN
  FOR rec IN (
    SELECT CustomerID
    FROM Customers
    WHERE Balance > 10000
  )
  LOOP
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE CustomerID = rec.CustomerID;
    
    DBMS_OUTPUT.PUT_LINE(
      '🏆 VIP status set for Customer ID: ' || rec.CustomerID
    );
  END LOOP;
  
  COMMIT;
END;
/


BEGIN
  FOR rec IN (
    SELECT L.LoanID, C.CustomerID, C.Name, L.DueDate
    FROM Loans L
    JOIN Customers C ON L.CustomerID = C.CustomerID
    WHERE L.DueDate BETWEEN SYSDATE AND SYSDATE + 30
  )
  LOOP
    DBMS_OUTPUT.PUT_LINE(
      '🔔 Reminder: Loan ID ' || rec.LoanID ||
      ' for Customer ' || rec.Name ||
      ' (ID: ' || rec.CustomerID || ') is due on ' || TO_CHAR(rec.DueDate, 'DD-Mon-YYYY')
    );
  END LOOP;
END;
/

