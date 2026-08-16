-- Last updated: 8/16/2026, 12:33:10 PM
# Write your MySQL query statement below
select customer_number
from Orders 
group by customer_number
ORDER BY count(customer_number)
DESC
LIMIT 1;