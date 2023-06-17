SELECT FullName
FROM Employee
GROUP BY FullName
HAVING COUNT(FullName) > 1