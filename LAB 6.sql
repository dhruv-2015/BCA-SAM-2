create database lab6
use lab6

-- Math functions --

-- 1. Display the result of 5 multiply by 30.
select 5 * 30 [mul], 5 + 7 [add]
-- 2. Find out the absolute value of -25, 25, -50 and 50.
select abs(-25), abs(25), abs(-50), abs(50)
-- 3. Find smallest integer value that is greater than or equal to 25.2, 25.7 and -25.2.
select ceiling(25.5), ceiling(25.7), ceiling(-25.2)
-- 4. Find largest integer value that is smaller than or equal to 25.2, 25.7 and -25.2.
select floor(25.2), floor(25.7), floor(-25.2)
-- 5. Find out remainder of 5 divided 2 and 5 divided by 3.
select 5 % 2[5 divided 2], 5 % 3 [5 divided 3]
-- 6. Find out value of 3 raised to 2nd power and 4 raised 3rd power.
select POWER(3, 2), POWER(4, 3)
-- 7. Find out the square root of 25, 30 and 50.  -- SQRT() for square root
select SQRT(25)[25], SQRT(30)[30], SQRT(50)[50]
-- 8. Find out the square of 5, 15, and 25.  -- SQUARE() for SQUARE
select SQUARE(5)[5], SQUARE(15)[15], SQUARE(25)[25]
-- 9. Find out the value of PI.  -- pi() for pi
select PI()[pi]
-- 10. Find out round value of 157.732 for 2, 0 and -2 decimal points.
select round(157.7165332, 2)
select round(157.7165332, 0)
select round(157.7165332, -2)
-- 11. Find out exponential value of 2 and 3
select exp(2), exp(3)
-- 12. Find out logarithm having base b having value 10 of 5 and 100.
select LOG10(5), LOG10(100)
-- or
select log(5, 10), log(100, 10)  -- log(value, base)
-- 13. Find sine, cosine and tangent of 3.1415.
select sin(3.1415)[sign], cos(3.1415)[cos], tan(3.1415)[tan]
-- or
select sin(pi())[sign], cos(pi())[cos], tan(pi())[tan]
-- 14. Find sign of -25, 0 and 25.
select sign(-25), sign(0), sign(25)  -- check number is positive, negitive or zero
-- 15. Generate random number using function.select rand() * 100




-- String --

-- 1. Find the length of following. (I) NULL (II) ‘ hello ’ (III) Blank
select len(NULL) [I], len('hello')[II], len('')[III]
-- 2. Display your name in lower & upper case.
select UPPER('Dhruv Chadasaniya')[upper], LOWER('Dhruv Chadasaniya')[lower]
-- 3. Display first three characters of your name.
select SUBSTRING('Dhruv Chadasaniya',1,3)
-- 4. Display 3rd to 10th character of your name.
select SUBSTRING('Dhruv Chadasaniya',3,8)
-- 5. Write a query to convert ‘abc123efg’ to ‘abcXYZefg’ & ‘abcabcabc’ to ‘ab5ab5ab5’ using REPLACE.
select REPLACE('abc123efg', '123', 'XYZ'), REPLACE('abcabcabc', 'c', '5')
-- 6. Write a query to display ASCII code for ‘a’,’A’,’z’,’Z’, 0, 9.
select ASCII('a')[a], ASCII('A')[A], ASCII('z')[z], ASCII('Z')[Z], ASCII(0)[0], ASCII(9)[9], ASCII('0')['0'], ASCII('9')['9']
-- 7. Write a query to display character based on number 97, 65,122,90,48,57.
select char(97)[97], char(65)[65], char(122)[122], char(90)[90], char(48)[48], char(57)[57] 
-- 8. Write a query to remove spaces from left of a given string ‘hello world ‘.
select LTRIM(' hello world ')[ hello world ]
-- 9. Write a query to remove spaces from right of a given string ‘ hello world ‘.
select RTRIM(' hello world ')[ hello world ]
-- 10. Write a query to display first 4 & Last 5 characters of ‘SQL Server’. 
select LEFT('SQL Server', 4)[LEFT 4], RIGHT('SQL Server', 5)[RIGHT 5] -- for first char use LEFT and for last char use Right
-- 11. Write a query to convert a string ‘1234.56’ to number (Use CAST()).
select CAST('1234.56' as float)
-- 12. Write a query to convert a float 10.58 to integer (Use CONVERT()).
select CONVERT(int, 10.58)
-- select CONVERT(int, CAST('1234.56' as float))
-- 13. Put 10 space before your name using function.
select space(10) + 'Dhruv'
-- 14. Combine two strings (Your name & Surname) using + sign as well as CONCAT ().
select 'Dhruv ' + 'Chadasaniya', CONCAT('Dhruv', ' ', 'Chadasaniya')
-- 15. Find reverse of “Darshan”.
select REVERSE('Darshan')
-- 16. Repeat your name 3 times.
select REPLICATE('Dhruv ', 3)
-- 17. Delete 3 characters from a string, starting in position 1, and then insert "HTML" in position 1. (Use STUFF())
select STUFF('SQL Server', 1,3,'HTML')  -- STUFF('string', starting index, no of char, 'new value') replace firs 3 char with HTML
-- 18. From Data, returns the first non-null value in a list. (Use COALESCE())
select coalesce(NULL, NULL, '123', 'Dhruv',NULL, 123)
-- 19. Tests whether the expression is numeric. (Use ISNUMERIC())
select ISNUMERIC('a')[a], ISNUMERIC('15')[15] 
-- 20. Search for "t" in string "Customer", and return its position. (Use CHARINDEX())
select CHARINDEX('h','dhruv')