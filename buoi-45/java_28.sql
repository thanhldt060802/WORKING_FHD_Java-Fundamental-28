USE java_28;

-- Bảng sản phẩm
CREATE TABLE Products
(
	product_id VARCHAR(255),  -- Mã số sản phẩm
	product_name VARCHAR(255),  -- Tên sản phẩm
	price DOUBLE,  -- Giá tiền
	discount DOUBLE,  -- Chiết khấu
	expiry DATE,  -- Hạn sử dụng
	amplitude DOUBLE,  -- Biên độ
	PRIMARY KEY (product_id)
);

INSERT INTO Products (product_id, product_name, price, discount, expiry, amplitude) VALUES
('DRI001', 'Coffee Beans', 10.50, 0.10, '2024-12-31', 2.5542),
('DRI002', 'Tea Leaves', 7.00, 0.05, '2024-11-30', -3.3425),
('DRI003', 'Green Tea', 8.50, 0.08, '2024-09-25', 2.5552),
('DRI004', 'Honey Jar', 12.00, 0.10, '2025-02-28', -1.2454),
('DRI005', 'Almond Milk', 9.75, 0.12, '2025-03-10', -0.2652),
('SNA001', 'Chocolate Bar', 5.75, 0.10, '2024-12-01', 2.4522),
('SNA002', 'Biscuit Box', 6.20, 0.05, '2024-11-15', -2.1423),
('SNA003', 'Energy Bar', 4.20, 0.00, '2024-10-31', -3.2524),
('SNA004', 'Candy Pack', 3.00, 0.05, '2024-09-10', 0.5251),
('SNA005', 'Peanut Butter Cup', 6.50, 0.08, '2024-12-05', 4.1523);

-- CHỨC NĂNG XỬ LÝ CHUỖI

SELECT CONCAT('Hello', 'World', 'Hello', 'World') AS my_value;
SELECT CONCAT(product_id, ' - ', product_name) AS name, price FROM Products;

SELECT SUBSTRING('Hello world', 2, 3) AS my_value;
SELECT SUBSTRING(product_id, 1, 3) AS product_type, product_name FROM Products;

SELECT LENGTH('Hello') AS my_value;
SELECT product_id, LENGTH(product_name) AS length_of_product_name FROM Products;

SELECT product_id, LOWER(product_name) AS lower_product_name, UPPER(product_name) AS upper_product_name FROM Products;

-- CHỨC NĂNG XỬ LÝ SỐ

SELECT ABS(-5) AS my_value;
SELECT ROUND(123.454, 2) AS my_value;
SELECT CEIL(2.3) AS my_value;
SELECT FLOOR(2.8) AS my_value;

SELECT
product_id,
amplitude,
ABS(amplitude) AS abs_amplitude,
ROUND(amplitude, 1) AS round_amplitude,
CEIL(amplitude) AS ceil_amplitude,
FLOOR(amplitude) AS floor_amplitude
FROM Products;

-- CHỨC NĂNG XỬ LÝ NGÀY VÀ THỜI GIAN

SELECT NOW();
SELECT CURDATE();

INSERT INTO Products (product_id, product_name, price, discount, expiry, amplitude) VALUES
('DRI006', 'Coca Cola', 8.50, 0.15, '2026-02-01', 3.1515);

SELECT * FROM Products WHERE expiry <= NOW();
SELECT * FROM Products WHERE expiry > NOW();

SELECT DATE_ADD('2024-01-01', INTERVAL 3 DAY) AS my_value;
SELECT DATE_ADD('2024-01-01 10:00:00', INTERVAL '4:30' HOUR_MINUTE) AS my_value;
SELECT DATE_ADD('2024-01-01 10:00:00', INTERVAL '6 2:30:30' DAY_SECOND) AS my_value;

SELECT DATEDIFF('2024-01-01', '2023-12-31') AS my_value;
SELECT product_id, DATEDIFF(expiry, CURDATE()) AS remaining_days FROM Products;

-- CHỨC NĂNG XỬ LÝ LOGIC

SELECT IF(1 > 0, 'True', 'False') AS my_result;
SELECT product_id, IF(amplitude > 0, 'Good', 'Bad') AS product_status FROM Products;

SELECT product_id,
	CASE
		WHEN amplitude >= 2 THEN 'Extremely good'
		WHEN amplitude > 0 THEN 'Good'
		ELSE 'Bad'
	END AS amplitude_status
FROM Products;

SELECT product_id, IF(amplitude >= 2, 'Extremely good', IF(amplitude > 0, 'Good', 'Bad')) AS product_status FROM Products;

-- CHỨC NĂNG XỬ LÝ DỮ LIỆU

SELECT COUNT(*) FROM Products;
SELECT COUNT(*) FROM Products WHERE amplitude >= 2;

SELECT SUM(price) FROM Products;

SELECT AVG(price) FROM Products;

SELECT MIN(price) FROM Products;

SELECT MAX(price) FROM Products;

-- CÁC THAO TÁC PHỨC TẠP

-- Bảng khách hàng
CREATE TABLE Customers (
    customer_id VARCHAR(255),  -- Mã số khách hàng
    customer_name VARCHAR(255),  -- Tên khách hàng
    email VARCHAR(255),  -- Địa chỉ email
    phone VARCHAR(20),  -- Số điện thoại
    address VARCHAR(255),  -- Địa chỉ
    PRIMARY KEY (customer_id)
);

-- Bảng danh mục
CREATE TABLE Categories (
    category_id VARCHAR(255),  -- Mã số danh mục
    category_name VARCHAR(255),  -- Tên danh mục
    PRIMARY KEY (category_id)
);

-- Bảng sản phẩm
CREATE TABLE Products (
	product_id VARCHAR(255),  -- Mã số sản phẩm
	product_name VARCHAR(255),  -- Tên sản phẩm
	category_id VARCHAR(255),  -- Mã số danh mục
	price DOUBLE,  -- Giá tiền
	discount DOUBLE,  -- Chiết khấu
	PRIMARY KEY (product_id),
	FOREIGN KEY (category_id) REFERENCES Categories(category_id)
);

-- Bảng hóa đơn
CREATE TABLE Bills (
    bill_id VARCHAR(255),  -- Mã số hoá đơn
    customer_id VARCHAR(255),  -- Mã số khách hàng
    total_amount DOUBLE,  -- Tổng số tiền
    created_at DATE,  -- Ngày tạo
    PRIMARY KEY (bill_id),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);

-- Bảng chi tiết hóa đơn
CREATE TABLE Bill_Details (
    bill_id VARCHAR(255),  -- Mã số hoá đơn
    product_id VARCHAR(255),  -- Mã số sản phẩm
    quantity INT,  -- Số lượng
    price DOUBLE,  -- Giá tiền
    discount DOUBLE,  -- Chiết khấu
    PRIMARY KEY (bill_id, product_id),
    FOREIGN KEY (bill_id) REFERENCES Bills(bill_id),
    FOREIGN KEY (product_id) REFERENCES Products(product_id)
);

INSERT INTO Customers (customer_id, customer_name, email, phone, address) VALUES
('CUS001', 'Nguyen Van A', 'a.nguyen@example.com', '0901234567', '123 Le Loi, HCM'),
('CUS002', 'Tran Thi B', 'b.tran@example.com', '0902345678', '456 Nguyen Hue, HCM'),
('CUS003', 'Le Van C', 'c.le@example.com', '0903456789', '789 Tran Hung Dao, HCM'),
('CUS004', 'Pham Thi D', 'd.pham@example.com', '0904567890', '101 Hai Ba Trung, HCM'),
('CUS005', 'Hoang Van E', 'e.hoang@example.com', '0905678901', '202 Dien Bien Phu, HCM');

INSERT INTO Categories (category_id, category_name) VALUES
('CAT001', 'Drink'),
('CAT002', 'Snack'),
('CAT003', 'Candy');

INSERT INTO Products (product_id, product_name, category_id, price, discount) VALUES
('PROD001', 'Coca Cola', 'CAT001', 10.0, 0.1),
('PROD002', 'Pepsi', 'CAT001', 9.5, 0.08),
('PROD003', 'Orange Juice', 'CAT001', 12.0, 0.12),
('PROD004', 'Apple Juice', 'CAT001', 11.0, 0.1),
('PROD005', 'Water', 'CAT001', 5.0, 0.0),
('PROD006', 'Potato Chips', 'CAT002', 5.5, 0.05),
('PROD007', 'Pretzels', 'CAT002', 6.0, 0.06),
('PROD008', 'Popcorn', 'CAT002', 4.5, 0.03),
('PROD009', 'Chocolate Bar', 'CAT002', 8.0, 0.1),
('PROD010', 'Chupa Chups', 'CAT003', 10.0, 0.1);

INSERT INTO Bills (bill_id, customer_id, total_amount, created_at) VALUES
('BILL001', 'CUS001', 50.0, '2024-10-15'),
('BILL002', 'CUS001', 50.0, '2024-10-16'),
('BILL003', 'CUS001', 35.0, '2024-10-17'),
('BILL004', 'CUS002', 60.0, '2024-10-18'),
('BILL005', 'CUS003', 35.0, '2024-10-19'),
('BILL006', null, 35.0, '2024-10-20');

INSERT INTO Bill_Details (bill_id, product_id, quantity, price, discount) VALUES
('BILL001', 'PROD001', 2, 10.0, 0.1),
('BILL001', 'PROD003', 1, 12.0, 0.12),
('BILL001', 'PROD002', 3, 9.5, 0.08),
('BILL001', 'PROD004', 2, 11.0, 0.1),
('BILL002', 'PROD009', 1, 8.0, 0.1),
('BILL002', 'PROD010', 2, 7.0, 0.08),
('BILL003', 'PROD006', 1, 18.0, 0.18),
('BILL003', 'PROD005', 2, 5.0, 0.0),
('BILL003', 'PROD004', 1, 12.0, 0.12),
('BILL004', 'PROD005', 2, 30.0, 0.1),
('BILL004', 'PROD001', 1, 20.0, 0.05),
('BILL004', 'PROD010', 3, 7.0, 0.1),
('BILL005', 'PROD002', 1, 10.0, 0.1),
('BILL005', 'PROD010', 2, 10.0, 0.1),
('BILL005', 'PROD001', 1, 15.0, 0.15),
('BILL006', 'PROD010', 1, 18.0, 0.18),
('BILL006', 'PROD001', 1, 10.0, 0.1);

SELECT category_id FROM Products
GROUP BY category_id;