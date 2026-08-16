-- Last updated: 8/16/2026, 12:34:06 PM

select email
from Person
group by email
having count(email)>1;