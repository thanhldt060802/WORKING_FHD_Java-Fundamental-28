CREATE DATABASE School_Management;

USE School_Management;

CREATE TABLE Students  -- Bảng sinh viên
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);

INSERT INTO Students (student_id, student_name, age) VALUES
('S01', 'A', 29),
('S02', 'B', 25),
('S03', 'C', 21);

DROP DATABASE IF EXISTS internet_banking;
CREATE DATABASE internet_banking;
USE internet_banking;

CREATE TABLE accounts  -- Bảng tài khoản
(
	username VARCHAR(255),  -- Tên tài khoản
	password VARCHAR(255),  -- Mật khẩu
	balance DOUBLE,  -- Số dư
	PRIMARY KEY (username)
);

INSERT INTO accounts (username, password, balance) VALUES
('ACC01', '12345678', 515.78),
('ACC02', '12345678', 680.89),
('ACC03', '12345678', 655.24);