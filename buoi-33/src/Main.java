import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        // String[] arr = new String[]{};
        // for (String e : arr) {

        // }

        // String str = "";
        // for (char c : str) {

        // }

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
		// students.add(1, new Student("S04", "D", 24));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
		// students.remove(new Student("S02"));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
        // students.get(0);

        // Student s1 = new Student("S01", "A", 19);
        // Student s2 = new Student("S02", "B", 25);
        // Student s3 = new Student("S03", "C", 23);

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(s1);
		// students.add(s2);
		// students.add(s3);
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
        // Student s4 = new Student("S02", "B", 25);
		// System.out.println(students.remove(s4));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // // System.out.println(s2.equals(s2));

        // ArrayList<Student> students = new ArrayList<Student>();
		// students.add(new Student("S01", "A", 19));
		// students.add(new Student("S02", "B", 25));
		// students.add(new Student("S03", "C", 23));
		// System.out.println(students);
		// students.clear();
		// System.out.println(students);

        // LinkedList<Student> students = new LinkedList<Student>();
		// students.addFirst(new Student("S01", "A", 19));
		// students.addFirst(new Student("S02", "B", 25));
		// students.addFirst(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // LinkedList<Student> students = new LinkedList<Student>();
		// students.addLast(new Student("S01", "A", 19));
		// students.addLast(new Student("S02", "B", 25));
		// students.addLast(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
        // System.out.println(students.get(2));
        // System.out.println(students.getFirst());
        // System.out.println(students.getLast());

        // test();

        // Stack<Student> students = new Stack<Student>();
		// students.push(new Student("S01", "A", 19));
		// students.push(new Student("S02", "B", 25));
		// students.push(new Student("S03", "C", 23));
		// // for(Student s : students) {
		// // 	System.out.println(s);
		// // }
        // while (!students.isEmpty()) {
        //     Student s = students.pop();
        //     System.out.println(s);
        // }
        // System.out.println(students);

        String str = "abcxyz";
        Stack<Character> stack = new Stack<Character>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);

    }

    // public static void test() {
    //     test();
    // }

}
