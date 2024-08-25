SELECT * FROM Cinema 
WHERE description Not Like 'boring%' 
AND id%2 != 0 
ORDER BY rating DESC;
