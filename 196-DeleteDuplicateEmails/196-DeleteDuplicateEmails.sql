-- Last updated: 8/16/2026, 12:34:01 PM
delete p1
from Person p1
join person p2
on p1.email=p2.email
and p1.id>p2.id;