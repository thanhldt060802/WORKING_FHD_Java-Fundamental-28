package java28;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        // Connection.openConnection();
        // Connection.openConnection();
        // Connection.openConnection();
        // Connection.openConnection();
        // Connection.openConnection();
        // Connection.openConnection();

        // Connection connection = Connection.getConnection();
        // if (connection == null) {
        //     System.out.println("Connection is null!");
        //     return;
        // }

        // connection.greeting();

        // Connection.closeConnection();
        // Connection.closeConnection();
        // Connection.closeConnection();
        // Connection.closeConnection();
        // Connection.closeConnection();
        // Connection.closeConnection();
        
        // Connection.openConnection();

        // connection = Connection.getConnection();
        // if (connection == null) {
        //     System.out.println("Connection is null!");
        //     return;
        // }

        // connection.greeting();

        // Connection.openConnection();
        // Connection.closeConnection();
        // Connection.openConnection();
        // Connection.closeConnection();
        // Connection.openConnection();
        // Connection.closeConnection();
        // Connection.openConnection();
        // Connection.closeConnection();

        MySQLConnection.openConnection("root", "12345678", "school_management", "jdbc:mysql://localhost:3306/");
		
		StudentDAO studentDAO = new StudentDAO();
		
		// for(Student stu : studentDAO.getAllStudents()) {
		// 	System.out.println(stu);
		// }
		
		// System.out.println();
		
		// if(studentDAO.addStudent(new Student("S04", "D", 23))) {
		// 	System.out.println("Add success!");
		// } else {
		// 	System.out.println("Add failed!");
		// }
		// for(Student stu : studentDAO.getAllStudents()) {
		// 	System.out.println(stu);
		// }
		
		// System.out.println();
		
		// if(studentDAO.updateStudent(new Student("S05", "X", 22))) {
		// 	System.out.println("Update success!");
		// } else {
		// 	System.out.println("Update failed!");
		// }
		// for(Student stu : studentDAO.getAllStudents()) {
		// 	System.out.println(stu);
		// }
		
		// System.out.println();
		
		// if(studentDAO.removeStudentById("S04")) {
		// 	System.out.println("Remove success!");
		// } else {
		// 	System.out.println("Remove failed!");
		// }
		// for(Student stu : studentDAO.getAllStudents()) {
		// 	System.out.println(stu);
		// }
		
		// System.out.println();
		
		System.out.println(studentDAO.getStudentById("S04"));
		
		MySQLConnection.closeConnection();

    }

}