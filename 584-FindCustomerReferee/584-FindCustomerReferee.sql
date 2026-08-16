-- Last updated: 8/16/2026, 12:33:14 PM
# Write your MySQL query statement below
select name
from Customer 
where referee_id!=2
or referee_id is NULL;