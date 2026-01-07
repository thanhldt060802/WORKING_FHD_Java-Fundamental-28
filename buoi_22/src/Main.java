import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        // Student s = new Student();

        // int x1 = 10;
        // int x2 = 10;

        // Integer x1 = new Integer(10);
        // Integer x2 = new Integer(10);

        // Student x1 = new Student("001", "Thanh", 19);
        // Student x2 = x1.copy();

        // System.out.println("Before updating");
        // System.out.println(x1.getInfo());
        // System.out.println(x2.getInfo());

        // x1.name = "Tuan";

        // System.out.println("After updating");
        // System.out.println(x1.getInfo());
        // System.out.println(x2.getInfo());

        // Integer a = 2;
        // System.out.println(test(a)); // b = a
        // System.out.println(a);

        // Student a = new Student("001", "Thanh", 19);
        // System.out.println(test(a).getInfo()); // b = a
        // System.out.println(a.getInfo());

        // Calendar now = Calendar.getInstance();
        // now.get(Calendar.APRIL);

        // Child child = new Child();
        // child.test();

        // Shape a = new Shape();
        // a.greeting();

        // a = new Triangle();
        // a.greeting();

        // a = new Rectangle();
        // a.greeting();

        // ArrayList<Shape> list = new ArrayList<Shape>();

        Shape a1 = new Triangle();
        // Triangle tmp = (Triangle)a1;
        // ((Triangle)a1).testTriangle();
        ((Rectangle)a1).testRectangle();
        // ((String)a1).charAt(0);

        // a1.testTriangle();

        // a1 = new Rectangle();
        // a1.testRectangle();

        // Triangle a2 = new Triangle();
        // a2.testTriangle();

        // Rectangle a3 = new Rectangle();
        // a3.testRectangle();

        // list.add(a1);
        // list.add(a2);
        // list.add(a3);

        /*
         * Lớp trừu tượng A có 3 phương thức trừu tượng.
         * Lớp trừu tượng B có 2 phương thức trừu tượng, kế thừa A và ghi đè 1 phương trừu tượng của A.
         * Lớp C kế thừa B thì nó bắt buộc ghi đè bao nhiêu phương thức?
         */

    }

    // public static Integer test(Integer b) {
    //     b = 5;
    //     return b;
    // }

    // public static Student test(Student b) {
    //     b.name = "XXX";
    //     return b;
    // }

    // public static Student test(Student b) {
    //     b = new Student("002", "Tuan", 21);
    //     return b;
    // }

}
