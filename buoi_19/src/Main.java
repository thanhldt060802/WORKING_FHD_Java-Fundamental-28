public class Main {

    public static void main(String[] args) {

        // Shape2D shape;
        // shape = new Shape2D("Hình tròn");

        // int a;
        // a = 10;
        // System.out.println(a);

        // Shape2D shape1 = new Rectangle("Hình chữ nhật", 10, 5);
        // System.out.println(shape1);
        // shape1.greeting();
        // System.out.println(shape1.calculateArea());
        // System.out.println(shape1.calculatePerimeter());

        // Shape2D shape2 = new Triangle("Hình tam giác", 3, 4, 5);
        // System.out.println(shape2);
        // shape2.greeting();
        // System.out.println(shape2.calculateArea());
        // System.out.println(shape2.calculatePerimeter());

        Shape3D shape = new Cone("Hình nón", 15, 7);
        System.out.println(shape);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        System.out.println(shape.calculateVolume());

    }

}
