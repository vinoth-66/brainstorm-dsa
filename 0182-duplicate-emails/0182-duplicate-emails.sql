# Write your MySQL query statement below

select distinct(p.email) as Email from Person p
left join person e
on p.email=e.email
where p.email=e.email and p.id<>e.id;