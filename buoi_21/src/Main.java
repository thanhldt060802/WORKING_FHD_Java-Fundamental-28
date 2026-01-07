import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        // String[] arr = new String[] {
        //     "abc",
        //     "def",
        //     "bac",
        //     "cab",
        //     "dec",
        //     "abf"
        // };
        // System.out.println("Before sorting: " + Arrays.toString(arr));
        // sortAsc(arr);
        // reverse(arr);
        // // sortDesc(arr);
        // System.out.println("After sorting: " + Arrays.toString(arr));

        // String[] arr = new String[] {
        //     "abc",
        //     "def",
        //     "bac",
        //     "cab",
        //     "dec",
        //     "abf"
        // };
        // System.out.println("Before sorting: " + Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("After sorting: " + Arrays.toString(arr));

        // Student[] arr = new Student[] {
        //     new Student("001", "Thành", 23, 8.9),
        //     new Student("002", "Phúc", 22, 8.8),
        //     new Student("003", "Tùng", 21, 9.7),
        //     new Student("004", "Thành", 19, 7.9),
        //     new Student("005", "Dương", 24, 8.6),
        //     new Student("006", "Đạt", 23, 7.8),
        //     new Student("007", "Tùng", 22, 8.8),
        //     new Student("008", "Hữu", 18, 7.5),
        //     new Student("009", "Vinh", 20, 9.5),
        //     new Student("010", "Quốc", 21, 7.9)
        // };
        // System.out.println("Before sorting:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        // Arrays.sort(arr);
        // System.out.println("After sorting:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        Student[] arr = new Student[] {
            new Student("001", "Thành", 23, 8.9),
            new Student("002", "Phúc", 22, 8.8),
            new Student("003", "Tùng", 21, 9.7),
            new Student("004", "Thành", 19, 7.9),
            new Student("005", "Dương", 24, 8.6),
            new Student("006", "Đạt", 23, 7.8),
            new Student("007", "Tùng", 22, 8.8),
            new Student("008", "Hữu", 18, 7.5),
            new Student("009", "Vinh", 20, 9.5),
            new Student("010", "Quốc", 21, 7.9)
        };
        System.out.println("Before sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr, new CompareAgeThenGpa());
        System.out.println("After sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Student s1 = new Student("001", "Thanh", 20);
        // Student s2 = new Student("002", "Dat", 22);
        // System.out.println(s1.compareTo(s2));

    }

    public static void sortAsc(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[min].compareTo(arr[j]) > 0) {
                    min = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void reverse(String[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void sortDesc(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for (int j = max + 1; j < arr.length; j++) {
                if (arr[max].compareTo(arr[j]) < 0) {
                    max = j;
                }
            }

            String temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

}
