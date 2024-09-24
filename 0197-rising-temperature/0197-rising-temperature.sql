# Write your MySQL query statement below
#select w1.id from weather w1 self join weather w2 on w1.temperature>w2.temperature;
SELECT w1.id
FROM weather w1
JOIN weather w2 ON w1.recordDate = DATE_ADD(w2.recordDate, INTERVAL 1 DAY)
WHERE w1.temperature > w2.temperature;
