SELECT 
    YEAR(YM) AS YEAR, 
    ROUND(AVG(PM_VAL1), 2) AS PM10, 
    ROUND(AVG(PM_VAL2), 2) AS `PM2.5` -- 컬럼명에 마침표(.)가 들어가므로 백틱(`)으로 감싸줍니다.
FROM 
    AIR_POLLUTION
WHERE 
    LOCATION2 = '수원' -- 수원 지역 데이터만 필터링
GROUP BY 
    YEAR(YM) -- 연도별로 그룹화
ORDER BY 
    YEAR ASC; -- 연도 기준 오름차순 정렬
