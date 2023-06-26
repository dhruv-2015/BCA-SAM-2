create database lab_11
use lab_11

create table Student (
	Rno int,
	Name varchar(20),
	City varchar(20),
	DID int
)

create table Academic (
	Rno int,
	SPI decimal(4,2),
	Bklog int
)



create table Department (
	DID int,
	DName varchar(20)
)


insert into Student values (101, 'Raju', 'Rajkot', 10)
insert into Student values (102, 'Amit', 'Ahmedabad', 20)
insert into Student values (103, 'Sanjay', 'Baroda', 40)
insert into Student values (104, 'Neha', 'Rajkot', 20)
insert into Student values (105, 'Meera', 'Ahmedabad', 30)
insert into Student values (106, 'Mahesh', 'Baroda', 10)

select * from Student

insert into Academic values (101, 8.8, 0)
insert into Academic values (102, 9.2, 2)
insert into Academic values (103, 7.6, 1)
insert into Academic values (104, 8.2, 4)
insert into Academic values (105, 7.0, 2)
insert into Academic values (106, 8.9, 3)

select * from Academic


insert into Department values (10 , 'Computer')
insert into Department values (20 , 'Electrical')
insert into Department values (30 , 'Mechanical')
insert into Department values (40 , 'Civil')

select * from Department



-- 1. Display details of students who are from computer department.
select * from Student where DID = (select DID from Department where DName = 'Computer')
-- 2. Display name of students whose SPI is more than 8.
select Name from Student where Rno in (select Rno from Academic where SPI > 8)
-- 3. Display details of students of computer department who belongs to Rajkot city.
select * from Student where City = 'Rajkot' and DID = (select DID from Department where DName = 'Computer')
-- 4. Find total number of students of electrical department.
select COUNT(Rno) from Student where DID = (select DID from Department where DName = 'Electrical')
--5. Display name of student who is having maximum SPI.
select Name from Student where Rno = (select Rno from Academic where SPI = (select MAX(SPI) from Academic))
--6. Display details of students having more than 1 backlog.
select * from Student where Rno in (select Rno from Academic where Bklog > 1)
--7. Display name of student who is having second highest SPI.
select Name from Student where Rno = ( select Rno from Academic where SPI = (select MAX(SPI) from Academic where SPI < (select MAX(SPI) from Academic))) 
--8. Display name of students who are either from computer department or from mechanical department.
select Name from Student where DID in ( select DID from Department where DName = 'Computer' or DName = 'Mechanical')
--9. Display name of students who are in same department as 102 studying in.
select Name from Student where DID = (select DID from Student where Rno = 102)
--10. Display name of students whose SPI is more than 9 and who is from electrical department.
select Name from Student where 
DID = (select DID from Department where DName = 'Electrical') and
Rno = (select Rno from Academic where SPI > 9)