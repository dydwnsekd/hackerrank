SELECT DISTINCT(CITY) FROM STATION
WHERE CITY REGEXP "^[^AEIOU]"
OR CITY REGEXP "[^aeiou]$";