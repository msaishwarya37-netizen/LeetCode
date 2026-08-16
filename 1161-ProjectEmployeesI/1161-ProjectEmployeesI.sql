-- Last updated: 8/16/2026, 12:32:23 PM
select p.project_id,round(avg(e.experience_years),2) as average_years
from project p
join employee e
on p.employee_id=e.employee_id
group by p.project_id;
