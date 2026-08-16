-- Last updated: 8/16/2026, 12:33:07 PM
# Write your MySQL query statement below
select class
from Courses
group by class
having count(student)>=5;