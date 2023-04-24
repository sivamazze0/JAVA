1.To write a� Cursor to display the list of employees who are Working as a Managers or Analyst.

select * from emp;

set serveroutput on;
declare
    emprec emp%rowtype;
    cursor mycurs is select * from emp where job='MANAGER' or job='ANALYST';
begin
    open mycurs;
    loop
    fetch mycurs into emprec;
    exit when mycurs%NOTFOUND;    
    dbms_output.put_line(emprec.empno || '     ' || emprec.ename || '    ' || emprec.deptno ||'   '|| emprec.job); 
    end loop;
    close mycurs;
end;
/

2.Write PL/SQL code in Cursor to display employee names and salary
set serveroutput on;
declare
    empname emp.ename%type;
    empsal emp.sal%type;
    
    cursor mycurs is select ename,sal from emp ;
begin
    open mycurs;
    loop
    fetch mycurs into empname,empsal;
    exit when mycurs%NOTFOUND;    
    dbms_output.put_line( empname || '    ' ||  empsal); 
    end loop;
    close mycurs;
end;
/

3.Write PL/SQL code in Procedure to find the Reverse of the �number

SET SERVEROUTPUT ON;
DECLARE
num NUMBER;
rev NUMBER;
  
BEGIN
num:=12345;
rev:=0;
WHILE num>0 LOOP
rev:=(rev*10) + mod(num,10);
num:=floor(num/10);
END LOOP;
DBMS_OUTPUT.PUT_LINE('Reverse of the number is: ' || rev);
END;
/
