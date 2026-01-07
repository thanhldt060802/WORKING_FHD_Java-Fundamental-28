// Nhập liệu
/*
 * Scanner dùng với System.in thì không cẩn đóng nhưng sử dụng với các tài nguyên khác thì phải đóng (ví dụ như: File, ...)
 * Chuẩn nhập liệu trong Scanner:
 *  - nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextDouble(), nextBoolean(), next() -> nhận giá trị dựa vào dấu phân cách như dấu khoảng trắng hay dấu xuống dòng.
 *  - nextLine() -> nhận giá trị chỉ dựa vào dấu phân cách là xuống dòng.
 */

// Câu điều kiện và vòng lặp
/*
 * Câu điều kiện:
 *  - if-else
 *  - switch-case (chỉ áp dụng với giá trị chọn là số nguyên hoặc chuỗi)
 * Vòng lặp:
 *  - for
 *  - while
 *  - do-while
 *  - for-each (liên quan đến duyệt tập hợp)
 * Nói đến câu điều kiện và vòng lặp ta có 2 toán tử dùng để kết hợp điều kiện:
 *  - && là giao 2 điều kiện: buộc 2 điều kiện phải đúng thì kết quả mới là true.
 *  - || là hợp 2 điệu kiện: chỉ cần 1 điều kiện đúng thì kết quả sẽ là true.
 */

// Toán tử 3 ngôi
/*
 * Biến thể của if-else bắt buộc có 2 nhánh if và else.
 *  - điều_kiện ? giá_trị_trả_về_nếu_diều_kiện_đúng : giá_trị_trả_về_nếu_diều_kiện_sai
 */

import java.util.Scanner;

public class Buoi02 {
    
    public static void main(String[] args) {

        // Nhập liệu

        // Scanner sc = new Scanner(System.in);

        // // \n

        // // System.out.print("Enter your name: ");
        // // String name = sc.nextLine();

        // // System.out.print("Enter your age: ");
        // // int age = sc.nextInt();

        // // 23\n
        // // \n

        // // System.out.print("Enter your age: ");
        // // int age = sc.nextInt();
        // // sc.nextLine();  // Làm sạch bộ nhớ đếm

        // // System.out.print("Enter your name: ");
        // // String name = sc.nextLine();

        // // System.out.println("Your name is: " + name + ", you are " + age + " years ago");

        // // 2 4 6 8
        // //  8\n

        // // int a = sc.nextInt();
        // // int b = sc.nextInt();
        // // int c = sc.nextInt();
        // // System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        // // System.out.println(a + b + c);

        // // String cache = sc.nextLine();
        // // System.out.println(cache);

        // // boolean myBool = sc.nextBoolean();
        // // System.out.println("Your variable: " + myBool);

        // sc.close(); // Có hay không cũng được (nhưng theo chuẩn là phải có)

        // Câu điều kiện và vòng lặp

        // int a = 15;
        // int b = 10;

        // if (a > b) {
        //     System.out.println("a greater than b");
        // } else if (a < b) {
        //     System.out.println("a less than b");
        // } else {
        //     System.out.println("a equal b");
        // }

        // if (a > b) {
        //     System.out.println("a greater than b");
        // } else if (a < b) {
        //     System.out.println("a less than b");
        // }

        // if (a > b) {
        //     System.out.println("a greater than b");
        // }

        // int a = 20;
        // int b = 15;
        // int c = 10;

        // if (a >= b && a >= c) {
        //     System.out.println("a");
        // } else if (b >= a && b >= c) {
        //     System.out.println("b");
        // } else {
        //     System.out.println("c");
        // }

        // if (a >= b) {
        //     if (a >= c) {
        //         System.out.println("a");
        //     } else { // a < c
        //         System.out.println("c");
        //     }
        // } else { // a < b
        //     if (b >= c) {
        //         System.out.println("b");
        //     } else { // b < c
        //         System.out.println("c");
        //     }
        // }

        // int a = 20;
        // int b = 15;

        // // if (a > b) {
        // //     System.out.println("a greater than b");
        // // } else {
        // //     System.out.println("a less than or equal b");
        // // }

        // String result = a > b ? "a greater than b" : "a less than or equal b";
        // System.out.println(result);

        // int n = 4;

        // switch (n) {
        //     case 2:
        //         System.out.println("Today");
        //         break;

        //     case 3:
        //         System.out.println("Tuesday");
        //         break;

        //     // ...
        
        //     default:
        //         System.out.println("Invalid n");
        //         break;
        // }

        // String option = "abc";

        // switch (option) {
        //     case "start":
        //         System.out.println("Game is starting ...");
        //         break;

        //     case "stop":
        //         System.out.println("Game is stopped");
        //         break;

        //     // ...
        
        //     default:
        //         System.out.println("Invalid option");
        //         break;
        // }

        // i = i + 1 <=> i += 1 <=> i++
        // i = i + 2 <=> i += 2
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(i);
        // }

        // for (int i = 1; i <= 10; ) {
        //     System.out.println(i);
        // }

        // for (int i = 1; ; i++) {
        //     System.out.println(i);
        // }

        // int i = 1;
        // for ( ; ; ) { // <=> while(true) {}
        //     if (i > 10)  {
        //         break;
        //     }

        //     System.out.println(i);

        //     i++;
        // }

        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);

        //     i++;
        // }

        // int i = 1;
        // do {
        //     System.out.println(i);

        //     i++;
        // } while (i <= 10);

        int i = 10;

        // while (i != 10) {
        //     System.out.println(i);

        //     i++;
        // }

        do {
            System.out.println(i);

            // i++;
        } while (i != 10);
    }

}
