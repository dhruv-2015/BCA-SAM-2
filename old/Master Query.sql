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
-- 18. Display all the details of first three depositors whose amount is greater than 1000.
-- 19. Display Loan No, Customer Name of first five borrowers whose branch name does not belongs to ‘ANDHERI’.