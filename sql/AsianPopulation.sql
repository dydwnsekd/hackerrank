SELECT SUM(ct.population)
FROM city as ct
JOIN country as co on ct.countrycode = co.code WHERE co.CONTINENT = 'Asia';