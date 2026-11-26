USE iths_lab_felix_lab2;


SELECT concat(e.first_name, ' ', e.last_name) AS full_name, s.name
FROM employees as e
INNER JOIN section AS s ON e.section_name = s.name;

SELECT s.name, concat(e.first_name, ' ', e.last_name) AS full_name
FROM section AS s
LEFT JOIN employees AS e ON e.section_name = s.name;