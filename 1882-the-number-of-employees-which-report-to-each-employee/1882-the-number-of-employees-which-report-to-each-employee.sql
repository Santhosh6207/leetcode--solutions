# Write your MySQL query statement below
select e.employee_id,e.name,count(*) as reports_count,round(avg(w.age)) as average_age from employees e join employees w on e.employee_id=w.reports_to
group by e.employee_id order by e.employee_id;