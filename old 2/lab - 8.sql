create database lab_8
use lab_8
select * from Employee
--1. Display the Highest, Lowest, Total, and Average salary of all employees& label the columns Maximum, Minimum, Total_Sal and Average_Sal, respectively.
	select max(salary) [Maximum] ,
	min(salary) [Minimum],
	avg(salary) [Average_Sal],
	sum(salary) [Total_Sal]
	from Employee
--2. Find total number of employees of EMPLOYEE table.
	select COUNT(eid) from Employee
--3. Retrieve maximum salary from IT department.
	select MAX(salary) from Employee
	Group by Department
	Having Department = 'IT'
--4. Count total number of cities of employee without duplication.
	select COUNT(distinct City) from Employee
--5. Display city with the total number of employees belonging to each city.
	select city ,COUNT(City) from Employee 
	Group by City
--6. Display city having more than one employee.
	select city from Employee 
	Group by City
	having COUNT(City) > 1
--7. Give total salary of each department of EMPLOYEE table.
	select Department, sum(salary) from Employee 
	Group by Department
--8. Give average salary of each department of EMPLOYEE table without displaying the respective department name.
	select avg(salary) from Employee 
	Group by Department
--9. Give minimum salary of employee who belongs to Ahmedabad.
	select min(salary) from Employee
	Group by City
	Having City = 'Ahmedabad'
--10. List the departments having total salaries more than 50000 and located in city Rajkot.
	select Department from Employee  
	Group by Department , City
	having sum(Salary)>50000 and City = 'Rajkot'
--11. Count the number of employees living in Rajkot.
	select COUNT(EID) from Employee 
	Group by City
	Having City = 'Rajkot'
--12. Display the difference between the highest and lowest salaries. Label the column name to SAL_DIFFERENCE.
	select MAX(Salary) - MIN(Salary) from Employee [SAL_DIFFERENCE]
--13. Display the total number of employees hired before 1st January, 1991.
	select COUNT(EID) from Employee where JoiningDate < '1991-01-01'
--14. Display total salary of each department with total salary exceeding 35000 and sort the list by total salary.
	select Department, sum(salary) from Employee 
	Group by Department
	having sum(salary) > 35000
	order by sum(salary)
--15. List out department names in which more than two employees.
	select Department from Employee 
	Group by Department 
	having count(EID) > 2
--16. Display Minimum salary of Rajkot City.
	select min(salary) from Employee
	Group by City
	Having City = 'Rajkot'
--17. Display City wise total employees count.
	Select count(EID) from Employee
	Group by City
--18. List all departments with minimum salaries.
	select Department, min(salary) from Employee 
	Group by Department
--19. Give Total salaries of each city without displaying the respective city name.
	Select sum (salary) from Employee 
	Group by City
--20. Find department wise Minimum, Maximum & Total Salaries.
	select Department, min(Salary) [Minimum],max (Salary) [Maximum],Sum (Salary) [Total]from Employee 
	Group by Department