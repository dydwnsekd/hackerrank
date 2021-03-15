SELECT id, age, coins_needed, power
FROM wands
JOIN wands_property
ON wands.code = wands_property.code
WHERE is_evil = 0
ORDER BY power DESC, age DESC;