select round(avg(DAILY_FEE), 0) as AVERAGE_FEE
from CAR_RENTAL_COMPANY_CAR
where CAR_TYPE = "SUV";
-- 소수점 이하 1번째자리에서 반올림
