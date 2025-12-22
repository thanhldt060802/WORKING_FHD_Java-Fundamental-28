public class Main {

    public static void main(String[] args) {

        Task task = new Task();
        try {
		    System.out.println("Result:");
            // task.showDataset();
            Task.print(task.B11());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
