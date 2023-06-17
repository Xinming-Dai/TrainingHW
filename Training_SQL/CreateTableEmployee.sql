DROP DATABASE IF EXISTS `employee_information`;
CREATE DATABASE `employee_information`;
USE `employee_information`;

CREATE TABLE Employee (
	`EmpId` int NOT NULL,
    `FullName` varchar(225) NOT NULL,
    `ManagerId` int DEFAULT NULL,
    `DateOfJoining` DATE NOT NULL
);
INSERT INTO `Employee` VALUES 
	(121, 'John Snow', 321, '2014-01-31'),
    (321, 'Night King', 986, '2015-01-30'),
    (421, 'Arya Stark', 876, '2016-11-27'),
    (521, 'Sansa Stark', 876, '2017-12-02'),
    (521, 'Sansa Stark', 876, '2017-12-02');
    
CREATE TABLE Salary (
	`EmpId` int NOT NULL,
    `Project` varchar(225) NOT NULL,
    `Salary` int NOT NULL,
    PRIMARY KEY (`EmpId`)
);
INSERT INTO `Salary` VALUES 
	(121, 'p1', 8000),
    (321, 'p2', 1000),
    (421, 'p1', 12000),
    (721, 'p3', 6000);