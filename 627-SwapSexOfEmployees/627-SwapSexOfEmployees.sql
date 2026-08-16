-- Last updated: 8/16/2026, 12:32:54 PM
# Write your MySQL query statement below
update Salary
set sex= case
when sex='m' then 'f'
when sex='f' then 'm'
end;