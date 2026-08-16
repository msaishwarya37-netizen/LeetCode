-- Last updated: 8/16/2026, 12:34:09 PM
# Write your MySQL query statement below
select e.name as Employee
from employee e
join employee m
on e.managerId=m.id
where e.salary>m.salary;