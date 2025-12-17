import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {

        // COLLECT

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(1, "A", 23));
        // list.add(new Student(2, "D", 24));
        // list.add(new Student(3, "B", 21));
        // list.add(new Student(4, "E", 22));
        // list.add(new Student(5, "D", 24));
        // list.add(new Student(6, "A", 24));
        // list.add(new Student(7, "B", 23));
        // list.add(new Student(8, "E", 22));
        // list.add(new Student(9, "D", 21));
        // list.add(new Student(10, "E", 22));

        // // Map<Long, Student> map = list.stream()
        // //     .collect(Collectors.toMap(
        // //         (student) -> student.getId(),
        // //         (student) -> student));
        // // // map.forEach((key, value) -> System.out.println(key + ": " + value));
        // System.out.println(map.get(4L));

        // Map<Long, String> map = list.stream()
        //     .collect(Collectors.toMap(
        //         (student) -> student.getId(),
        //         (student) -> student.getName()));
        // map.forEach((key, value) -> System.out.println(key + ": " + value));

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(1, "A", 23));
        // list.add(new Student(2, "D", 24));
        // list.add(new Student(3, "B", 21));
        // list.add(new Student(4, "E", 22));
        // list.add(new Student(5, "D", 24));
        // list.add(new Student(6, "A", 24));
        // list.add(new Student(7, "B", 23));
        // list.add(new Student(8, "E", 22));
        // list.add(new Student(9, "D", 21));
        // list.add(new Student(10, "E", 22));

        // Map<Integer, List<Student>> map = list.stream()
        //     .collect(Collectors.groupingBy(
        //         (student) -> student.getAge()));
        // map.forEach((key, value) -> {
        //     System.out.println(key + ":");
        //     value.forEach((student) -> System.out.println(student));
        // });

        // Map<String, List<Student>> map = list.stream()
        //     .collect(Collectors.groupingBy(
        //         (student) -> student.getName()));
        // map.forEach((key, value) -> {
        //     System.out.println(key + ":");
        //     value.forEach((student) -> System.out.println(student));
        // });

        // UTIL FUNCTION

        // List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Integer result = list.stream()
        //     .reduce(10, (n1, n2) -> n1 + n2);
        // System.out.println(result);

        // Integer result = list.stream()
        //     .reduce((n1, n2) -> n1 + n2)
        //     .get();
        // System.out.println(result);

        // List<TripleNumber> list = new ArrayList<TripleNumber>();
		// list.add(new TripleNumber(4, 2, 5));
		// list.add(new TripleNumber(2, 3, 1));
		// list.add(new TripleNumber(4, 5, 1));
		// list.add(new TripleNumber(3, 6, 2));
		// list.add(new TripleNumber(1, 5, 3));
		// list.add(new TripleNumber(4, 3, 1));
		// list.add(new TripleNumber(3, 2, 3));
		// list.add(new TripleNumber(1, 5, 6));
		// list.add(new TripleNumber(3, 5, 4));
		// list.add(new TripleNumber(2, 2, 3));

        // TripleNumber result = list.stream()
        //     .reduce((triple1, triple2) -> new TripleNumber(triple1.n1 + triple2.n2, triple1.n2 + triple2.n2, triple1.n3 + triple2.n3))
        //     .get();
        // System.out.println(result);

        // List<TripleNumber> list = new ArrayList<TripleNumber>();
		// list.add(new TripleNumber(4, 2, 5));
		// list.add(new TripleNumber(2, 3, 1));
		// list.add(new TripleNumber(4, 5, 1));
		// list.add(new TripleNumber(3, 6, 2));
		// list.add(new TripleNumber(1, 5, 3));
		// list.add(new TripleNumber(4, 3, 1));
		// list.add(new TripleNumber(3, 2, 3));
		// list.add(new TripleNumber(1, 5, 6));
		// list.add(new TripleNumber(3, 5, 4));
		// list.add(new TripleNumber(2, 2, 3));

        // TripleNumber result = list.stream()
        //     .filter((triple) -> triple.n1 % 2 == 0 && triple.n2 % 2 == 0 && triple.n3 % 2 == 0)
        //     .findFirst()
        //     .orElse(null);
        // System.out.println(result);

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(1, "A", 23));
        // list.add(new Student(2, "D", 24));
        // list.add(new Student(3, "B", 21));
        // list.add(new Student(4, "E", 22));
        // list.add(new Student(5, "D", 24));
        // list.add(new Student(6, "A", 24));
        // list.add(new Student(7, "B", 23));
        // list.add(new Student(8, "E", 22));
        // list.add(new Student(9, "D", 21));
        // list.add(new Student(10, "E", 22));

        // Long findingId = 11L;
        // Student result = list.stream()
        //     .filter((student) -> student.getId() == findingId)
        //     .findFirst()
        //     .orElse(null);
        // System.out.println(result);

        // Student result = list.stream()
        //     .filter((student) -> student.getAge() == 22)
        //     .findFirst()
        //     .orElse(null);
        // System.out.println(result);

        // long result = list.stream()
        //     .count();
        // System.out.println(result);

        // List<Student> list = new ArrayList<Student>();
        // list.add(new Student(1, "A", 23));
        // list.add(new Student(2, "D", 24));
        // list.add(new Student(3, "B", 21));
        // list.add(new Student(4, "E", 22));
        // list.add(new Student(5, "D", 24));
        // list.add(new Student(6, "A", 24));
        // list.add(new Student(7, "B", 23));
        // list.add(new Student(8, "E", 22));
        // list.add(new Student(9, "D", 21));
        // list.add(new Student(10, "E", 22));

        // boolean result = list.stream()
        //     .allMatch((student) -> student.getAge() > 23);
        // System.out.println(result);

        // boolean result = list.stream()
        //     .allMatch((student) -> student.getAge() > 20);
        // System.out.println(result);

        // boolean result = list.stream()
        //     .anyMatch((student) -> student.getAge() > 23);
        // System.out.println(result);

        // boolean result = list.stream()
        //     .anyMatch((student) -> student.getAge() > 25);
        // System.out.println(result);

        // boolean result = list.stream()
        //     .noneMatch((student) -> student.getAge() > 23);
        // System.out.println(result);

        // boolean result = list.stream()
        //     .noneMatch((student) -> student.getAge() > 25);
        // System.out.println(result);

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "A", 23));
        list.add(new Student(2, "D", 24));
        list.add(new Student(3, "B", 21));
        list.add(new Student(4, "E", 22));
        list.add(new Student(5, "D", 24));
        list.add(new Student(6, "A", 24));
        list.add(new Student(7, "B", 23));
        list.add(new Student(8, "E", 22));
        list.add(new Student(9, "D", 21));
        list.add(new Student(10, "E", 22));

        // Student student = list.stream()
        //     .min((stu1, stu2) -> stu1.getAge() - stu2.getAge())
        //     .get();
        // System.out.println(student);

        // Student student = list.stream()
        //     .max((stu1, stu2) -> stu1.getAge() - stu2.getAge())
        //     .get();
        // System.out.println(student);

        // int result = list.stream()
        //     .mapToInt((student) -> student.getAge())
        //     .sum();
        // System.out.println(result);

        // double result = list.stream()
        //     .mapToInt((student) -> student.getAge())
        //     .average()
        //     .getAsDouble();
        // System.out.println(result);

        IntSummaryStatistics summary = list.stream()
            .mapToInt((student) -> student.getAge())
            .summaryStatistics();
        System.out.println(summary);

    }

}
