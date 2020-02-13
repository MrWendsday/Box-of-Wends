CREATE DATABASE mydatabase_demo;

create table supplier	
(
sup_id int PRIMARY KEY AUTO_INCREMENT,
firstname varchar(100) not NULL DEFAULT('pending'),
phone int UNIQUE, 
address varchar(200)
);

create table supplier_two
(
sup_id int PRIMARY KEY AUTO_INCREMENT,
firstname varchar(100) not NULL DEFAULT('pending'),
phone int UNIQUE,
address VARCHAR(200),
ssn int,
driv_lic_num int,
CONSTRAINT ssndiv UNIQUE (firstname,ssn, driv_lic_num) -- Combining multiple columns into a  
); 

create table client_info (
client_id int PRIMARY KEY AUTO_INCREMENT,
firstName varchar(100) not NULL,
userName varchar(100) UNIQUE,
passwords varchar(100) UNIQUE,
createdDate DATE
);

create table author (
autID int PRIMARY KEY AUTO_INCREMENT,
name varchar(100),
auth_status varchar(5)
);

create table my_resource (
resID int PRIMARY KEY AUTO_INCREMENT,
isbn int UNIQUE,
res_name varchar(100),
authorID int not NULL,
sup_id int not NULL,
price decimal check(price >= 5.00),
CONSTRAINT fk_author FOREIGN KEY(authorID)
	REFERENCES author(autID),
CONSTRAINT fk_supp FOREIGN KEY(sup_id)
	REFERENCES supplier_two(sup_id)	
);

INSERT into author (name, auth_status) VALUES
('haseeb', 'app'),
(' ', ' '),