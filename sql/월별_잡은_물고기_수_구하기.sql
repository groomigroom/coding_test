select FISH_COUNT, dayofmonth(TIME) as MONTH
from FISH_INFO
group by dayofmonth(TIME)
order by dayofmonth(TIME);
