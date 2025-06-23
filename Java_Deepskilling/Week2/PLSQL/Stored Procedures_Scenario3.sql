CREATE or replace procedure TransferFunds(
    v_sender in number,
    v_reciver in number,
    amount in number
)is
sender_bal accounts.BALANCE%TYPE;
reciver_bal accounts.BALANCE%TYPE;
exp EXCEPTION;
begin 
    
    select balance into sender_bal from accounts where accountid=v_sender;
    select balance into reciver_bal from accounts where accountid=v_reciver;
    if(sender_bal<amount) then
        dbms_output.put_line('Insufficent balance');
        raise exp;
    else
        update accounts set BALANCE=sender_bal-amount where accountid=v_sender;
        update accounts set BALANCE=reciver_bal+amount where accountid=v_reciver;
        dbms_output.put_line('Transaction done from account id '||v_sender||' to account id '||v_reciver);
        commit;
    end if;
EXCEPTION
    when exp then
        dbms_output.put_line('transaction roll backed');
        ROLLBACK;
end;
/  

INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (1, 1, 'Savings', 1000, SYSDATE);
INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
VALUES (2, 2, 'Checking', 1500, SYSDATE);


BEGIN
    TRANSFERFUNDS(1,2,500);
end;