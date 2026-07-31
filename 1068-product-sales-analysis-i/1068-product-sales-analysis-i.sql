# Write your MySQL query statement below
select 
t1.product_name ,t2.year,t2.price
from 
Product t1
inner join 
Sales t2 
on
t1.product_id =t2.product_id ;
