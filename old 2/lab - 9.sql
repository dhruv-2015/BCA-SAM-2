create database lab_9
use lab_9
--1. Display name of students who is either in Computer or in Electrical.
	Select name from Computer union Select name from Electrical 
--2. Display name of students who is either in Computer or in Electrical including duplicate data.
	Select name from Computer union all Select name from Electrical 
--3. Display name of students who is in both Computer and Electrical.
	Select name from Computer intersect Select name from Electrical 
--4. Display name of students who are in Computer but not in Electrical.
	Select name from Computer except Select name from Electrical 
--5. Display name of students who are in Electrical but not in Computer.
	Select name from Electrical except Select name from Computer 
--6. Display all the details of students who are either in Computer or in Electrical.
	Select * from Computer union Select * from Electrical
--7. Display all the details of students who are in both Computer and Electrical.
	Select * from Computer intersect Select * from Electrical
	--Select Into
--1. Create table World cup from cricket with all the columns.
	select * into world_cup from Cricket
	select * from world_cup
--2. Create table T20 from cricket with first two columns with no data.
	select name,city into T20 from Cricket where 1 = 2
	select * from T20
--3. Create table IPL From Cricket with No Data
	select * into Ipl from Cricket 
	select * from Ipl
--4. Insert the Data into IPL from Cricket Whose Second Character Should Be ‘A’ And String Should Have At least 7 Characters in Cricket Name Field.
	insert into Ipl select * from cricket where name like '_A_____%'
	select * from Ipl
--5. Delete All the Rows From IPL.
	delete from Ipl
	select * from Ipl
--6. Delete the Detail of Cricketer Whose City is Jharkhand.
	delete from Cricket where city = 'Jharkhand'
	select * from Cricket
--7. Rename the Table IPL to IPL2018.
	sp_rename 'Ipl','Ipl2018'
	select * from Ipl2018
--8. Destroy table T20 with All the Data
	drop table T20