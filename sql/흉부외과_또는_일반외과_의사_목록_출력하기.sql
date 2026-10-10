select DR_NAME, DR_ID, MCDP_CD, date_format(HIRE_YMD, "%Y-%m-%d") as HIRE_YMD
from DOCTOR
order by HIRE_YMD desc, DR_NAME;
