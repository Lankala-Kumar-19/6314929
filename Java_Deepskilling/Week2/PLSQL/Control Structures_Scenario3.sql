DECLARE
    CURSOR x_cus is select c.name,c.customerid from customers c join loans l on c.CUSTOMERID = l.CUSTOMERID where l.ENDDATE between sysdate and sysdate+30;
begin
    for rec in x_cus loop
        dbms_output.put_line( rec.name|| ',this is a Reminder to pay loan ');
    end loop;
end;