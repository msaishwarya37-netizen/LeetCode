-- Last updated: 8/16/2026, 12:32:12 PM
# Write your MySQL query statement below
select distinct viewer_id as id
from Views
where author_id=viewer_id
Order by viewer_id asc;