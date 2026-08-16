-- Last updated: 8/16/2026, 12:33:00 PM
# Write your MySQL query statement below
select x,y,z,
CASE 
when x+y>z
and x+z>y
and y+z>x
THEN 'Yes'
ELSE 'No'
END AS triangle
from Triangle