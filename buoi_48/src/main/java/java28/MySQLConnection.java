package java28;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

	private static MySQLConnection instance;

	private Connection connection;
	
	private MySQLConnection(String username, String password, String databaseName, String url) throws SQLException {
        this.connection = DriverManager.getConnection(url + databaseName, username, password);
	}
	
	public static void openConnection(String username, String password, String databaseName, String url) {
		if (instance == null) {
            try {
                instance = new MySQLConnection(username, password, databaseName, url);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("Connection is opened!");
        }
	}
	
	public static Connection getConnection() {
		if (instance == null) {
            return null;
        }

        return instance.connection;
	}
	
	public static void closeConnection() {
		if (instance != null) {
            try {
                instance.connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            instance = null;
            System.out.println("Connection is closed!");
        }
	}

}
