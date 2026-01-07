import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        // StudentManagement sm = new StudentManagement();

		// System.out.println("StudentManagement after initing:");
		// sm.showAllStudents();

		// System.out.println();

		// sm.addStudent(new Student("S01", "A", 21));
		// sm.addStudent(new Student("S02", "B", 22));
		// sm.addStudent(new Student("S03", "C", 23));
		// sm.addStudent(new Student("S03", "D", 19));
		// System.out.println("StudentManagement after adding 3 students:");
		// sm.showAllStudents();

		// System.out.println();

		// System.out.println("Searching student with id by S01:");
        // Student foundStudent = sm.searchStudentById("S01");
		// System.out.println(foundStudent != null ? foundStudent.getInfo() : "Not found");

		// System.out.println();

		// Student student = new Student("S02", "X", 19);
		// sm.updateStudent(student);
		// System.out.println("StudentManagement after updating student has id by S02:");
		// sm.showAllStudents();

		// System.out.println();

		// sm.removeStudentById("S04");
		// System.out.println("StudentManagement after remvoving student has id by S02:");
		// sm.showAllStudents();

        StudentManagement sm = new StudentManagement();

        while(true) {
            System.out.println("1 -> Show all students");
            System.out.println("2 -> Add student");
            System.out.println("3 -> Update student");
            System.out.println("4 -> Remove student");
            System.out.println("5 -> Search student");
            System.out.println("0 -> Exit");

            int choice = MyInputter.inputInt("Input your choice: ");
            switch (choice) {
                case 0: {
                    System.out.println("Good bye!");
                    return;
                }
                case 1: {
                    sm.showAllStudents();
                    break;
                }
                case 2: {
                    String id = MyInputter.inputString("Enter student id for creating: ");
                    String name = MyInputter.inputString("Enter student name: ");
                    int age = MyInputter.inputInt("Enter student age: ");
                    Student newStudent = new Student(id, name, age);
                    sm.addStudent(newStudent);
                    break;
                }
                case 3: {
                    String id = MyInputter.inputString("Enter student id for updating: ");
                    String name = MyInputter.inputString("Enter student name: ");
                    int age = MyInputter.inputInt("Enter student age: ");
                    Student updatedStudent = new Student(id, name, age);
                    sm.updateStudent(updatedStudent);
                    break;
                }
                case 4: {
                    String id = MyInputter.inputString("Enter student id for removing: ");
                    sm.removeStudentById(id);
                    break;
                }
                case 5: {
                    String id = MyInputter.inputString("Enter student id for searching: ");
                    Student foundStudent = sm.searchStudentById(id);
                    System.out.println(foundStudent != null ? foundStudent.getInfo() : "Not found");
                    break;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }

    }

}