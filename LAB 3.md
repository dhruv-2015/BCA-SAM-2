# DBMS

## LAB 3

##### Create Database

```sql 
CREATE DATABASE student_22030401031
```
##### Use Database
```sql
USE student_22030401031
```
##### Create Table
```sql
CREATE TABLE Student 
(
 StuID int,
 FirstName VARCHAR(25),
 LastName VARCHAR(25),
 Website VARCHAR(50),
 City VARCHAR(25),
 Division VARCHAR(20)
)
```

##### Insert Data
```sql
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
(1055, 'Ashok', 'Jani', null, 'Baroda', 'II-BCZ')
```

##### Query

1 Display the name of students whose name starts with �k�.
```sql
SELECT FirstName FROM Student where FirstName like 'k%'
```
2 Display the name of students whose name consists of five characters.
```sql
SELECT FirstName FROM Student where FirstName like '_____'
```
3 Retrieve the first name & last name of students whose city name ends with a & contains six characters.
```sql
SELECT FirstName, LastName from Student where City like '%a' and City like '______'
```
4 Display all the students whose last name ends with �tel�.
```sql
SELECT LastName FROM Student where LastName like '%tel'
```
5 Display all the students whose first name starts with �ha� & ends with �t�.
```sql
SELECT FirstName FROM Student where FirstName like 'ha%t'
```
6 Display all the students whose first name starts with �k� and third character is �y�.
```sql
SELECT FirstName FROM Student where FirstName like 'k_y%'
```
7 Display the name of students having no website and name consists of five characters.
```sql
SELECT FirstName FROM Student where Website is NULL and FirstName like '_____'
```
8 Display all the students whose last name consists of �jer�.
```sql
SELECT * FROM Student where LastName like '%jer%'
```
9 Display all the students whose city name starts with either �r� or �b�.
```sql
SELECT * FROM Student where City like 'r%' or City like 'b%'
```
10 Display all the name students having websites.
```sql
SELECT * FROM Student where Website is not null
```
11 Display all the students whose name starts from alphabet A to H.
```sql
SELECT * FROM Student where FirstName like '[A-H]%'
```

12 Display all the students whose name�s second character is vowel.
```sql

```
13 Display student�s name whose city name consist of �rod�.
```sql

```
14 Retrieve the First & Last Name of students whose website name starts with �bi�.
```sql

```
15 Display student�s city whose last name consists of six characters.
```sql

```
16 Display all the students whose city name consist of five characters & not start with �ba�.
```sql

```
17 Show all the student�s whose division starts with �II�.
```sql

```
18 Find out student�s first name whose division contains �bc� anywhere in division name.
```sql

```
19 Show student id and city name in which division consist of six characters and having website name.
```sql

```
20 Display all the students whose name�s third character is consonant.
```sql

```