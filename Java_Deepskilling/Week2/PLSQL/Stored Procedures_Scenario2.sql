create or replace procedure UpdateEmployeeBonus(
    dept in varchar2,
    per in number
)is
begin 
    for rec in (
        select employeeid,salary,name from employees where DEPARTMENT=dept
    ) loop
    update EMPLOYEES set SALARY=rec.SALARY+(rec.salary*(per)/100) where EMPLOYEEID=rec.employeeid;

    dbms_output.put_line('Salary updated to '||rec.salary|| ' of ' || rec.name);
    end loop;
end;

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (1, 'Alice Johnson', 'Manager', 70000, 'HR', TO_DATE('2015-06-15', 'YYYY-MM-DD'));

INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
VALUES (2, 'Bob Brown', 'Developer', 60000, 'IT', TO_DATE('2017-03-20', 'YYYY-MM-DD'));


begin
    UPDATEEMPLOYEEBONUS('HR',10);
end;