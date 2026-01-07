public class Main {

    public static void main(String[] args) {

        Task task = new Task();
        try {
		    System.out.println("Result:");
            Task.print(task.B3());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
