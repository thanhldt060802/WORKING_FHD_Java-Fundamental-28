/*
 * Xây dựng hàm
 *  - Cú pháp định nghĩa hàm:
 *      <public static> <kiểu trả về> <tên hàm>(<tham số của hàm>) { Quá trình xử lý }
 *      + <kiểu trả về>: Các kiểu nguyên thuỷ, các kiểu dữ liệu ở dạng lớp hoặc void. Trong đó void là kiểu đặc biệt, nó không cho phép chúng ta trả về giá trị.
 *      + Từ khoá 'return' nếu dùng cho hàm yêu cầu trả về giá trị sẽ cần kèm theo giá trị trả về và ngắt hàm, nếu dùng cho hàm không yêu cầu trả về giá trị thì không được kèm theo giá trị trả về và ngắt hàm.
 *  - Hàm sử dụng bộ tham số:
 *      <public static> <kiểu trả về> <tên hàm>(<tham số của hàm>, ...<bộ tham số>) { Quá trình xử lý }
 * 
 * Xây dựng Inputter
 */

import java.util.Arrays;
import java.util.Scanner;

public class Buoi04 {

    // public static int sum(int a, int b) { // Hàm sum đang yêu ta trả về một số nguyên int
    //     return a + b;
    // }

    // public static int sum1(int a, int b) { // Hàm sum1 đang yêu ta trả về một số nguyên int
    //     System.out.println("In sum1(): " + (a + b));
    //     return a + b;
    // }

    // public static void sum2(int a, int b) { // Hàm sum2 không yêu ta trả giá trị
    //     System.out.println(a + b);
    // }

    // public static int sumArr(int[] intArray) {
    //     int tong = 0;
    //     for (int i = 0; i < intArray.length; i++) {
    //         tong = tong + intArray[i];  // tong += intArray[i];
    //         // System.out.println("i = " + i + ", tong = " + tong);
    //     }
    //     return tong;
    // }

    // public static void findFirstOddNumber(int[] intArray) {
    //     for (int i = 0; i < intArray.length; i++) {
    //         if (intArray[i] % 2 != 0) {
    //             System.out.println("First index of odd number: " + i);
    //             return;
    //             // break;
    //         }
    //     }
    //     System.out.println("In array does not exist any odd number");
    // }

    // public static int findFirstOddNumber(int[] intArray) {
    //     for (int i = 0; i < intArray.length; i++) {
    //         if (intArray[i] % 2 != 0) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static int sumArr(int ...intArray) {
    //     int tong = 0;
    //     for (int i = 0; i < intArray.length; i++) {
    //         tong = tong + intArray[i];
    //     }
    //     return tong;
    // }

    // public static int sumArr(int[] intArray) {
    //     int tong = 0;
    //     for (int i = 0; i < intArray.length; i++) {
    //         tong = tong + intArray[i];
    //     }
    //     return tong;
    // }

    // public static void testArguments(int a, int b, int ...c) {
    //     System.out.println(Arrays.toString(c));
    //     System.out.println(a);
    //     System.out.println(b);
    // }

    public static void main(String[] args) {

        // int x = 10;
        // int y = 15;
        // sum(x, y);
        // int z = sum(x, y);
        // System.out.println(z);
        // System.out.println(sum(x, y));

        // sum1(5, 9);
        // sum2(5, 9);

        // sum1(11, 22);

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // int z = sumArr(arr);
        // System.out.println(z);

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter N: ");
        // int N = sc.nextInt();

        // int[] arr = new int[N];
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Enter arr[" + i + "]: ");
        //     arr[i] = sc.nextInt();
        // }

        // int z = sumArr(arr);
        // System.out.println(z);

        // int[] arr = new int[] {2, 4, 3, 6, 8};
        // findFirstOddNumber(arr);

        // int[] arr = new int[] {2, 4, 3, 1, 7, 6, 8};
        // System.out.println(findFirstOddNumber(arr));

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // sumArr(arr);
        // int z = sumArr(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // System.out.println(z);

        // testArguments(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // String name = MyInputter.inputString("Input your name: ");
        // System.out.println("Your input: " + name);

        // int age = MyInputter.inputInt("Input your age: ");
        // int age = MyInputter.inputIntWithLimitRetry("Input your age: ", 3);
        // int age = MyInputter.inputPositiveInt("Input your age: ");
        // System.out.println("Your input: " + age);
        // String name = MyInputter.inputString("Input your name: ");
        // System.out.println("Your input: " + name);
        int a = MyInputter.inputPositiveInt("Input a: ");
        System.out.println("Your input: " + a);
        int b = MyInputter.inputPositiveInt("Input b: ");
        System.out.println("Your input: " + b);

        /*
         * abc\n -> lấy hết abc\n -> tách \n và giải phóng và chỉ lấy abc
         * xyz\n
         * 
         * 19\n -> chỉ lấy 19 -> còn lại \n -> Nếu sử dụng lệnh nhập ngoài nextLine() thì lệnh đó tự động detect \n còn sót lại trước đó để giải phòng và tiếp tục thực hiện nhập
         * 20\n
         */

    }

}
