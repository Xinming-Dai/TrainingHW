SELECT FullName, Salary
FROM Employee
JOIN Salary on Employee.EmpId = Salary.EmpId
WHERE month(DateOfJoining) = 1