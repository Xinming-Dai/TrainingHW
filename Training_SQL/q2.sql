SELECT FullName
FROM Employee
JOIN Salary on Employee.EmpId = Salary.EmpId
WHERE Salary >= 500 and Salary <= 1000