/*
 * Toán tử
 *  Arithmetic: +, -, *, /, %
 *      + Lưu ý về phép '/' gồm:
 *          + Chia lấy nguyên với 2 số đều nguyên.
 *          + Chia lấy thực với 1 trong 2 số là thực.
 *  Unary (Prefix/Postfix operator - Tiền/Hậu tố): +, -, !, ++, --
 *      + Lưu ý:
 *          + +, - áp dụng cho biểu thức số và chỉ ở ví trị Prefix.
 *          + ! áp dụng cho biểu thức điều kiện và chỉ ở vị trí Prefix.
 *          + ++, -- áp dụng cho biểu thức số và có thể ở trị trí Prefix hoặc Postfix.
 *  Bit (Shift và Bitwise): >>, <<, &, |, ^ chỉ khuyến khích áp dụng với số nguyên không dấu.
 *      + Shift: >> dịch phải (bỏ đi n bit cuối của dãy bit), << dịch trái (thêm n bit 0 vào cuối của dãy bit)
 *      + Bitwise: & - AND nhân (yêu cầu 2 bit 1), | - OR cộng (yêu cầu 1 bit 1), ^ - XOR (yêu cầu 2 bit khác nhau)
 *  Logical (Kết hợp điều kiện): && - AND (buộc 2 điều kiện phải đúng), || - OR (chỉ cần 1 điều kiện đúng)
 *  Relational (So sánh): ==, !=, >, <, >=, <=
 *      + Lưu ý về toán tử '==' và '!=' là dùng cho tham chiếu.
 *      + Lưu ý về toán tử '>', '<', '>=', và '<=' chỉ dùng cho số.
 *  Assignment (Gán): =, <operator>=
 *  Tenary (Toán tử 3 ngôi): Áp dung cho câu điều kiện có 2 về if-else
 *      <điều kiệu> ? <giá trị trả về nếu điều kiện đúng> : <giá trị trả về nếu điều kiện sai>
 * 
 * Tham chiếu và tham trị
 *  - Biến trong Java là tham chiếu nhưng cách nó tham chiếu sẽ tuỳ thuộc vào kiểu dữ liệu khai báo cho nó là kiểu tham trị
 *    (kiểu nguyên thuỷ) hay kiểu tham chiếu (kiểu class).
 * 
 * Định dạng chuỗi
 *  - Các định dạng: %s (chuỗi), %d (cho số nguyên), %f (cho số thực), %c (cho ký tự), %b (cho giá trị true/false)
 * 
 * Ép kiểu nguyên thuỷ (ép kiểu tường minh)
 *  - Số nguyên -> số thực (hoặc ngược lại).
 *  - Số -> ký tự (hoặc ngược lại).
 *  - Có thể gán biến có size nhỏ hơn vào biến có size lớn hơn nhưng phải phù hợp loại dữ liệu.
 */

import java.util.Arrays;

public class Buoi05 {
    
    public static void main(String[] args) {

        // Toán tử

        // System.out.println(1 + 2 * 3);

        // int a = 10;
        // int b = 3;
        // System.out.println(a / b); // Chia lấy nguyên
        // System.out.println((double)a / b); // Chia lấy thực

        // int a = 10;
        // int b = 3;
        // System.out.println(a % b);

        // int a = -10;
        // int b = 10;
        // System.out.println(a + b);

        // int a = 10;
        // int b = 11;
        // // System.out.println(!(a > b));
        // if (!(a > b)) {
        //     System.out.println("Hello, World!");
        // }

        // int a = 10;
        // System.out.println(a++ + 10);
        // System.out.println(a);

        // int a = 20;
        // System.out.println(a >> 2);
        // /*
        //  * dec = 20 => bit = 10100
        //  * 10100 >> 2 = 101
        //  * bit = 101 => dec = 5
        //  */
        
        // int a = 20;
        // System.out.println(a << 2);
        // /*
        //  * dec = 20 => bit = 10100
        //  * 10100 << 2 = 1010000
        //  * bit = 1010000 => dec = 80
        //  */

        // int a = 30;
        // int b = 150;
        // System.out.println(a & b);
        // /*
        //  * dec = 30 => bit = 11110
        //  * dec = 150 => bit = 10010110
        //  * 11110 & 10010110
        //  * 
        //  * 00011110
        //  * 10010110
        //  * 00010110
        //  * 
        //  * bit = 00010110 => dec = 22
        //  */

        // int a = 30;
        // int b = 150;
        // System.out.println(a | b);
        // /*
        //  * dec = 30 => bit = 11110
        //  * dec = 150 => bit = 10010110
        //  * 11110 | 10010110
        //  * 
        //  * 00011110
        //  * 10010110
        //  * 10011110
        //  * 
        //  * bit = 10011110 => dec = 158
        //  */
        
        // int a = 30;
        // int b = 150;
        // System.out.println(a ^ b);
        // /*
        //  * dec = 30 => bit = 11110
        //  * dec = 150 => bit = 10010110
        //  * 11110 ^ 10010110
        //  * 
        //  * 00011110
        //  * 10010110
        //  * 10001000
        //  * 
        //  * bit = 10001000 => dec = 136
        //  */

        // int a = 30;
        // int b = 20;
        // int c = 30;
        // if (a >= b && a >= c) {
        //     System.out.println("a is max");
        // } else if (b >= a && b >= c) {
        //     System.out.println("b is max");
        // }else {
        //     System.out.println("c is max");
        // }

        // int a = -10;
        // int b = 1;
        // if (a > 0 || b > 0) {
        //     System.out.println("Have positive number");
        // } else {
        //     System.out.println("Have no positive number");
        // }

        // int a = 10;
        // int b = -10;
        // if (b > 0 && ++a > 0) {
        //     System.out.println("Hello, World!");
        // }
        // if (b > 0 & ++a > 0) {
        //     System.out.println("Hello, World!");
        // }
        // System.out.println(a);

        // int a = 10;
        // int b = -10;
        // // if (b > 0 || ++a > 0) {
        // //     System.out.println("Hello, World!");
        // // }
        // if (b < 0 | ++a > 0) {
        //     System.out.println("Hello, World!");
        // }
        // System.out.println(a);

        // int a = 10;
        // int b = 15;
        // System.out.println(a > b);
        // System.out.println(a < b);
        // System.out.println(a >= b);
        // System.out.println(a <= b);

        // int a = 10;
        // int b = 15;
        // System.out.println(a == b);
        // System.out.println(a != b);

        // int a = 13;
        // // a %= 2; // a = a % 2
        // // a /= 2; // a = a / 2
        // a <<= 2; // a = a << 2
        // System.out.println(a);

        // int a = 10;
        // int b = 15;
        // // if (a > b) {
        // //     System.out.println("a is max");
        // // } else {
        // //     System.out.println("b is max");
        // // }
        // String result = a > b ? "a is max" : "b is max";
        // System.out.println(result);

        // int a = 10;
        // int b = a; // b = 10
        // b = 15;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a == b);

        // Integer a = 10;
        // Integer b = 10;
        // System.out.println(a == b);
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));

        // String a = new String("ABC");
        // String b = new String("ABC");
        // System.out.println(a == b);
        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));

        // int[] arr1 = new int[] {1, 2, 3, 4, 5};
        // int[] arr2 = arr1.clone();
        // arr2[1] = 100;
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));

        // String a = new String("ABC");
        // String b = new String("ABC");
        // System.out.println(a == b);
        // System.out.println(a.equals(b));

        // String name = "Le Dao Tan Thanh";
        // int age = 23;
        // double weight = 59.79;
        // System.out.printf("My name is %s, I'm %d years ago, My weight is %.1f", name, age, weight);

        // System.out.printf("%d", "abc");

        // int a = 10;
        // System.out.println((double)a);
        // double pi = 3.14;
        // System.out.println((int)pi);
        // int a = 66;
        // System.out.println((char)a);
        // char myChar = 'H';
        // System.out.println((int)myChar);

        // byte a = 10;
        // int b = a;

        // float a = 10.4F;
        // double b = a;

        // float a = 3.14F;
        // long b = a;

        // int a = 10;
        // byte b = a;

    }

}
