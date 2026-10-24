# Write your MySQL query statement below
select Email
from Person
# where count(email)>1
group by email
having count(Email)>1
;