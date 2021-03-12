SELECT country.continent, TRUNCATE(AVG(city.population), 0)
FROM city
JOIN country
ON country.code = city.countrycode
GROUP BY country.continent;