USE employee_information;

SELECT Project, COUNT(EmpId) AS Count
FROM Salary
WHERE Project = 'p1'