create table FISH_INFO
(
  ID integer not null,
  FISH_TYPE integer not null,
  LENGTH float,
  TIME date not null
);

insert into FISH_INFO
values
(0, 0, 30, "2021-12-04"),
(1, 0, 50, "2020-03-07"),
(2, 0, 40, "2020-03-07");

select count(ID) as FISH_COUNT, dayofmonth(TIME) as MONTH
from FISH_INFO
group by dayofmonth(TIME)
having count(ID) > 0

order by dayofmonth(TIME);
