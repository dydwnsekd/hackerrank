SELECT ROUND(long_w, 4) FROM station WHERE lat_n = (SELECT MAX(LAT_N) FROM STATION WHERE LAT_N<137.2345);