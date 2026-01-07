import java.util.Scanner;

public class MyInputter {

    public static Scanner sc = new Scanner(System.in);

    public static String inputString(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static int inputInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = sc.nextInt();
                sc.nextLine(); // Giải phóng bộ đệm ngay lập tức sau khi nhập thành công
                return value;
            } catch (Exception ex) {
                System.out.println("Invalid input, please re-input!");
                sc.nextLine(); // Giải phóng bộ đệm
            }
        }
    }

    public static int inputIntWithLimitRetry(String message, int limitRetry) {
        while (limitRetry > 0) {
            System.out.print(message);
            try {
                int value = sc.nextInt();
                sc.nextLine(); // Giải phóng bộ đệm ngay lập tức sau khi nhập thành công
                return value;
            } catch (Exception ex) {
                System.out.println("Invalid input, please re-input!");
                sc.nextLine(); // Giải phóng bộ đệm
                limitRetry--;
            }
        }
        return 0;
    }

    public static int inputPositiveInt(String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = sc.nextInt();
                sc.nextLine(); // Giải phóng bộ đệm ngay lập tức sau khi nhập thành công
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Invalid input, please re-input!");
                }
            } catch (Exception ex) {
                System.out.println("Invalid input, please re-input!");
                sc.nextLine(); // Giải phóng bộ đệm
            }
        }
    }
    
}