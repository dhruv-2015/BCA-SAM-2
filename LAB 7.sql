create database lab7
use lab7


-- 1. Write a query to display the current date & time. Label the column Today_Date.
select GETDATE()
-- 2. Write a query to find new date after 365 day with reference to today.
select GETDATE() + 365
-- 3. Display the current date in a format that appears as may 5 1994 12:00AM.
select CONVERT(varchar(30), getdate())
-- 4. Display the current date in a format that appears as 03 Jan 1995.
select CONVERT(varchar(30), getdate(), 106)
-- 5. Display the current date in a format that appears as Jan 04, 96.
select CONVERT(varchar(30), getdate(), 7)
-- 6. Write a query to find out total number of months between 31-Dec-08 and 31-Mar-09.
SELECT DATEDIFF(MONTH, '2008-12-31', '2009-03-31')
-- 7. Write a query to find out total number of years between 25-Jan-12 and 14-Sep-10.
SELECT DATEDIFF(YEAR, '2012-01-25', '2010-09-14')
-- 8. Write a query to find out total number of hours between 25-Jan-12 7:00 and 26-Jan-12 10:30.
SELECT DATEDIFF(HOUR, '2012-01-25 7:00', '2012-01-26 10:30')
-- 9. Write a query to extract Day, Month, Year from given date 12-May-16.
SELECT DAY('2016-05-12')[DAY], MONTH('2016-05-12')[MONTH], YEAR('2016-05-12')[YEAR]
-- 10. Write a query that adds 5 years to current date.
SELECT DATEADD(YEAR, 5, GETDATE())
-- 11. Write a query to subtract 2 months from current date.
SELECT DATEADD(MONTH,-2, GETDATE())
-- 12. Extract month from current date using datename () and datepart () function.
SELECT datename(MONTH, getdate())[getdate], DATEPART(MONTH, getdate())[datepart]
-- 13. Write a query to find out last date of current month.
select EOMONTH(GETDATE(), -2)
-- 14. Write a query to display date & time after 30 days from today.
SELECT DATEADD(DAY, 30, GETDATE())
-- 15. Calculate your age in years and months.
SELECT DATEDIFF(YEAR, '2004-12-14', getdate())[YEAR], DATEDIFF(MONTH, '2004-12-14', getdate())[MONTH]


-- 1. Find total number of students.
select COUNT(Sid) from Student_Marks
-- 2. Find total of marks scored by all students.
select SUM(Marks) from Student_Marks
-- 3. Find average marks of all students.
select avg(Marks) from Student_Marks
-- 4. Find minimum marks scored from all students.
select MIN(Marks) from Student_Marks
-- 5. Find maximum marks scored from all students.
select MAX(Marks) from Student_Marks