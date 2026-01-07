/*
 * Câu điều kiện và vòng lặp
 *  - Lệnh break và continue
 *  - Đánh nhãn (Label)
 * Sử dụng chuỗi
 *  - 
 * Xử lý mảng
 *  - Giá trị mặc định thuộc kiểu nguyên thuỷ của số nguyên là 0, của số thực là 0.0, của ký tự là NUL, của boolean là false.
 *  - Giá trị mặc định thuộc kiểu lớp luôn là null.
 */

import java.util.Arrays;

public class Buoi03 {
    
    public static void main(String[] args) {

        // Câu điều kiện và vòng lặp

        // for (int i = 1; i <= 10; i++) {
        //     if (i % 3 == 0) {
        //         System.out.println("i = " + i + " Stop");
        //         break;
        //     }
        //     System.out.println("i = " + i + " Next");
        // }

        // for (int i = 1; i <= 5; i++) {
        //     int j = 1;
        //     for (; j <= 5; j++) {
        //         if (i % 3 == 0 && j % 3 == 0) {
        //             System.out.println("i = " + i + ", j = " + j + " Stop");
        //             break;
        //         }
        //         System.out.println("i = " + i + ", j = " + j + " Next");
        //     }
        //     // System.out.println("i = " + i + ", j = " + j + " Next");
        // }

        // I_LOOP:
        // for (int i = 1; i <= 5; i++) {
        //     int j = 1;
        //     for (; j <= 5; j++) {
        //         if (i % 3 == 0 && j % 3 == 0) {
        //             System.out.println("i = " + i + ", j = " + j + " Stop");
        //             break I_LOOP;
        //         }
        //         System.out.println("i = " + i + ", j = " + j + " Next");
        //     }
        // }

        // boolean flag = false;
        // for (int i = 1; i <= 5; i++) {
        //     // Ví trí 1
        //     // if (flag == true) {
        //     //     System.out.println("i = " + i + " Stop");
        //     //     break;
        //     // }
        //     for (int j = 1; j <= 5; j++) {
        //         if (i % 3 == 0 && j % 3 == 0) {
        //             System.out.println("i = " + i + ", j = " + j + " Stop");
        //             flag = true;
        //             break;
        //         }
        //         System.out.println("i = " + i + ", j = " + j + " Next");
        //     }
        //     // Vị trí 2
        //     if (flag == true) {
        //         System.out.println("i = " + i + " Stop");
        //         break;
        //     }
        // }

        // for (int i = 1; i <= 10; i++) {
        //     if (i % 3 == 0) {
        //         System.out.println("Continue");
        //         continue;
        //     }
        //     System.out.println("i = " + i);
        // }

        // Sử dụng chuỗi

        // String name1 = "Tan thanh";
        // String name2 = "Tan TRUNG";
        // int numberOfCharactersInName = name.length(); // Độ dài chuỗi
        // System.out.println(numberOfCharactersInName);
        // System.out.println(name.length());
        // System.out.println(name.charAt(3)); // Truy xuất ký tự theo chỉ mục
        // System.out.println(name.toLowerCase()); // Chuyển đổi về chuỗi viết thường tất cả ký tự
        // System.out.println(name.toUpperCase()); // Chuyển đổi về chuỗi viết hoa tất cả ký tự
        // System.out.println(name.indexOf("a")); // Lấy chỉ mục của chuỗi con trong chuội gốc
        // System.out.println(name.indexOf(97)); // Lấy chí mục của ký tự theo số
        // System.out.println(name.length());
        // System.out.println(name.isEmpty()); // Trả về true nếu chuỗi rỗng
        // System.out.println(name.isBlank()); // Trả về true nếu chuỗi trống
        // System.out.println(name1.equals(name2)); // Trả về true nếu 2 chuỗi bằng nhau
        // System.out.println(name1.equalsIgnoreCase(name2)); // Trả về true nếu 2 chuỗi bằng nhau (không xét trường hợp hoa-thường)
        // System.out.println(name1.compareTo(name2)); // Trả về số âm nếu a < b, dương nếu a > b, 0 nếu a == b
        // System.out.println(name1.compareToIgnoreCase(name2)); // Trả về số âm nếu a < b, dương nếu a > b, 0 nếu a == b (không xét trường hợp hoa-thường)

        // Xử lý mảng

        // int a = 10;
        // int[] arr1 = new int[5];
        // arr1[2] = 100; // Set giá trị
        // System.out.println(Arrays.toString(arr1));

        // int[] arr2 = new int[] {65, 66, 67, 68, 69};
        // System.out.println(arr2[3]); // Get giá trị

        // int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5};
        // System.out.println(arr.length);

        /*
         * 1 2 3 4
         * 1 2
         * 1 2 3
         */
        // int[][] arr = new int[3][];
        // arr[0] = new int[] {20, 25, 30};
        // arr[1] = new int[] {100, 200};
        // arr[2] = new int[] {-100, -90, -80};
        // System.out.println(Arrays.deepToString(arr));
        // System.out.println(arr[2][1]);

        int[][] arr = new int[][] {
            {20, 25, 30},
            {100, 200},
            {-100, -90, -80}
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[2][1]);

    }

}
