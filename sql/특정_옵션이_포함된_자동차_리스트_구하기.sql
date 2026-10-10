-- create
CREATE TABLE CAR_RENTAL_COMPANY_CAR (
  CAR_ID integer not null,
  CAR_TYPE varchar(255) not null,
  DAILY_FEE integer not null,
  OPTIONS varchar(255) not null
);

-- insert
INSERT INTO EMPLOYEE VALUES (0001, 'Clark', 'Sales');
INSERT INTO EMPLOYEE VALUES (0002, 'Dave', 'Accounting');
INSERT INTO EMPLOYEE VALUES (0003, 'Ava', 'Sales');

select *
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like "%네비게이션%";
