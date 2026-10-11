select count(ID), dayofmonth(TIME) as MONTH
from FISH_INFO
group by dayofmonth(TIME)
having count(ID) > 0

order by dayofmonth(TIME);
