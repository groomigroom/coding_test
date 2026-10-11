create table FISH_INFO
(
  ID integer not null,
  FISH_TYPE integer not null,
  LENGTH float,
  TIME date not null
);

select count(ID), dayofmonth(TIME) as MONTH
from FISH_INFO
group by dayofmonth(TIME)
having count(ID) > 0

order by dayofmonth(TIME);
