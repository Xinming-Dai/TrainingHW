SELECT Project, COUNT(EmpId) AS Count
FROM Salary
GROUP BY Project
ORDER BY Count DESC