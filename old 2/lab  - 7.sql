create database lab_7
use lab_7

--1. Write a query to display the current date & time. Label the column Today_Date.
	Select GETDATE() [today_date]
--2. Write a query to find new date after 365 day with reference to today.
	select GETDATE() + 365
--3. Display the current date in a format that appears as may 5 1994 12:00AM.
	select CONVERT(VARCHAR(20), GETDATE())
--4. Display the current date in a format that appears as 03 Jan 1995.
	select CONVERT(VARCHAR(12), GETDATE())
--5. Display the current date in a format that appears as Jan 04, 96.
	select FORMAT(GETDATE(), 'MMM dd, yy')
--6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
	select DATEDIFF(MONTH,'2008/12/31','2009/03/31') as dateDiff;
--7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
	select DATEDIFF(YEAR,'2010/09/14','2012/01/25') as dateDiff;
--8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-1210:30.
	select DATEDIFF(HOUR,'2012-01-25 7:00','2012-01-26 10:30') as dateDiff;
--9. Write a query to extract Day, Month, Year from given date 12-May-16.
	select MONTH('2016-05-12'),YEAR('2016-05-12'),DAY('2016-05-12')
--10. Write a query that adds 5 years to current date.
	select DATEADD(year,2,getdate())
--11. Write a query to subtract 2 months from current date.
	select DATEADD(MONTH,-2,getdate())
--12. Extract month from current date using datename () and datepart () function.
	select DATENAME(MONTH,GETDATE()) as DatePartString;
	select DATEPART(MONTH,GETDATE()) as datepartInt;
--13. Write a query to find out last date of current month.
	select EOMONTH(getdate(),-2)
--14. Write a query to display date & time after 30 days from today.
	select DATEADD(day,30,Getdate())
--15. Calculate your age in years and months.
	select DATEDIFF(year,'2004-10-29',GETDATE()) [years],DATEDIFF(MONTH,'2004-10-29',GETDATE()) [months]


--1. Find total number of students.
	select COUNT(sid) from Student_Marks
--2. Find total of marks scored by all students.
	select SUM(marks) from Student_Marks
--3. Find average marks of all students.
	select avg(marks) from Student_Marks
--4. Find minimum marks scored from all students.
	select min(marks) from Student_Marks
--5. Find maximum marks scored from all students.
	select Max(marks) from Student_Marks

	