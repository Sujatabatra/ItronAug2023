create database itrontraining;

use itrontraining;

create table employee(
eId int primary key,
eName varchar(30),
designation varchar(20),
department varchar(30),
salary double);

insert into employee values(1,"AAAA","Associate","Sales",35000),
(2,"BBBB","Manager","IT",175000),
(3,"CCCC","Director","IT",585000),
(4,"DDDD","Sr. Associate","Sales",75000),
(5,"EEEE","Sr. Manager","HR",230000);

select * from employee;