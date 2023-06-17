SELECT FullName
FROM 
	(SELECT FullName, IF(Salary IS NOT NULL, Salary, 0) AS Salary
	FROM Employee
	LEFT JOIN Salary on Employee.EmpId = Salary.EmpId) 
    as employee_salary
WHERE Salary = 0
