import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        // String a = new String("Le");
        // StringBuilder b = new StringBuilder("Dao Tan");
        // StringBuffer c = new StringBuffer("Thanh");

        // // appendToString(a, "ABC");
        // appendToString(b, "ABC");
        // appendToString(c, "ABC");

        // showData(a);
        // showData(b);
        // showData(c);

        Student[] students = new Student[] {
            new Student("01", "A", 22),
            new Student("02", "B", 24),
            new Student("03", "S", 23),
            new Student("04", "D", 21),
            new Student("05", "E", 22),
            new Student("06", "F", 22),
            new Student("07", "A", 21),
            new Student("08", "E", 23)
        };

        // Comparator<Student> c = new Comparator<Student>() {
        //     @Override
        //     public int compare(Student o1, Student o2) {
        //         return Integer.compare(o1.getAge(), o2.getAge());
        //     }
        // };
        // Comparator<Student> c = (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge());
        // Comparator<Student> c = Main::myCompare;

        // System.out.println("Before sorting:");
        // for(Student s : students) {
        //     System.out.println(s);
        // }
        // // Arrays.sort(students, c);
        // // Arrays.sort(students, (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        // Arrays.sort(students, Main::myCompare);
        // System.out.println("After sorting:");
        // for(Student s : students) {
        //     System.out.println(s);
        // }

        // // Anonymous Class
		// Task task1 = new Task() {
			
		// 	@Override
		// 	public void doSomething() {
		// 		System.out.println("Task 1 is running ...");
		// 	}
			
		// };
		
		// // Lambda
		// Task task2 = () -> {
		// 	System.out.println("Task 2 is running ...");
		// };
		
		// // Method Reference
		// Task task3 = Main::simpleMethod;
		
		// task1.doSomething();
		// task2.doSomething();
		// task3.doSomething();

        // MyInterface1 obj1 = () -> {
		// 	return "Hello world";
		// };
		
		// MyInterface2 obj2 = (x, y) -> {
		// 	return String.format("%s, %d", x, y);
		// };
		
        // System.out.println(obj1.doSomething());
		// System.out.println(obj2.doSomething("Goodbye world", 100));
    
        // MyInterface1 obj1 = Main::simpleMethod1;
		// MyInterface2 obj2 = Main::simpleMethod2;
		
		// System.out.println(obj1.doSomething());
		// System.out.println(obj2.doSomething("Goodbye world", 100));

        Student stu = new Student("01", "Thanh", 23);

        // Task myTask = stu::greeting;
        // myTask.doSomething();

        // SomeoneDoSomething<Student, String> sds = (s) -> {
        //     return s.getId();
        // };
        SomeoneDoSomething<Student, String> sds = Student::getName;
        System.out.println(sds.doSomething(stu));

        // SomeoneDoSomething<String, String> sds = stu::test;
        // System.out.println(sds.doSomething("Thanh"));

    }

    public static int myCompare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }

    public static String simpleMethod1() {
		return "Hello world";
	}
	
	public static String simpleMethod2(String str, int n) {
		return String.format("%s, %d", str, n);
	}

    // public static void simpleMethod1() {
	// 	System.out.println("Hello world");
	// }
	
	// public static void simpleMethod2(String str, int n) {
	// 	System.out.println(String.format("%s, %d", str, n));
	// }

    // public static void simpleMethod() {
	// 	System.out.println("Task 3 is running ...");
	// }

    // public static void showData(CharSequence cs) {
    //     System.out.println(cs);
    // }

    // public static void appendToString(Appendable aStr, String anotherStr) {
    //     try {
    //         aStr.append(anotherStr);
    //     } catch (IOException e) {
    //         e.printStackTrace();
    //     }
    // }

}
