# Write your MySQL query statement below
select w.id from Weather as w join Weather as w1
on
date_sub(w.recordDate,interval 1 day)=w1.recordDate
where w.temperature >w1.temperature;