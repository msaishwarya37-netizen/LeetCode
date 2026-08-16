-- Last updated: 8/16/2026, 12:33:06 PM
# Write your MySQL query statement below
select s.name
from SalesPerson s
where s.sales_id NOT IN(
    select o.sales_id
    from Orders o
    join Company c
    on c.com_id=o.com_id
    where c.name='RED'
);