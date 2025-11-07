select distinct w.id from weather w join weather s on w.id!=s.id and
 w.temperature>s.temperature and DATEDIFF( w.recorddate, s.recorddate)=1 
