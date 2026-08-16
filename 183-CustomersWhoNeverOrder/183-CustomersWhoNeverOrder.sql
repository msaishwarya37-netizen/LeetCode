-- Last updated: 8/16/2026, 12:34:03 PM
select c.name as Customers
from Customers c
left join Orders o
on c.id=o.customerId
where  o.customerId is NULL;