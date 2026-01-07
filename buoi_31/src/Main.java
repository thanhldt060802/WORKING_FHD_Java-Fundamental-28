import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
        Student:
            FullName:
                - String firstName
                - String middleName
                - String lastName

            - String id
            - FullName fullName
            - int age
            - ...
        */

        // A aObj = new A(100);
        // aObj.greeting();
        // System.out.println(aObj.value);

        // A.B bObj = aObj.new B(-100);
        // bObj.greeting();
        // System.out.println(bObj.value);

        // bObj.testCallbackA();

        // Student s = new Student("001", "Le", "Dao Tan", "Thanh", 23);
        // System.out.println(s.getFullName());
        // System.out.println(s.getFullName().getSimplifiedFullname());
        // System.out.println(s.getFullName().getFirstName());
        // System.out.println(s.getFullName().getMiddleName());
        // System.out.println(s.getFullName().getLastName());

        // A.B bObj = new A.B(100);
        // bObj.greeting();

        // Employee e1 = ne EmployeeA("01", "Thanh", 200);
        // Employee e2 = new EmployeeB("02", "Tung", 200);

        // Employee e3 = new Employee("03", "Quoc", 200)
        // { // class MyEmployee
        //     public int fieldA = 10;

        //     @Override
        //     public double calculateSalary() {
        //         this.test();
        //         return super.salary * 3.5;
        //     }

        //     public void test() {
        //         System.out.println(this.fieldA);
        //         System.out.println("Hello");
        //     }
        // };

        // // System.out.println(e1.calculateSalary());
        // // System.out.println(e2.calculateSalary());
        // System.out.println(e3.calculateSalary());

        // Triangle triangle = new Triangle(3, 4, 5);

        // CalculateTrianglePerimeter perimeter = new CalculateTrianglePerimeter();
        // // System.out.println(perimeter.calculate(triangle));
        // System.out.println(solveTriangle(triangle, perimeter));

        // CalculateTriangleArea area = new CalculateTriangleArea();
        // // System.out.println(area.calculate(triangle));
        // System.out.println(solveTriangle(triangle, area));

        // SolveTriangle solvePerimeter = new SolveTriangle() {
        //     @Override
        //     public double calculate(Triangle triangle) {
        //         return 100;
        //     }
        // };
        // System.out.println(solveTriangle(triangle, solvePerimeter));

        Computer[] computers = new Computer[] {
            new Computer("C01", "Laptop A", "Dell", "Win", 300),
            new Computer("T03", "Laptop B", "Asus", "Win", 500),
            new Computer("A04", "Laptop C", "Tuf", "Win", 400),
            new Computer("B01", "Laptop E", "Dell", "Win", 300),
            new Computer("E02", "Laptop X", "Dell", "Win", 500),
            new Computer("E01", "Laptop Y", "Asus", "Win", 400),
            new Computer("D03", "Laptop S", "MSI", "Win", 500),
            new Computer("F04", "Laptop F", "MSI", "Win", 300),
            new Computer("A02", "Laptop Q", "Tuf", "Win", 400),
            new Computer("D02", "Laptop I", "MSI", "Win", 500),
            new Computer("C05", "Laptop P", "Asus", "Win", 400),
        };

        System.out.println("Before sorting:");
        for (Computer computer : computers) {
            System.out.println(computer);
        }

        // CompareComputerPrice comparePrice = new CompareComputerPrice();
        // Arrays.sort(computers, comparePrice);

        // Comparator<Computer> comparePrice = new Comparator<Computer>() {
        //     @Override
        //     public int compare(Computer o1, Computer o2) {
        //         return Double.compare(o1.getPrice(), o2.getPrice());
        //     }
        // };
        // Comparator<Computer> compareId = new Comparator<Computer>() {
        //     @Override
        //     public int compare(Computer o1, Computer o2) {
        //         return o1.getId().compareTo(o2.getId());
        //     }
        // };
        Comparator<Computer> comparator = new Comparator<Computer>() {
            @Override
            public int compare(Computer o1, Computer o2) {
                int comparePriceResult = Double.compare(o1.getPrice(), o2.getPrice());
                if (comparePriceResult != 0) {
                    return comparePriceResult;
                } else {
                    int compareBrandResult = o1.getBrand().compareTo(o2.getBrand());
                    if (compareBrandResult != 0) {
                        return compareBrandResult;
                    } else {
                        return -o1.getName().compareTo(o2.getName());
                    }
                }
            }
        };
        Arrays.sort(computers, comparator);

        System.out.println("After sorting:");
        for (Computer computer : computers) {
            System.out.println(computer);
        }

    }

    public static double solveTriangle(Triangle triangle, SolveTriangle solve) {
        return solve.calculate(triangle);
    }

}
