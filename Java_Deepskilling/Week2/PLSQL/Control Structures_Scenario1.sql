DECLARE
    CURSOR x_cursor IS
        SELECT c.CustomerID, c.DOB, l.InterestRate, l.LoanID
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID;

    v_id Customers.CustomerID%TYPE;
    v_dob Customers.DOB%TYPE;
    v_rate Loans.InterestRate%TYPE;
    v_loan_id Loans.LoanID%TYPE;
BEGIN
    FOR rec IN x_cursor LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12) > 60 THEN
            UPDATE Loans
            SET InterestRate = rec.InterestRate * 0.99
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied to customer ID ' || rec.CustomerID);
        END IF;
    END LOOP;
END;
/