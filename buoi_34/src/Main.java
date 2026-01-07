import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {

        // LinkedList<Student> students = new LinkedList<Student>();
		// students.offer(new Student("S01", "A", 19));
		// students.offer(new Student("S02", "B", 25));
		// students.offer(new Student("S03", "C", 23));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
        // while (!students.isEmpty()) {
        //     System.out.println(students.poll());
        // }
        // System.out.println(students);

        // ArrayDeque<Student> students = new ArrayDeque<Student>();
		// students.offerFirst(new Student("S01", "A", 19));
		// students.offerFirst(new Student("S02", "B", 25));
		// students.offerFirst(new Student("S03", "C", 23));
		// while(!students.isEmpty()) {
		// 	System.out.println(students.pollFirst());
		// }

        // PriorityQueue<Student> students = new PriorityQueue<Student>((s1, s2) -> Integer.compare(s2.age, s1.age));
		// students.offer(new Student("S01", "A", 19));
		// students.offer(new Student("S02", "B", 25));
		// students.offer(new Student("S03", "C", 23));
		// students.offer(new Student("S04", "D", 20));
        // students.offer(new Student("S05", "E", 15));
		// students.offer(new Student("S06", "F", 11));
        // // for (Student s : students) {
        // //     System.out.println(s);
        // // }
		// while(!students.isEmpty()) {
		// 	System.out.println(students.poll());
		// }
        // System.out.println(students);

        // HashSet<Student> students = new HashSet<Student>();
		// students.add(new Student("001", "A", 19));
		// students.add(new Student("002", "B", 25));
		// students.add(new Student("003", "C", 23));
		// students.add(new Student("004", "D", 20));
		// students.add(new Student("001", "E", 21));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // HashSet<Student> students = new HashSet<Student>();
		// students.add(new Student("ABC", "A", 19));
		// students.add(new Student("BAC", "B", 25));
		// students.add(new Student("AAA", "C", 23));
		// students.add(new Student("BCA", "D", 20));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
		// students.remove(new Student("ABC"));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }

        // LinkedHashSet<Student> students = new LinkedHashSet<Student>();
		// students.add(new Student("ABC", "A", 19));
		// students.add(new Student("BAC", "B", 25));
		// students.add(new Student("AAA", "C", 23));
		// students.add(new Student("BCA", "D", 20));
		// for(Student s : students) {
		// 	System.out.println(s);
		// }
		
		// System.out.println();
		// students.remove(new Student("ABC"));
		// for(Student s : students) {
		// 	System.out.println(s);
        // }

        // HashMap<Student, Double> map = new HashMap<Student, Double>();
		// map.put(new Student("ABC", "A", 19), 8.9);
		// map.put(new Student("BAC", "B", 25), 9.8);
		// map.put(new Student("AAA", "C", 23), 10.0);
		// map.put(new Student("BCA", "D", 20), 8.7);
		// map.put(new Student("ABC", "E", 21), 9.5);
		// // for(Entry<Student, Double> entry : map.entrySet()) {
		// // 	System.out.println(entry.getKey() + ": " + entry.getValue());
		// // }
        // System.out.println(map.get(new Student("ABC")));

        // LinkedHashMap<Student, Double> map = new LinkedHashMap<Student, Double>();
		// map.put(new Student("ABC", "A", 19), 8.9);
		// map.put(new Student("BAC", "B", 25), 9.8);
		// map.put(new Student("AAA", "C", 23), 10.0);
		// map.put(new Student("BCA", "D", 20), 8.7);
		// map.put(new Student("ABC", "E", 21), 9.5);
		// for(Entry<Student, Double> entry : map.entrySet()) {
		// 	System.out.println(entry.getKey() + ": " + entry.getValue());
		// }

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("001", "A", 24));
        students.add(new Student("002", "C", 23));
        students.add(new Student("003", "B", 21));
        students.add(new Student("004", "D", 23));
        students.add(new Student("005", "E", 24));
        students.add(new Student("006", "B", 21));
        students.add(new Student("007", "D", 23));
        students.add(new Student("008", "E", 23));
        students.add(new Student("009", "F", 23));
        students.add(new Student("010", "D", 24));
        students.add(new Student("011", "A", 21));
        students.add(new Student("012", "C", 23));
        students.add(new Student("013", "E", 21));
        students.add(new Student("014", "B", 21));

        // Nhóm sinh viên theo độ tuổi
        HashMap<Integer, ArrayList<Student>> map = new HashMap<Integer, ArrayList<Student>>();
        for (Student s : students) {
            ArrayList<Student> studentList = map.get(s.age);
            if (studentList == null) {
                studentList = new ArrayList<Student>();
                map.put(s.age, studentList);
            }
            studentList.add(s);
        }
        for (Entry<Integer, ArrayList<Student>> entry : map.entrySet()) {
            System.out.println("Age: " + entry.getKey());
            for (Student s : entry.getValue()) {
                System.out.println(s);
            }
        }

    }

}
