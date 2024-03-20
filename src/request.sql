SELECT Employees.Name, Departments.DepartmentName
FROM Employees
         JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID;

SELECT Departments.DepartmentName, MAX(Employees.Salary) AS MaxSalary
FROM Employees
         JOIN Departments ON Employees.DepartmentID = Departments.DepartmentID
GROUP BY Departments.DepartmentName;
