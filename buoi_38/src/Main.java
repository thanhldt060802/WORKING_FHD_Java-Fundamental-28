import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // SORTED

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

        // Comparator<TripleNumber> compare = (triple1, triple2) -> triple1.n1 - triple2.n1;

        // Comparator<TripleNumber> compare = (triple1, triple2) -> {
        //     int compareN1 = triple1.n1 - triple2.n1;
        //     if (compareN1 != 0) {
        //         return compareN1;
        //     } else {
        //         return -(triple1.n2 - triple2.n2);
        //     }
        // };

        // List<TripleNumber> result = list.stream()
        //     .sorted(Comparator.comparing((TripleNumber triple) -> triple.n1).thenComparing((triple) -> -triple.n2))
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // List<TripleNumber> result = list.stream()
        //     .sorted(
        //         (triple1, triple2) -> {
        //             int compareN1 = triple1.n1 - triple2.n1;
        //             if (compareN1 != 0) {
        //                 return compareN1;
        //             } else {
        //                 return -(triple1.n2 - triple2.n2);
        //             }
        //         })
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // DISTINC
        
        // List<String> list = Arrays.asList("A", "B", "C", "D", "E", "B", "A", "C", "F");
        // System.out.println(list);
        // Set<String> set = new LinkedHashSet<String>(list); 
        // System.out.println(set);

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

        // List<TripleNumber> result = list.stream()
        //     .distinct()
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // LIMIT/SKIP

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

        // List<TripleNumber> result = list.stream()
        //     .limit(5)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // List<TripleNumber> result = list.stream()
        //     .skip(3)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // int page = 4;
        // int limit = 3;
        // int skip = (page - 1) * limit;

        // List<TripleNumber> result = list.stream()
        //     .skip(skip)
        //     .limit(limit)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // FOREACH
        
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
		
        // // list.stream().forEach((triple) -> System.out.println(triple));

		// // list.stream()
        // //     .filter((triple) -> triple.n1 % 2 == 0)
        // //     .forEach((triple) -> System.out.println(triple));

        // list.stream()
        //     .forEach((triple) -> triple.n1 = 0);

        // list.stream()
        //     .forEach((triple) -> System.out.println(triple));

        // COLLECT

        List<TripleNumber> list = new ArrayList<TripleNumber>();
		list.add(new TripleNumber(4, 2, 5));
		list.add(new TripleNumber(2, 3, 1));
		list.add(new TripleNumber(4, 5, 1));
		list.add(new TripleNumber(3, 6, 2));
		list.add(new TripleNumber(1, 5, 3));
		list.add(new TripleNumber(4, 3, 1));
		list.add(new TripleNumber(3, 2, 3));
		list.add(new TripleNumber(1, 5, 6));
		list.add(new TripleNumber(3, 5, 4));
		list.add(new TripleNumber(2, 2, 3));

        // List<TripleNumber> result = list.stream()
        //     .filter((triple) -> triple.n1 % 2 != 0)
        //     .collect(Collectors.toList());

        Set<TripleNumber> result = list.stream()
            .filter((triple) -> triple.n1 % 2 != 0)
            .collect(Collectors.toSet());
        
        // result.stream().forEach((triple) -> System.out.println(triple));

        result.forEach((triple) -> System.out.println(triple));

    }

}
