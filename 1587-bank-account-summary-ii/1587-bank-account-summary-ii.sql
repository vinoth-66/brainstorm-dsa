# Write your MySQL query statement below

select U.name,sum(T.amount) as balance from Users U
inner join Transactions T
on u.account=T.account
group by u.account, u.name
having sum(T.amount)> 10000