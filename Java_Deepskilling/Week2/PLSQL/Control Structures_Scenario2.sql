alter table customers add isVIP varchar2(10)


DECLARE
    cursor x_cursor is select customerid,balance from customers;

begin
    for rec in x_cursor loop
        if rec.balance>10000 then
            update customers set isVIP='TRUE' where customerid=rec.customerid;
        ELSE
            update customers set isVIP='FALSE' where customerid=rec.customerid;
        end if;
    end loop;
end;