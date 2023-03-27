create database dhruv_22030401031

use dhruv_22030401031

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


select * from deposit
select * from branch
select * from customers
select * from borrow
