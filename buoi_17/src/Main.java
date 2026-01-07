import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ArrayList<Developer> empList = new ArrayList<Developer>();

        // Employee e0 = new Employee();
        // Employee e1 = new Technician();
        // Employee e2 = new Developer();
        // Employee e3 = new DevOps();
        // Employee e4 = new Manager();
        // Employee e5 = new Designer();

        // empList.add(e1);
        // empList.add(e2);
        // empList.add(e3);
        // empList.add(e4);
        // empList.add(e5);

        // empList.add(new Technician());
        // empList.add(new Developer());
        // empList.add(new DevOps());
        // empList.add(new Manager());
        // empList.add(new Designer());

        // Developer d0 = new Developer();
        // Developer d1 = new DevOps();
        // Developer d2 = new Manager();

        // empList.add(d1);
        // empList.add(d2);

        // empList.add(new DevOps());
        // empList.add(new Manager());

        // empList.add(new Employee());

        // String a = new Object();
        // Object a = new String();

        // Person p = new Student_A1();
		// System.out.println(p.getTotalScores());  // Sai!

        // Employee e;
		
		// e = new Employee();
		// e.calculateSalary();

		// e = new Technician();
		// e.calculateSalary();

		// e = new Developer();
		// e.calculateSalary();

		// e = new DevOps();
		// e.calculateSalary();

		// e = new Manager();
		// e.calculateSalary();

		// e = new Designer();
		// e.calculateSalary();

        // ArrayList<Employee> empList = new ArrayList<Employee>();
        // empList.add(new Employee());
        // empList.add(new Technician());
        // empList.add(new Developer());
        // empList.add(new Designer());
        // empList.add(new DevOps());
        // empList.add(new Manager());
        // empList.add(new Intern());

        // int total = 0;
        // for (int i = 0; i < empList.size(); i++) {
        //     total += empList.get(i).calculateSalary();
        // } // 50 + 50*1.2 + 50*1.8 + 50*1.5 + 50*1.8*1.5 + 50*1.8*1.7 + 50

        // System.out.println(total);

        // Person p = new Person();
        // p.id = "P01";
        // p.name = "Thành";

        // System.out.println(p);

        /*
         * Object <- A <- B <- C <- D
         */

        A objA = new C();  // Polymorphic object
                           // Up-casting

        // B objB = ((B)objA);  // Down-casting
        // objB.secondMethod();

        // C objC = ((C)objA);
        // objC.thirdMethod();

        if(objA instanceof C) {
			((C)objA).thirdMethod();
		} else {
			System.out.println("objA has not C instance!");
		}

    }

}
