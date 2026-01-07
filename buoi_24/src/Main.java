import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // File file = new File("C:\\Users\\thanh\\Desktop\\data.txt");
        // try (FileReader fileReader = new FileReader(file);
		// 	BufferedReader bufferedReader = new BufferedReader(fileReader)) {
		// 	while(true) {
		// 		String line = bufferedReader.readLine();
		// 		if(line == null) {
		// 			break;
		// 		}
		// 		System.out.println(line);
		// 	}
		// } catch(Exception e) {
		// 	e.printStackTrace();
		// }

        // Scanner sc = new Scanner(System.in);

        // File file = new File("C:\\Users\\thanh\\Desktop\\data.txt");
        // try (FileWriter fileWriter = new FileWriter(file);
		// 	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        //     String choice;
		// 	while(true) {
		// 		System.out.println("------------------------------");
		// 		System.out.println("1 -> Enter new line");
		// 		System.out.println("2 -> Flush current data");
		// 		System.out.println("3 -> Close program");
		// 		System.out.print("Your choice: ");
		// 		choice = sc.nextLine();
		// 		if(choice.equals("1")) {
		// 			System.out.print("Your data line: ");
		// 			bufferedWriter.write(sc.nextLine() + "\n");
		// 		} else if(choice.equals("2")) {
		// 			bufferedWriter.flush();
		// 		} else if(choice.equals("3")) {
		// 			break;
		// 		} else {
		// 			System.out.println("Invalid choice!");
		// 		}
		// 	}
		// } catch(Exception e) {
		// 	e.printStackTrace();
		// }

        // File file = new File("C:\\Users\\thanh\\Desktop\\data.txt");
        // try (FileReader fileReader = new FileReader(file);
		// BufferedReader bufferedReader = new BufferedReader(fileReader)) {
        //     int batchSize = 5;
        //     String[] batchResult = new String[batchSize];
        //     int index = 0;
		// 	while(true) {
		// 		String line = bufferedReader.readLine();
		// 		if(line == null) {
        //             process(batchResult);
		// 			break;
		// 		}
        //         batchResult[index] = line;
        //         index++;
        //         batchSize--;
        //         if (batchSize <= 0) {
        //             batchSize = 5;
        //             index = 0;
        //         } else {
        //             continue;
        //         }
		// 		process(batchResult);
        //         batchResult = new String[batchSize];
		// 	}
		// } catch(Exception e) {
		// 	e.printStackTrace();
		// }

        // Ghi đối tượng

        // File file = new File("C:\\Users\\thanh\\Desktop\\data.dat");
        // try (FileOutputStream fos = new FileOutputStream(file);
		// 	ObjectOutputStream oos = new ObjectOutputStream(fos)) {

        //     Student a1 = new Student("001", "Thanh", 29);
        //     Student a2 = new Student("002", "Phuc", 25);
        //     Student a3 = new Student("003", "Thanh", 29);
        //     Student a4 = new Student("004", "Phuc", 25);
            
        //     oos.writeObject(a1);
        //     oos.writeObject(a2);
        //     oos.writeObject(a3);
        //     oos.writeObject(a4);

		// } catch(Exception e) {
		// 	e.printStackTrace();
		// }

        // Đọc đối tượng

        File file = new File("C:\\Users\\thanh\\Desktop\\data.dat");
        try (FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			while(true) {
				Student stu = (Student)ois.readObject();
				System.out.println(stu);
			}
		} catch (EOFException e) {
            System.out.println("Done!");
        } catch(Exception e) {
			e.printStackTrace();
		}

    }

    public static void process(String[] batchResult) {
       System.out.println(Arrays.toString(batchResult));
    }

}
