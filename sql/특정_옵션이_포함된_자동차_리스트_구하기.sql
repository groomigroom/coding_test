-- create
CREATE TABLE CAR_RENTAL_COMPANY_CAR (
  CAR_ID integer not null,
  CAR_TYPE varchar(255) not null,
  DAILY_FEE integer not null,
  OPTIONS varchar(255) not null
);

-- insert
INSERT INTO CAR_RENTAL_COMPANY_CAR
VALUES
(1, "세단", 16000, "가죽시트,열선시트,후방카메라"),
(1, "세단", 16000, "가죽시트,열선시트,후방카메라"),

select *
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like "%네비게이션%";
