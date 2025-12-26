import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Task task = new Task();
        try {
		    System.out.println("Result:");
            // task.showDataset();
            Task.print(task.C9());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // List<Integer> list = Arrays.asList(5, 2, 4, 2, 4, 6, 1, 2, 4); // 5 2 4 6 1

        // Map<Integer, String> result = list.stream()
        //     .collect(Collectors.toMap(
        //         (n) -> n,
        //         (n) -> "Hello world " + n,
        //         (n1, n2) -> n1,
        //         () -> new LinkedHashMap<Integer, String>()
        //     ));
        // result.forEach((key, value) -> System.out.println("k: " + key + ", v: " + value));

    }

}
