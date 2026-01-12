package java28;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // String username = "root";
		// String password = "12345678";
        // String databaseName = "School_Management";
		// String url = "jdbc:mysql://localhost:3306/";
		
		// Connection connection = null;
		
		// try {
		// 	connection = DriverManager.getConnection(url + databaseName, username, password);
			
        //     // String sql = "INSERT INTO students (student_id, student_name, age) VALUES (?, ?, ?)";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setString(1, "S05");
		// 	// statement.setString(2, "E");
		// 	// statement.setInt(3, 29);
		// 	// statement.executeUpdate();
		// 	// statement.close();

		// 	// String sql = "UPDATE students SET student_name = ?, age = ? WHERE student_id = ?";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setString(1, "X");
		// 	// statement.setInt(2, 10);
		// 	// statement.setString(3, "S02");
		// 	// statement.executeUpdate();
		// 	// statement.close();

		// 	// String sql = "DELETE FROM students WHERE student_id = ?";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setString(1, "S02");
		// 	// statement.executeUpdate();
		// 	// statement.close();

		// 	// connection.setAutoCommit(false);
        //     // String sql = "INSERT INTO students (student_id, student_name, age) VALUES (?, ?, ?)";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setString(1, "S06");
		// 	// statement.setString(2, "E");
		// 	// statement.setInt(3, 29);
		// 	// statement.executeUpdate();

		// 	// System.out.println("Stop and wait 15s");
		// 	// Thread.sleep(15000);

		// 	// System.out.println("SQL committed");
		// 	// connection.commit();
		// 	// statement.close();

		// 	// String sql = "SELECT * FROM students";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// ResultSet rs = statement.executeQuery();
		// 	// while(rs.next()) {
		// 	// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
		// 	// }
		// 	// statement.close();
		// 	// rs.close();

		// 	// String sql = "SELECT * FROM students WHERE student_id = ?";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setString(1, "S01");
		// 	// ResultSet rs = statement.executeQuery();
		// 	// while(rs.next()) {
		// 	// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
		// 	// }
		// 	// statement.close();
		// 	// rs.close();

		// 	// String sql = "SELECT * FROM students WHERE age > ?";
		// 	// PreparedStatement statement = connection.prepareStatement(sql);
		// 	// statement.setInt(1, 25);
		// 	// System.out.println(statement.toString());
		// 	// ResultSet rs = statement.executeQuery();
		// 	// while(rs.next()) {
		// 	// 	System.out.println(rs.getString("student_id") + ", " + rs.getString("student_name") + ", " + rs.getInt("age"));
		// 	// }
		// 	// statement.close();
		// 	// rs.close();


		// } catch (Exception e) {
		// 	e.printStackTrace();
		// }
		
		// if(connection != null) {
		// 	try {
		// 		connection.close();
		// 		System.out.println("Database connection closed.");
		// 	} catch (SQLException e) {
		// 		e.printStackTrace();
		// 	}
		// }

		String root = "root";
		String password = "12345678";
		String databaseName = "internet_banking";
		String url = "jdbc:mysql://localhost:3306/";
		
		Scanner sc = new Scanner(System.in);
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(url + databaseName, root, password);

			System.out.print("Enter username: ");
			String usernameInput = sc.nextLine();
			System.out.print("Enter password: ");
			String passwordInput = sc.nextLine();

			// String sql = String.format("SELECT * FROM accounts WHERE username = '%s' AND password = '%s'", usernameInput, passwordInput);
			// Statement statement = connection.createStatement();
			// ResultSet rs = statement.executeQuery(sql);
			// while(rs.next()) {
			// 	System.out.println(rs.getString("username") + ", " + rs.getString("password") + ", " + rs.getDouble("balance"));
			// }
			// statement.close();
			// rs.close();

			String sql = "SELECT * FROM accounts WHERE username = ? AND password = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, usernameInput);
			statement.setString(2, passwordInput);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("username") + ", " + rs.getString("password") + ", " + rs.getDouble("balance"));
			}
			statement.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sc.close();
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

    }

}