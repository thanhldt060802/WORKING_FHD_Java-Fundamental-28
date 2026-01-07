import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
		// try {
		// 	System.out.print("Enter a (integer number): ");
		// 	int a = Integer.parseInt(sc.nextLine());
		// 	System.out.print("Enter b (integer number): ");
		// 	int b = Integer.parseInt(sc.nextLine());
		// 	System.out.println(a / b);
		// } catch(NumberFormatException e) {
		// 	System.out.println("Invalid input!");
		// } catch(ArithmeticException e) {
		// 	System.out.println("Invalid math operation!");
		// } finally {
		// 	System.out.println("End program!");
		// 	sc.close();
		// }

        // try {
		// 	System.out.print("Enter a (integer number): ");
		// 	int a = Integer.parseInt(sc.nextLine());
		// 	System.out.print("Enter b (integer number): ");
		// 	int b = Integer.parseInt(sc.nextLine());
		// 	System.out.println(a / b);
		// } catch(NumberFormatException e) {
		// 	System.out.println("Invalid input!");
		// } finally {
		// 	System.out.println("End program!");
		// 	sc.close();
		// }

        // System.out.print("Enter a (integer number): ");
		// int a = Integer.parseInt(sc.nextLine());
		// System.out.print("Enter b (integer number): ");
		// int b = Integer.parseInt(sc.nextLine());
		// System.out.println(a / b);

        // Scanner sc = new Scanner(System.in);
        // try {
		// 	System.out.print("Enter a (integer number): ");
		// 	int a = Integer.parseInt(sc.nextLine());
		// 	System.out.print("Enter b (integer number): ");
		// 	int b = Integer.parseInt(sc.nextLine());
		// 	System.out.println(a / b);
		// } catch(Exception e) {
		// 	// System.out.println("Something wrong!");
        //     // System.out.println(e.getMessage());
        //     e.printStackTrace();
        // } finally {
		// 	System.out.println("Free resource!");
		// 	sc.close();
		// }

        // try (Scanner sc = new Scanner(System.in)) {
		// 	System.out.print("Enter a (integer number): ");
		// 	int a = Integer.parseInt(sc.nextLine());
		// 	System.out.print("Enter b (integer number): ");
		// 	int b = Integer.parseInt(sc.nextLine());
		// 	System.out.println(a / b);
		// }

        // System.out.println("End program!");
        
        File file = new File("C:\\Users\\thanh\\Desktop\\data.txt");
        try (FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			while(true) {
				String line = bufferedReader.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

        System.out.println("End program!");

    }

}
