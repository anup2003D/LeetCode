# Write your MySQL query statement below
with new_sales as (select s.sale_id, p.product_name, s.year, s.price
from Sales s
join Product p
on s.product_id=p.product_id
group by s.sale_id, s.year)

select product_name, year, price from new_sales