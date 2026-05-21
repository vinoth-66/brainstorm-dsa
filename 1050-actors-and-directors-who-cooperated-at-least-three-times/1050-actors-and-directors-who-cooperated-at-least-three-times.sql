# Write your MySQL query statement below
select A.actor_id, A.director_id from ActorDirector A
group by A.actor_id, A.director_id
having count(*)>=3