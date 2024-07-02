# Write your MySQL query statement below
Select unique_id ,name from Employees  left join  EmployeeUni on Employees.id=EmployeeUni.id;