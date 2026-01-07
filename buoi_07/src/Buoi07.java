/* Khái niệm lớp và đối tượng
 * 
 * Lớp (Class).
 *  - Bản thiết kế của đối tượng.
 *  - Từ khoá new dùng để gọi đến phương thức khởi tạo của một lớp, với mục đích là khởi tạo mới một đối tượng từ lớp đó.
 * 
 * Đối tượng (Object).
 *  - Một đối tượng cụ thể của bản thiết kế.
 *  - Để khởi tạo đối tượng ta dùng cú pháp:
 *      Tên_Lớp tên_biến_đối_tượng = new Tên_Lớp();
 * 
 * Các thành phần trong lớp:
 *  - Thuộc tính (attribute/field): Thông tin của đối tượng. Mục đích dùng để chứa thông tin của đối tượng.
 *  - Hàm khởi tạo (constructor): Hàm khởi tạo. Mục đích dùng để đơn giản hoá và đa dạng hoá cách khởi tạo đối tượng.
 *  - Từ khoá 'this' dùng nội bộ trong một lớp, để truy cập các thành phần trong lớp đó, phân biệt với các thành phần khác.
 *    Khuyến khích dùng từ khoá 'this' để truy cập đến các thành phần trong nội bộ của lớp.
 *  - Hành động/chức năng: Hàm chức năng. Mục đích là thực hiện một chức năng nào đó.
 *  - Từ khoá 'this' ngoài việc dùng để truy cập các thành phần trong lớp, nó còn dùng để đại diện cho một hàm khởi tạo trong lớp đó,
 *    việc gọi hàm khởi tạo bên trong một hàm khởi tạo ràng buộc phải nằm ở dòng lệnh đầu tiên.
 * 
 * Quy tắc ghi chồng hàm:
 *  - Định nghĩa lại các hàm trùng tên nhau nhưng buộc tham số đầu vào phải khác nhau.
 */

public class Buoi07 {

    public static void main(String[] args) {

        /*
         * Mẫu thiết kế của Hình chữ nhật:
         *  - Màu sắc
         *  - Chiều rộng
         *  - Chiều dài
         * 
         * Có thể tạo ra các Hình chữ nhật:
         *  - HCN X (Màu đỏ, rộng 5cm, dài 10cm)
         *  - HCN Y (Màu xanh, rộng 6cm, dài 12cm)
         * 
         * => Hình chữ nhật là một Class, X và Y là 2 Object cụ thể được sinh ra từ Class.
         */

        // HCN hcnX = new HCN("Mau vang", 10, 5);
        // // hcnX.mauSac = "Mau xanh";
        // // hcnX.chieuRong = 6;
        // // hcnX.chieuDai = 10;
        // // System.out.println("Mau sac: " + hcnX.mauSac);
        // // System.out.println("Chieu rong: " + hcnX.chieuRong);
        // // System.out.println("Chieu dai: " + hcnX.chieuDai);
        // hcnX.inThongTinRaManHinh();
        // System.out.println("C = " + hcnX.tinhChuVi());
        // System.out.println("S = " + hcnX.tinhDienTich());

        // System.out.println();

        // HCN hcnY = new HCN("Mau hong", 19, 17);
        // hcnY.inThongTinRaManHinh();

        // HCN hcnY = new HCN(20, 10);
        // hcnY.inThongTinRaManHinh();
        // System.out.println("C = " + hcnY.tinhChuVi());
        // System.out.println("S = " + hcnY.tinhDienTich());

        // HCN hcnZ = new HCN("Mau vang", 10, 15);
        // HCN hcnZ = new HCN(15, 10);
        // HCN hcnZ = new HCN("Mau do");
        // hcnZ.inThongTinRaManHinh();

        // HCN hcnX = new HCN("Mau vang", 10, 20);
        // hcnX.inThongTinRaManHinh(true);

        /*
         * sum(params_1)
         * sum(params_2)
         * sum(params_3)
         */

    }
    
}
