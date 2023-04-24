-->List the emps along with of those who belongs to Dallas New York with Sal ranging from 2000 to 5000 joined in 1981.

select * from emp;

SELECT e.*
FROM emp e
INNER JOIN dept d ON e.deptno = d.deptno
WHERE (d.loc in('NEWYORK','DALLAS'))
AND e.sal BETWEEN 2000 AND 5000;

-->List the Empno, Ename, Sal, grade of all emps.

select EMPNO,ENAME, SAL
from emp

-->List the grade 2 & 3 emps of Chicago.
Select empno, ename, Sal, grade
from emp
WHERE grade IN (2,3) AND city = 'Chicago';