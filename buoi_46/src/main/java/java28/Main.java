package java28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String username = "root";
		String password = "12345678";
        String databaseName = "School_Management";
		String url = "jdbc:mysql://localhost:3306/";
		
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url + databaseName, username, password);
			
            // String id = "S04";
			// String name = "E";
			// int age = 29;
			// String sql = String.format("INSERT INTO Students (student_id, student_name, age) VALUES ('%s', '%s', %d)", id, name, age);

            // String id = "S02";
			// String name = "X";
			// int age = 10;
			// String sql = String.format("UPDATE Students SET student_name = '%s', age = %d WHERE student_id = '%s'", name, age, id);

            // String id = "S03";
			// String sql = String.format("DELETE FROM Students WHERE student_id = '%s'", id);
            
			// Statement statement = connection.createStatement();
			// int result = statement.executeUpdate(sql);
            // if (result == 0) {
            //     System.out.printf("SQL executed failed (with %d rows affected)\n", result);
            // } else {
            //     System.out.printf("SQL executed success (with %d rows affected)\n", result);
            // }
			// statement.close();

            // String sql = "SELECT * FROM Students";
            String sql = "SELECT * FROM Students WHERE age>22";

			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
			}
			statement.close();
			rs.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(connection != null) {
			try {
				connection.close();
				System.out.println("Database connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

    }

}