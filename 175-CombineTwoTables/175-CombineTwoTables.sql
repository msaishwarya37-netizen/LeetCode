-- Last updated: 8/16/2026, 12:34:14 PM
select
p.firstname,
p.lastname,
a.city,
a.state
from Person p
left join address a
on p.personId=a.personId;
