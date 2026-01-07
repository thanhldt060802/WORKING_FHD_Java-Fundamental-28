USE java_28;

-- PRIMARY KEY

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);

INSERT INTO Students (student_id, student_name, age) VALUES
('S01', 'A', 29),
('S02', 'B', 21),
('S02', 'C', 25);

INSERT INTO Students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO Students (student_id, student_name, age) VALUES ('S02', 'B', 21);
INSERT INTO Students (student_id, student_name, age) VALUES ('S02', 'C', 25);  -- Sai!

SELECT * from Students;

DROP TABLE Students;

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id, student_name)
);

INSERT INTO Students (student_id, student_name, age) VALUES ('S01', 'A', 29);
INSERT INTO Students (student_id, student_name, age) VALUES ('S02', 'B', 21);
INSERT INTO Students (student_id, student_name, age) VALUES ('S02', 'C', 25);
INSERT INTO Students (student_id, student_name, age) VALUES ('S03', 'C', 23);
INSERT INTO Students (student_id, student_name, age) VALUES ('S03', 'C', 22);  -- Sai!

DROP TABLE Students;

-- AUTO INCREMENT

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id INT AUTO_INCREMENT,  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);

INSERT INTO Students (student_name, age) VALUES
('A', 29),
('B', 21),
('C', 25);

SELECT * FROM Students;

INSERT INTO Students VALUES
(101, 'A', 29),
(102, 'B', 21),
(103, 'C', 25);

SELECT * FROM Students;

INSERT INTO Students (student_name, age) VALUES
('A', 29),
('B', 21),
('C', 25);

SELECT * FROM Students;

DELETE FROM Students WHERE student_id=105;

SELECT * FROM Students;

INSERT INTO Students (student_name, age) VALUES
('A', 29);

SELECT * FROM Students;

DROP TABLE Students;

-- UUID

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id CHAR(36) DEFAULT (UUID()),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);

INSERT INTO Students (student_name, age) VALUES
('A', 29),
('B', 21),
('C', 25);

SELECT * FROM Students;

INSERT INTO Students (student_id, student_name, age) VALUES
('e28b1bdd-f638-4831-88bc-f859777e59f1', 'A', 29);

SELECT * FROM Students;

INSERT INTO Students (student_id, student_name, age) VALUES
('e28b1bdd', 'A', 29);

SELECT * FROM Students WHERE student_id='e28b1bdd';

DROP TABLE Students;

-- Bảng sinh viên
CREATE TABLE Students
(
	student_id VARCHAR(255),  -- Mã số sinh viên
	student_name VARCHAR(255),  -- Tên sinh viên
	age INT,  -- Tuổi
	PRIMARY KEY (student_id)
);

-- Bảng tài khoảng sinh viên
CREATE TABLE Student_Accounts
(
	username VARCHAR(255),  -- Tên tài khoản
	password VARCHAR(255),  -- Mật khẩu
	account_id VARCHAR(255),  -- Mã số tài khoản
	average_score double,  -- Điểm trung bình
	PRIMARY KEY (username),
	FOREIGN KEY (account_id) REFERENCES Students(student_id)
);

INSERT INTO Students (student_id, student_name, age) VALUES
('S01', 'A', 29),
('S02', 'B', 21),
('S03', 'C', 25);

SELECT * FROM Students;

INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username1', 'password1', 'S01', 9.8);
INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username2', 'password2', 'S02', 6.7);
INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username3', 'password3', 'S03', 8.9);
INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username4', 'password4', 'S04', 7.9);  -- Sai!
INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username5', 'password5', NULL, 8.9);
INSERT INTO Student_Accounts (username, password, account_id, average_score) VALUES ('username6', 'password6', 'S03', 8.9);

SELECT * FROM Student_Accounts;

INSERT INTO Students (student_id, student_name, age) VALUES
('S05', 'Z', 21);
UPDATE Student_Accounts SET account_id='S05' WHERE username='username5';

SELECT * FROM Students;
SELECT * FROM Student_Accounts;