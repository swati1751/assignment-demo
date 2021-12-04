show databases;
USE swatidb;
SHOW tables;
SELECT COUNT(Sname) FROM Salespeople WHERE Sname= 'A';
SELECT * FROM orders where Amt > 2000;
SELECT COUNT(Sname) FROM salespeople where City='Newyork';
SELECT Snum FROM salespeople where City='London' and City='Paris';
SELECT Onum FROM orders GROUP BY Odate ,Sname;