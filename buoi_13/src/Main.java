import java.util.Calendar;

import bai2_3.Employee;

public class Main {

    public static void main(String[] args) {

        // Employee emp = new Employee("001", "Le", "Dao Tan", "Thanh", 19, 5000, 1.5);
        // System.out.println(emp.getInfo());
        // // System.out.println(emp.getName());
        // emp.setAge("14/10/2002");
        // System.out.println(emp.getInfo());

        Calendar c = Calendar.getInstance();
        c.set(Calendar.DAY_OF_MONTH, 20);
        c.set(Calendar.MONTH, 10);
        c.set(Calendar.YEAR, 2023);
        System.out.println(c);

    }
    
}
