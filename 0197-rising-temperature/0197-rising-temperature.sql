# Write your MySQL query statement below
select c.id
from weather c
join weather p
ON DATEDIFF(c.recordDate, p.recordDate) = 1
where c.temperature>p.temperature