SELECT * FROM Cinema 
WHERE description NOT LIKE 'boring%' 
AND MOD(id, 2) != 0 
ORDER BY rating DESC;
