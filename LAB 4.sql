create database student_master_22030401031

use student_master_22030401031

create table student
(
	Enrollment_No VARCHAR(20),
	Name VARCHAR(20),
	CPI DECIMAL(5,2),
	Birthdate DATETIME
)


select * from student

-- From the above given table perform the following queries using ALTER statement:-- 1. Add two more columns City VARCHAR (20) NULL and Backlog INT NOT NULL.
alter table student add City VARCHAR(20) null, Backlog INT not null 
-- 2. Change the size of NAME column of student from VARCHAR (25) to VARCHAR (35).
alter table student alter column Name VARCHAR(35)
-- 3. Change the data type DECIMAL to INT in CPI Column.
alter table student alter column CPI int
-- 4. Rename Column Enrollment No to ENO.
sp_rename 'Student.Enrollment_No', 'ENO', 'column'
-- 5. Delete Column City from the STUDENT table.
alter table student drop column City
-- 6. Change name of table STUDENT to STUDENT_MASTER.
sp_rename 'Student', 'Student_master'
-- 7. Remove Column Backlog from the table.
alter table Student_master drop column Backlog
-- 8. Change Constraint of Name Column from NULL to NOT NULL.
alter table Student_master alter column Name VARCHAR(25) not null
-- 9. Rename Column Birthdate to BDate.
sp_rename 'Student_master.Birthdate', 'BDate', 'column'
-- 10. Change the datatype of ENO Column from VARCHAR (20) to VARCHAR (12)
alter table Student_master alter column ENO VARCHAR(12)
