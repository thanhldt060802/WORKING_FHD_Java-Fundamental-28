import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Tan Thanh");
        // list.add("Thu Thuy");
        // list.add("Thanh Vinh");
        // list.add("Ngoc Quy");
        // list.add("Minh Dat");

        // // list.stream().forEach(null);
        
        // Consumer<String> action = (String str) -> {
        //     System.out.println(str.toUpperCase());
        // };
        // forEach(list, action);

        // ArrayList<Integer> list = new ArrayList<Integer>();
        // list.add(2);
        // list.add(4);
        // list.add(6);
        // list.add(8);
        // list.add(10);

        // Consumer<Integer> action = (n) -> {
        //     System.out.println(n * n);
        // };
        // forEach(list, action);

        // ArrayList<Student> list = new ArrayList<Student>();
        // list.add(new Student("001", "Thanh", 8.9));
        // list.add(new Student("002", "Dat", 9.5));
        // list.add(new Student("003", "Vinh", 7.8));

        // Consumer<Student> action1 = (stu) -> {
        //     stu.setAvg(5);
        // };
        // forEach(list, action1);

        // Consumer<Student> action2 = (stu) -> {
        //     System.out.println(stu);
        // };
        // forEach(list, action2);

        // HashMap<Integer, String> weekDays = new HashMap<Integer, String>();
        // weekDays.put(2, "monday");
        // weekDays.put(3, "tuesday");
        // weekDays.put(4, "wednesday");
        // weekDays.put(5, "thursday");
        // weekDays.put(6, "friday");
        // weekDays.put(7, "saturday");
        // weekDays.put(8, "sunday");

        // forEach(weekDays, (Integer key, String value) -> {
        //     System.out.println("Key=" + key + " -> " + "Value=" + value.toUpperCase());
        // });


        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> condition = (n) -> {
        //     return n % 2 == 0;
        // };
        // List<Integer> afterFiltering = filter(list, condition);

        // Consumer<Integer> action = (n) -> {
        //     System.out.println(n);
        // };
        // forEach(afterFiltering, action);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> afterFiltering = filter(list, (n) -> n % 2 == 0);

        forEach(afterFiltering, (n) -> System.out.println(n));

    }

    public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for(T e : list) {
			consumer.accept(e);
		}
	}

    public static <T, U> void forEach(Map<T, U> map, BiConsumer<T, U> biConsumer) {
		for(Entry<T, U> entry : map.entrySet()) {
			biConsumer.accept(entry.getKey(), entry.getValue());
		}
	}

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> result = new ArrayList<T>();
		for(T e : list) {
			if(predicate.test(e)) {
				result.add(e);
			}
		}
		return result;
	}
    
}
