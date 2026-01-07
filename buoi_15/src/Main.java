import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        StudentManagement sm = new StudentManagement();

		System.out.println("StudentManagement after initing:");
		sm.showAllStudents();

		System.out.println();

		sm.addStudent(new Student("S01", "A", 21));
		sm.addStudent(new Student("S02", "B", 22));
		sm.addStudent(new Student("S03", "C", 23));
		sm.addStudent(new Student("S03", "D", 19));
        sm.addStudent(new Student("S04", "", 19));
        sm.addStudent(new Student("S05", "D", 0));
		System.out.println("StudentManagement after adding 3 students:");
		sm.showAllStudents();
    }

}
