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