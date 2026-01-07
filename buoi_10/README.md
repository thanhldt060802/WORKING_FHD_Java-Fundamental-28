# Buổi 10

---

## 1. Lớp và đổi tượng (tt)
### Biến tham chiếu đối tượng
* Khi cần tạo ra bản sao của một đối tượng, ta nên định nghĩa một hàm hỗ trợ để trả về dữ liệu đối tượng mới dựa trên dữ liệu đối tượng đã có.
* Có thể sử dụng hàm khởi tạo X có tham số đầu vào chính là đối tượng thuộc lớp X để khởi tạo dữ liệu đối tượng bản sao.

---

## 2. Tính chất đóng gói (Encapsulation) (tính chất đầu tiên của 4 tính chất trong mô hình OOP)
### Định nghĩa
* Tính chất đóng gói là một phương pháp giúp chúng ta ẩn đi thông tin của đối tượng, chỉ cho phép tương tác với đối tượng thông qua các hàm, và để quản lý truy cấp đến đối tượng.
### Getters và Setters
* Các hàm Getters và Setters:
    * Getters: Các hàm này dùng để lấy dự liệu của đối tượng, thường sẽ trả về kiểu dữ liệu tương ứng với thuộc tính, các đặt tên theo quy tắc chuẩn: get<TênThuộcTính>.
    * Setters: Các hàm này dùng để lấy đặt lại dữ liệu của đối tượng, thường sẽ không trả về giá trị, các đặt tên theo quy tắc chuẩn: set<TênThuộcTính>.
* Các hàm Getters và Setters không bắt buộc lúc nào cũng tuân theo quy chuẩn, ta có thể đa dạng hoá cách dùng cũng như tự định nghĩa thêm các Getters và Setters khác.