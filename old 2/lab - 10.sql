create database lab_10
use lab_10
--1. Combine information from student and result table using cross join or Cartesian product.
	Select * from Student cross join Result
-- or
	Select * from Student,Result
--2. Display Rno, Name, Branch and SPI of CE branch’s student only.
	Select Student.Rno,Student.Name,Student.Branch,Result.SPI From Student left outer join Result 
	on Student.Rno = Result.Rno 
	where Branch = 'CE'
--3. Display Rno, Name, Branch and SPI of other than EC branch’s student only.
	Select Student.Rno,Student.Name,Student.Branch,Result.SPI from Student left outer join Result
	on Student.Rno = Result.Rno
	where Branch <> 'EC'
--4. Display average result of each branch.
	Select Student.Branch , avg(Result.SPI) from Student inner join Result
	on Student.Rno = Result.Rno
	Group by Student.Branch
--5. Display average result of each branch and sort them in ascending order by SPI.
	Select Student.Branch , avg(Result.SPI) from Student inner join Result
	on Student.Rno = Result.Rno
	Group by Student.Branch
	Order by AVG(Result.SPI)
--6. Display average result of CE and ME branch.
	Select Student.Branch , avg(Result.SPI) from Student inner join Result
	on Student.Rno = Result.Rno
	Group by Student.Branch
	Having Student.Branch in('CE','ME')
	-- Having Student.Branch ='CE' or Student.Branch = 'ME'
--7. Perform the left outer join on Student and Result tables.
	Select * from Student left outer join Result 
	on Student.Rno = Result.Rno
--8. Perform the right outer join on Student and Result tables.
	Select * from Student Right outer join Result 
	on Student.Rno = Result.Rno
--9. Perform the full outer join on Student and Result tables. 
	Select * from Student full outer join Result 
	on Student.Rno = Result.Rno
--10. Retrieve the names of employee along with their manager’s name from the Employee table.
	Select E.name as Employee_name ,M.Name as manager_name From Employee E left outer join Employee M
	on E.ManagerNo = M.EmployeeNo

--1. Display all the villages of Rajkot city. 
--2. Display city along with their villages & pin code.
--3. Display the city having more than one village.
--4. Display the city having no village.
--5. Count the total number of villages in each city.
--6. Count the number of cities having more than one village