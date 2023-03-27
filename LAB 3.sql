-- Create Database
CREATE DATABASE student_22030401031
-- Use Database
USE student_22030401031

-- Create table
CREATE TABLE Student 
(
	StuID int,
	FirstName VARCHAR(25),
	LastName VARCHAR(25),
	Website VARCHAR(50),
	City VARCHAR(25),
	Division VARCHAR(20)
)

-- Insert Data 
INSERT INTO Student VALUES 
(1011, 'Keyur', 'Patel', 'techonthenet.com', 'Rajkot', 'II-BCX')
INSERT INTO Student VALUES 
(1022, 'Hardik', 'Shah', 'digminecraft.com', 'Ahmedabad', 'I-BCY')
INSERT INTO Student VALUES 
(1033, 'Kajal', 'Trivedi', 'bigactivities.com', 'Baroda', 'IV-DCX')
INSERT INTO Student VALUES 
(1044, 'Bhoomi', 'Gajera', 'checkyourmath.com', 'Ahmedabad', 'III-DCW')
INSERT INTO Student VALUES 
(1055, 'Harmit', 'Mitel', null, 'Rajkot', 'II-BCY')
INSERT INTO Student VALUES 
(1066, 'Ashok', 'Jani', null, 'Baroda', 'II-BCZ')

select * from Student

-- 1. Display the name of students whose name starts with �k�.
SELECT FirstName FROM Student where FirstName like 'k%'
-- 2. Display the name of students whose name consists of five characters.
SELECT FirstName FROM Student where FirstName like '_____'
-- 3. Retrieve the first name & last name of students whose city name ends with a & contains six characters.
SELECT FirstName, LastName from Student where City like '%a' and City like '______'
-- OR
SELECT FirstName, LastName from Student where City like '_____a'
-- 4. Display all the students whose last name ends with �tel�.
SELECT LastName FROM Student where LastName like '%tel'
-- 5. Display all the students whose first name starts with �ha� & ends with �t�.
SELECT FirstName FROM Student where FirstName like 'ha%t'
-- 6. Display all the students whose first name starts with �k� and third character is �y�.
SELECT FirstName FROM Student where FirstName like 'k_y%'
-- 7. Display the name of students having no website and name consists of five characters.
SELECT FirstName FROM Student where Website is NULL and FirstName like '_____'
-- 8. Display all the students whose last name consists of �jer�.
SELECT * FROM Student where LastName like '%jer%'
-- 9. Display all the students whose city name starts with either �r� or �b�.
SELECT * FROM Student where City like 'r%' or City like 'b%'
-- 10. Display all the name students having websites.
SELECT * FROM Student where Website is not null
-- 11. Display all the students whose name starts from alphabet A to H.
SELECT * FROM Student where FirstName like '[A-H]%'
-- 12. Display all the students whose name�s second character is vowel.
SELECT * FROM Student where FirstName like '_[a,e,i,o,u]%'
-- 13. Display student’s name whose city name consist of ‘rod’.
SELECT FirstName FROM Student where City like '%rod%'
-- 14. Retrieve the First & Last Name of students whose website name starts with ‘bi’.
SELECT FirstName, LastName FROM Student where Website like 'bi%'
-- 15. Display student’s city whose last name consists of six characters.
SELECT City FROM Student where LastName like '______'
-- 16. Display all the students whose city name consist of five characters & not start with ‘ba’.
SELECT * FROM Student where City like '_____' and City not like 'ba%'
-- 17. Show all the student’s whose division starts with ‘II’.
SELECT * FROM Student where Division like 'II%'
-- 18. Find out student’s first name whose division contains ‘bc’ anywhere in division name.
SELECT FirstName FROM Student where Division like '%bc%'
-- 19. Show student id and city name in which division consist of six characters and having website name.
SELECT StuID, City FROM Student where Division like '______' and Website is not null
-- 20. Display all the students whose name’s third character is consonant.
SELECT * FROM Student where FirstName not like '__[A,E,I,O,U]%'