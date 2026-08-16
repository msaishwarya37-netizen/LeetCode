-- Last updated: 8/16/2026, 12:34:00 PM
select w1.id
from Weather w1
join Weather w2
on DATEDIFF(w1.recordDate,w2.recordDate)=1
where w1.temperature>w2.temperature;