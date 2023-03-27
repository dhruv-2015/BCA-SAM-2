create database bank_info_22030401031

use bank_info_22030401031

create table deposit 
(
	actno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2),
	adate datetime
)

create table branch 
(
	bname varchar(50),
	city varchar(50)
)

create table customers
(
	cname varchar(50),
	city varchar(50)
)

create table borrow
(
	loanno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2)
)



insert into deposit values 
(101, 'ANIL', 'VRCE', 1000, '1995-03-01')
insert into deposit values 
(102, 'SUNIL', 'AJNI', 5000, '1996-01-04')
insert into deposit values 
(103, 'MEHUL', 'KAROLBAGH', 3500, '1995-11-17')
insert into deposit values 
(104, 'MADHURI', 'CHANDI', 1200, '1995-12-17')
insert into deposit values 
(105, 'PRMOD', 'M.G. ROAD', 3000, '1995-03-27')
insert into deposit values 
(106, 'SANDIP', 'ANDHRI', 2000, '1996-03-31')
insert into deposit values 
(107, 'SHIVANI', 'VIRAR', 1000, '1995-09-05')
insert into deposit values 
(108, 'KRANTI', 'NEHRU PLACE', 5000, '1995-07-02')
insert into deposit values 
(109, 'MINU', 'POWAI', 7000, '1995-08-10')


select * from deposit


insert into branch values 
('VRCE', 'NAGPUR')
insert into branch values 
('AJNI', 'NAGPUR')
insert into branch values 
('KAROLBAGH', 'DEHLI')
insert into branch values 
('CHANDI', 'DEHLI')
insert into branch values 
('DHARAMPETH', 'NAGPUR')
insert into branch values 
('M.G. ROAD', 'BANGLORE')
insert into branch values 
('ANDHERI', 'BOMBAY')
insert into branch values 
('VIRAR', 'BOMBAY')
insert into branch values 
('NEHRU PLACE', 'DELHI')
insert into branch values 
('POWAI', 'BOMBAY')

select * from branch



insert into customers values
('ANIL', 'CALCUTTA')
insert into customers values
('SUNIL', 'DEHLI')
insert into customers values
('MEHUL', 'BARODA')
insert into customers values
('MANDAR', 'PATNA')
insert into customers values
('MANDHURI', 'NAGPUR')
insert into customers values
('PRAMOD', 'NAGPUR')
insert into customers values
('SANDIP', 'SURAT')
insert into customers values
('SHIVANI', 'BOMBAY')
insert into customers values
('KRANTI', 'BOMBAY')
insert into customers values
('NAREN', 'BOMBAY')



select * from customers





insert into borrow values 
(201, 'ANIL', 'VRCE', 1000)
insert into borrow values 
(206, 'MEHUL', 'AJNI', 5000)
insert into borrow values 
(311, 'SUNIL', 'DHARAMPETH', 3000)
insert into borrow values 
(321, 'MADHURI', 'ANDHERI', 2000)
insert into borrow values 
(375, 'PRMOD', 'VIRAR', 8000)
insert into borrow values 
(481, 'KRANTI', 'NEHRU PLACE', 3000)


select * from borrow



-- 1. Retrieve all data from table DEPOSIT. 
select * from deposit
-- 2. Retrieve all data from table BORROW. 
select * from branch
-- 3. Retrieve all data from table CUSTOMERS.
select * from customers
-- 4. Display Account No, Customer Name & Amount from DEPOSIT
select actno,cname,amount from deposit
-- 5. Display Loan No, Amount from BORROW
select loanno,amount from borrow
-- 6. Display loan details of all customers who belongs to ‘ANDHERI’ branch.select * from borrow where bname='ANDHERI'-- 7. Give account no and amount of depositor, whose account no is equals to 106. select actno, amount from deposit where actno <> 106-- or select actno, amount from deposit where actno != 106-- 8. Give name of borrowers having amount greater than 5000. select cname from borrow where amount > 5000-- 9. Give name of customers who opened account after date '1-12-96'. select cname from deposit where adate > '1-12-96'-- 10. Display name of customers whose account no is less than 105.select cname from deposit where actno < 105-- 11. Display name of customer who belongs to either ‘NAGPUR’ Or ‘DELHI’. (OR & IN)select cname from customers where city = 'NAGPUR' or city = 'DEHLI'select cname from customers where city  in ('NAGPUR', 'DEHLI')  -- mis-- 12. Display name of customers with branch whose amount is greater than 4000 and account no is less than 105.select cname, bname from deposit where amount > 4000 and actno < 105-- 13. Find all borrowers whose amount is greater than equals to 3000 & less than equals to 8000.select * from borrow where amount >= 3000 and amount <= 8000-- 14. Find all depositors who do not belongs to ‘ANDHERI’ branch.select * from deposit where bname != 'ANDHRI'  -- mis-- 15. Display the name of borrowers whose amount is NULL.select cname from borrow where amount is null-- 16. Display Account No, Customer Name & Amount of such customers who belongs to ‘AJNI’, ‘KAROLBAGH’ Or ‘M.G. ROAD’ and Account No is less than 104.select actno, cname, amount from deposit where bname in ('AJNI', 'KAROLBAGH', 'M.G. ROAD') and actno < 104-- 17. Display all the details of first five customers.
select top 5 * from customers
-- 18. Display all the details of first three depositors whose amount is greater than 1000.
select top 3 * from deposit where amount > 1000
-- 19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI ’.
select top 5 loanno, cname from borrow where bname = 'ANDHERI'



-- 20. Retrieve all unique cities using DISTINCT. (Use Customers Table)
select DISTINCT city from customers
-- 21. Retrieve all unique branches using DISTINCT. (Use Branch Table)
select DISTINCT bname from branch
-- 22. Retrieve all the records of customer table as per their city name in ascending order.
select * from customers order by city asc
-- 23. Retrieve all the records of deposit table as per their amount column in descending order.
select * from deposit order by amount desc
-- 24. Retrieve all the details of customers in which descending order of their city name.
select * from customers order by city desc
-- 25. Show all unique borrowers& label the column UNI_Borrowers. (Display only Names)
select DISTINCT cname as UNI_Borrowers from borrow
-- OR
select DISTINCT cname [UNI_Borrowers] from borrow

use bank_info_22030401031
select * from borrow


-- LAB 2.2 From the above given tables perform the following queries using UPDATE statement: 
-- 1. Update deposit amount of all customers from 3000 to 5000.
update deposit set amount = 5000 where amount = 3000
-- 2. Change branch name of ANIL from VRCE to C.G. ROAD. (Use Borrow Table) 
update borrow set bname = 'C.G. ROAD' where cname = 'ANIL'
-- 3. Update Account No of SANDIP to 111 & Amount to 5000. 
update deposit set amount = 5000, actno = 111 where cname = 'SANDIP'
-- 4. Give 10% Increment in Loan Amount.
update borrow set amount = amount + (0.1 * amount)
-- 5. Update deposit amount of all depositors to 5000 whose account no between 103 & 107.
update deposit set amount = 5000 where actno between 103 and 107
-- 6. Update amount of loan no 321 to NULL.
update borrow set loanno = null where loanno = 321
-- 7. Change Loan number from 201 to 401 & also change its branch name from VRCE to AJNI.
update borrow set loanno = 401, bname = 'AJNI' where loanno = 201
-- 8. Modify customer name ANIL to ANIL JAIN.
update customers set cname = 'ANIL JAIN' where cname = 'ANIL'
-- 9. Change Name to Ramesh, Branch Name VRCE & Amount 5500, Whose Account Number is 102.
update deposit set cname = 'Ramesh', bname = 'VRCE', amount = 5500 where actno = 102
-- 10. Make Branch Name & Amount NULL, Whose Loan Number is 481 & Name is KRANTI.
update borrow set bname = null, amount = null where loanno = 481 and cname = 'KRANTI'


select * from borrow


-- LAB 2.3 From the above given tables perform the following queries using DELETE/DROP/TRUNCATE statement:
-- 1. Delete records of Customer table that belongs to BOMBAY City.
delete from customers where city = 'BOMBAY'
-- 3. Delete borrowers whose branch name is ‘AJNI’.
delete from borrow where bname = 'AJNI'
-- 4. Delete all the borrowers whose loan number between 201 to 210.
delete from borrow where loanno between 201 and 210
-- 5. Delete customers who opened account after date '01-DEC-96'. (Use DEPOSIT table)
delete from deposit where adate > '1996-12-01'
-- 7. Remove all customers whose name is ANIL & Account Number is 101.
delete from deposit where actno = 101 and cname = 'ANIL'
-- 8. Delete all the depositors who do not belongs to ‘ANDHERI’ branch.
delete from deposit where bname = 'ANDHRI'
-- 9. Delete all the borrowers whose loan amount is less than 2000 and does not belong to VRCE branch.
delete from borrow where amount > 2000

-- 2. Delete all account numbers whose amount less than equals to 1000.
delete deposit where amount >= 1000
-- 6. Delete all the records of Customers table. (Use TRUNCATE)
truncate table customers
-- 10. Remove Branch table. (Use DROP)
drop table branch


