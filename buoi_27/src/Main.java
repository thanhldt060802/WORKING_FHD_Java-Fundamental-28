import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // MysteriousBox<String> box1 = new MysteriousBox<String>("Hello world");
        // System.out.println(box1);
        // System.out.println(box1.getValue().toUpperCase());

        // MysteriousBox<Integer> box2 = new MysteriousBox<Integer>(10);
        // System.out.println(box2);
        // System.out.println(box2.getValue());

        // MysteriousBox<Employee> box3 = new MysteriousBox<Employee>(new Developer("001", "Thành", 500, 0.5));
        // System.out.println(box3);

        // System.out.println(box2.equalsByType("Hello"));

        // MysteriousBox<Integer> box2 = new MysteriousBox<Integer>(10, 3.14);

        // UtilMethods<String> util = new UtilMethods<String>();
        // util.staticPrint(10);

        // UtilMethods.staticPrint(null);
        
        /*
         * - Tham số kiểu khai báo trong phần khai báo lớp chỉ tác động đến các thành phần non-static.
         * - Các thành phần static muốn dùng tham số kiểu thì phải luôn tự khai khai báo thủ công.
         */

        // Student[] students = new Student[] {
		// 	new Student("S01", "A", 29),
		// 	new Student("S02", "B", 21),
		// 	new Student("S03", "C", 24)
		// };
		// System.out.println(search(students, new Student("S01")));
		// System.out.println(search(students, new Student("S04")));

        ManagementSystem<Student> ms = new ManagementSystem<Student>();
		System.out.println("After initing:");
		ms.showAll();
		
		System.out.println();
		
		ms.add(new Student("S01", "A", 29));
		ms.add(new Student("S02", "A", 21));
		ms.add(new Student("S03", "A", 24));
		ms.add(new Student("S01", "D", 19));
		System.out.println("After adding some student:");
		ms.showAll();
		
		System.out.println();
		
		ms.update(new Student("S01", "X", 100));
		System.out.println("After updating a student:");
		ms.showAll();
		
		System.out.println();
		
		ms.remove(new Student("S01"));
		System.out.println("After removing a student:");
		ms.showAll();
		
		System.out.println();
		System.out.println("After searching a student:");
		System.out.println(ms.search(new Student("S02")));

    }

    public static <T> T search(T[] arr, T key) {
		for(T e : arr) {
			if(e.equals(key)) {
				return e;
			}
		}
		return null;
	}

}
