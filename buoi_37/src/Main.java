import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // FILTER

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

        /**
         * Lọc bộ ba số có n1 là chẵn.
         */

        // Predicate<TripleNumber> check = (triple) -> triple.n1 % 2 == 0;
        // List<TripleNumber> result = list.stream().filter(check).toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // } 

        /**
         * Lọc bộ ba số có n1 và n2 là chẵn.
         */

        // Cách 1 (gộp)
        // List<TripleNumber> result = list.stream()
        //     .filter((triple) -> triple.n1 % 2 == 0 && triple.n2 % 2 == 0)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // Cách 2 (tách) - khuyến nghị
        // List<TripleNumber> result = list.stream()
        //     .filter((triple) -> triple.n1 % 2 == 0)
        //     .filter((triple) -> triple.n2 % 2 == 0)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        /**
         * Lọc bộ ba số có n1 hoặc n2 là chẵn.
         */

        // List<TripleNumber> result = list.stream()
        //     .filter((triple) -> triple.n1 % 2 == 0 || triple.n2 % 2 == 0)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        // MAP

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

        /**
         * Ánh xạ danh sách bộ ba số thành danh sách các tổng của 3 số trong bộ ba số.
         * Hint: Ứng với mỗi TripleNumber ta có được một giá trị int
         */
        // [ tn1, tn2, tn3, tn4, tn5 ]
        // [ tn1', tn2', tn3', tn4', tn5' ]

        // Function<TripleNumber, Integer> func = (triple) -> triple.n1 + triple.n2 + triple.n3;
        // List<Integer> result = list.stream()
        //     .map(func)
        //     .toList();
        // for (Integer e : result) {
        //     System.out.println(e);
        // }

        // Function<TripleNumber, TripleNumber> func = (triple) -> null;
        // List<TripleNumber> result = list.stream()
        //     .map(func)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        /**
         * Student(String id, String name, double gpa)
         * Cho: List<Student>
         * Cần lấy ra danh sách các id của từng Student trong danh sách
         */

        // List<Integer> result = list.stream()
        //     .map((triple) -> triple.n1 + triple.n2 + triple.n3)
        //     .toList();
        // System.out.println(result);

        // FLATMAP

        List<List<TripleNumber>> list2d = new ArrayList<List<TripleNumber>>();
		list2d.add(new ArrayList<TripleNumber>());
		list2d.get(0).add(new TripleNumber(4, 2, 5));
		list2d.get(0).add(new TripleNumber(2, 3, 1));
		list2d.get(0).add(new TripleNumber(4, 5, 1));
		list2d.add(new ArrayList<TripleNumber>());
		list2d.get(1).add(new TripleNumber(3, 6, 2));
		list2d.get(1).add(new TripleNumber(1, 5, 3));
		list2d.get(1).add(new TripleNumber(4, 3, 1));
		list2d.add(new ArrayList<TripleNumber>());
		list2d.get(2).add(new TripleNumber(3, 2, 3));
		list2d.get(2).add(new TripleNumber(1, 5, 6));
		list2d.get(2).add(new TripleNumber(3, 5, 4));
		list2d.get(2).add(new TripleNumber(2, 2, 3));

        // [ [tn1, tn2, tn3], [tn4, tn5], [tn6, tn7] ]
        // [tn1', tn2', tn3'], [tn4', tn5'], [tn6', tn7']
        // [ tn1', tn2', tn3', tn4', tn5', tn6', tn7' ]

        // Function<List<TripleNumber>, Stream<Integer>> outerFunc = (list1dTriple) -> {
        //     Function<TripleNumber, Integer> innerFunc = (triple) -> triple.n1 + triple.n2 + triple.n3;
        //     Stream<Integer> result = list1dTriple.stream()
        //         .map(innerFunc);
        //     return result;
        // };

        // Function<List<TripleNumber>, Stream<TripleNumber>> outerFunc = (list1dTriple) -> {
        //     Stream<TripleNumber> result = list1dTriple.stream();
        //     return result;
        // };

        // Function<List<TripleNumber>, Stream<TripleNumber>> outerFunc = (list1dTriple) -> {
        //     Function<TripleNumber, TripleNumber> innerFunc = (triple) -> new TripleNumber(triple.n1 * triple.n1, triple.n2 * triple.n2, triple.n3 * triple.n3);
        //     Stream<TripleNumber> result = list1dTriple.stream()
        //         .map(innerFunc);
        //     return result;
        // };

        // List<TripleNumber> result = list2d.stream()
        //     .flatMap(outerFunc)
        //     .toList();
        // for (TripleNumber e : result) {
        //     System.out.println(e);
        // }

        List<TripleNumber> result = list2d.stream()
            .flatMap(
                (list1dTriple) ->  list1dTriple.stream()
                    .map(
                        (triple) -> new TripleNumber(triple.n1 * triple.n1, triple.n2 * triple.n2, triple.n3 * triple.n3)))
            .toList();
        for (TripleNumber e : result) {
            System.out.println(e);
        }

    }

}
