CREATE DATABASE java_28;
DROP DATABASE java_28;
USE java_28;

-- Entity Nhân Viên
CREATE TABLE Employees (
    employee_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    hire_date DATE
);

ALTER TABLE employees ADD email VARCHAR(100);
ALTER TABLE Employees RENAME COLUMN email TO phone_number;
ALTER TABLE Employees RENAME COLUMN phone_number TO email;
ALTER TABLE Employees MODIFY email TEXT;
ALTER TABLE Employees DROP email;
ALTER TABLE Employees RENAME TO Staffs;

DESCRIBE staffs;
DROP TABLE staffs;

-- Đây là ghi chú trên 1 dòng

/*
Đây
là
ghi
chú
trên
nhiều
dòng
*/

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT  -- Tuổi
);

INSERT INTO Students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO Students (student_id, age, student_name) VALUES ('S02', 29, 'B');

INSERT INTO Students VALUES
('S03', 'C', 29),
('S04', 'D', 21),
('S05', 'E', 25);

INSERT INTO Students VALUES ('S02', 29, 'B');

UPDATE Students SET student_name = 'X', age = 20 WHERE student_id = 'S01';
UPDATE Students SET student_name = 'X', age = 20;

DROP TABLE students;

DELETE FROM Students WHERE student_id = 'S03';

INSERT INTO Students VALUES
('S01', 'A', 23),
('S02', 'B', 24),
('S03', 'C', 25);

SELECT * FROM students;
SELECT * FROM students WHERE age <= 23;
SELECT * FROM students WHERE age <= 23 AND student_name = 'A';
SELECT student_id, student_name FROM students;
SELECT student_id AS id, student_name AS name, age FROM Students;
