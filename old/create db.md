# DBMS

## LAB 1

1 Create Database

```sql
create database bank_info
```

2 Swetch/Use that data base

```sql
use bank_info
```

3 Create Tables

```sql
create table deposit 
(
	actno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2),
	adate datetime
)
```

```sql
create table branch 
(
	bname varchar(50),
	city varchar(50)
)
```

```sql
create table customers
(
	cname varchar(50),
	city varchar(50)
)
```

```sql
create table borrow
(
	loanno int,
	cname varchar(50),
	bname varchar(50),
	amount decimal(8,2)
)
```