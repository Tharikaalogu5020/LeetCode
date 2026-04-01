# Write your MySQL query statement below
select d.name as Department ,e.name as Employee,e.salary as Salary from Employee as e
join Department as d on e.departmentId=d.id and (select count(distinct salary) from Employee where salary>e.salary and departmentId=e.departmentId) <3 order by d.name,e.salary desc;