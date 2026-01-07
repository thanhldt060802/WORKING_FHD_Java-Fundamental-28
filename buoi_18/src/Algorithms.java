import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {
    
    public static void test() {

    }

    // TÌM KIẾM

    /*
     * Tìm kiếm trả về chỉ mục thường áp dụng cho các loại giá trị tiêu chuẩn như:
     * int, double, String, Integer, Double, ...
     */

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }

        return -1;
    }

    /*
     * Tìm kiếm trả về phần tử (object) thường áp dụng cho các loại giá trị phức tạp mà ta tự định nghĩa như:
     * Student, Employee, ...
     * Bài toán này thường yêu cầu chúng ta truyền vào một thông tin của đối tượng rồi tìm kiếm trả về đối
     * tượng theo thông tin đó.
     */

    public static Student search(Student[] arr, String id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId().equals(id)) {
                return arr[i];
            }
        }

        return null;
    }

    public static ArrayList<Student> filterByName(Student[] arr, String name) {
        ArrayList<Student> result = new ArrayList<Student>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    // SẮP XẾP

    /*
     * Với sắp xếp số thì so sánh số bình thường
     */

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }
    }

    /*
     * Sắp xếp trên tập hợp String cần phải so sánh theo String
     */

    public static void sort(String[] arr) {
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
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }
    }

    /*
     * Sắp xếp trên tập hợp loại giá trị phức tạp hơn thì cần đưa ra một tiêu chí
     */

    public static void sortByAge(Student[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[min].getAge() > arr[j].getAge()) {
                    min = j;
                }
            }

            Student temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            System.out.println("Step " + i + ": " + Arrays.toString(arr));
        }
    }

}
