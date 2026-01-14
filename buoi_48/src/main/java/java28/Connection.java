package java28;

public class Connection {

    private static Connection instance;

    private Connection() {
    }

    public void greeting() {
        System.out.println("Hello world!");
    }

    public static void openConnection() {
        if (instance == null) {
            instance = new Connection(); // Chỉ duy nhất một đối tượng được khởi tạo từ class Connection này
            System.out.println("Connection is opened!");
        }
    }

    public static Connection getConnection() {
        return instance;
    }

    public static void closeConnection() {
        if (instance != null) {
            instance = null;
            System.out.println("Connection is closed!");
        }
    }
    
}
