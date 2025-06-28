# Write your MySQL query statement below
select score, DENSE_Rank() over (order by score desc) AS `rank` from Scores order by score desc;
