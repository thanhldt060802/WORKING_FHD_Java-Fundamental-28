import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Chưa thể hiện tính đa hình
        // Employee x1 = new Employee("E01", "A", 500, 2.5);
		// Developer x2 = new Developer("E02", "B", 500, 2.5, 69, 5.9);
		// Designer x3 = new Designer("E03", "C", 500, 2.5, 10, 5, 15.9, 8.9);
		// Manager x4 = new Manager("E04", "D", 500, 2.5, 0.4);

        // Thể hiện tính đa hình
        // Employee x1 = new Employee("E01", "A", 500, 2.5);
		// Employee x2 = new Developer("E02", "B", 500, 2.5, 69, 5.9);
		// Employee x3 = new Designer("E03", "C", 500, 2.5, 10, 5, 15.9, 8.9);
		// Employee x4 = new Manager("E04", "D", 500, 2.5, 0.4);

		// System.out.println(x1);
		// System.out.println("Actual salary: " + x1.calculateActualSalary());

		// System.out.println();

		// System.out.println(x2);
		// System.out.println("Actual salary: " + x2.calculateActualSalary());

		// System.out.println();

		// System.out.println(x3);
		// System.out.println("Actual salary: " + x3.calculateActualSalary());

		// System.out.println();

		// System.out.println(x4);
		// System.out.println("Actual salary: " + x4.calculateActualSalary());

        // int[] arr = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        // System.out.println(Algorithms.search(arr, 10));

        // String[] arr = new String[] {
        //     new String("abc"), // arr[0] = new String("abc")
        //     new String("xyz"),
        //     new String("def"),
        //     new String("123"),
        //     new String("456")
        // };
        // System.out.println(Algorithms.search(arr, "def"));

        // Student[] arr = new Student[] {
        //     new Student("001", "Thành", 19),
        //     new Student("002", "Phúc", 20),
        //     new Student("003", "Tùng", 21),
        //     new Student("004", "Thành", 20),
        //     new Student("005", "Dương", 22)
        // };
        // System.out.println(Algorithms.filter(arr, "kjsvkasjdnv"));

        // int[] arr = new int[] {4, 2, 6, 1, 5, 3, 5, 2, 4};
        // System.out.println("Before sorting: " + Arrays.toString(arr));
        // Algorithms.sort(arr);
        // System.out.println("After sorting: " + Arrays.toString(arr));

        // String[] arr = new String[] {
        //     "abc",
        //     "def",
        //     "bac",
        //     "cab",
        //     "dec",
        //     "abf"
        // };
        // System.out.println("Before sorting: " + Arrays.toString(arr));
        // Algorithms.sort(arr);
        // System.out.println("After sorting: " + Arrays.toString(arr));

        Student[] arr = new Student[] {
            new Student("001", "Thành", 23),
            new Student("002", "Phúc", 22),
            new Student("003", "Tùng", 21),
            new Student("004", "Thành", 19),
            new Student("005", "Dương", 22)
        };
        System.out.println("Before sorting: " + Arrays.toString(arr));
        Algorithms.sortByAge(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));

    }

}
