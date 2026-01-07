
// Ghi chú
/*
 * Sử dụng ctrl + / để comment/uncomment cái đoạn/dòng code mà ta tô đen.
 */

// Biến và kiểu dữ liệu
/*
 * Có 2 loại kiểu dữ liệu:
 *  - Nguyên thuỷ (kiểu dữ liệu tham trị -> type value ref):
 *      - 8 kiểu dữ liệu gồm: byte, short, int, long, float, double, char, boolean (primitive data type).
 *          + Với kiểu số nguyên thì Java mặc định hiểu phạm vi bao bọc là int, nếu dùng long (vượt phạm vi bao bọc mặc định) thì ta thêm 'L' vào cuối số.
 *          + Với kiểu số thực thì Java mặc định hiểu mặc định là double nên nếu dùng float thì ta phải thêm 'F' vào cuối số.
 *          + Với kiểu ký tự sẽ tương đồng với kiểu số nguyên ở dạng số (ASCII).
 *          + Giá trị bảng chân trị dùng từ khoá true/false (tương ứng 1 | 0) để biểu diễn giá trị.
 *      - Ép kiểu nguyên thuỷ ta dùng cú pháp (type)variable.
 *  - Lớp (kiểu dữ liệu tham chiếu -> type ref): N kiểu dữ liệu gồm: Byte, Short, Integer, Long, Float, Double, Character, Boolean, String, ...
 *      - Byte -> String có thể khởi tạo giá trị trực tiếp.
 *      - Các kiểu còn lại ngoài Byte -> String hầu hết thì phải thông qua từ khoá new theo hình thức tiêu chuẩn để tạo đối tượng.
 * Sự khác biệt giữa kiểu dữ liệu nguyên thuỷ và kiểu dữ liệu dạng lớp là:
 *  - Kiểu dữ liệu nguyên thuỷ chỉ dùng để lưu trữ giá trị và tính toán.
 *  - Kiểu dữ liệu dạng lớp ngoài lưu trữ giá trị ra còn dùng để tương tác như một đối tượng.
 */

// Nhập liệu
/*
 * Scanner là một lớp tiêu chuẩn phục vụ cho nhập liệu gồm các hàm như:
 *  - nextLine() dùng để nhập một chuỗi.
 *  - next() dùng để nhập một từ trong chuỗi (phân cách theo dấu khoảng trắng).
 *  - nextInt() dùng để nhập số nguyên.
 *  - nextDouble() dùng để nhập số thực.
 *  - ...
 * Lưu y sau khi dùng Scanner xong phải đóng lại để giải phóng tài nguyên tránh rò rỉ.
 */

import java.util.Scanner;
 
public class Buoi01 {

    public static void main(String[] args) {

        // Biến và kiểu dữ liệu

        // byte abc = 18;

        // double xyz = 3.123456789F;
        // System.out.println(xyz);

        // char myChar = 'A';
        // System.out.println(myChar);
        // System.out.println((int)myChar);

        // int myInt = 66;
        // System.out.println(myInt);
        // System.out.println((char)myInt);

        // int myInt = 226;
        // System.out.println((char)myInt);

        // char myChar = 'â';
        // System.out.println((int)myChar);

        // int a = 10;
        // int b = 11;
        // boolean myCondition = a < b;
        // System.out.println(myCondition);

        // int primitiveVar = 10; // Được gọi là biến
        // Integer objectVar = 10; // Được gọi là đối tượng
        // String myName = "Le Dao Tan Thanh";
        // System.out.println(myName.toLowerCase());
        // System.out.println(myName.toUpperCase());

        // Integer a = 10;
        // Integer b = new Integer(10);
        // String c = "Hello";
        // String d = new String("Hello");

        // Nhập liệu

        // Scanner sc = new Scanner(System.in);

        // // int a = sc.nextInt();
        // // System.out.println("My value: " + a);

        // // String a = sc.nextLine();
        // // System.out.println("My value: " + a);

        // // String a = sc.next();
        // // System.out.println("My value: " + a);

        // // String a = sc.nextLine();
        // // char myChar = a.charAt(0);
        // // System.out.println("My value: " + myChar);

        // sc.close();

    }
    
}
