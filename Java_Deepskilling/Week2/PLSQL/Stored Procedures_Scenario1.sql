CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    FOR rec IN (
        SELECT accountid, balance 
        FROM accounts 
        WHERE accounttype = 'Savings'
    ) LOOP
        UPDATE accounts 
        SET balance = rec.balance + (rec.balance * 0.01)
        WHERE accountid = rec.accountid;
    END LOOP;

    COMMIT;
END;
/