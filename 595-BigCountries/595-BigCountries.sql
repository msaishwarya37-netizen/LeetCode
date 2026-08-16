-- Last updated: 8/16/2026, 12:33:09 PM
# Write your MySQL query statement below
select name,population,area
from World
where area>=3000000
or population>=25000000;