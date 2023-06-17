SELECT e1.EmpId, e1.FullName
FROM Employee e1
JOIN Employee e2 on e1.ManagerId = e2.EmpId