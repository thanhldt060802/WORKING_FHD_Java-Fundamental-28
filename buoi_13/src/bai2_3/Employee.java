package bai2_3;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {

    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int salary;
    private double coefficientsSalary;

    public Employee(String id, String firstName, String middleName, String lastName, int age, int salary,
            double coefficientsSalary) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return String.format("%s %s %s", this.firstName, this.middleName, this.lastName);
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary * this.coefficientsSalary;
    }

    public double getCoefficientsSalary() {
        return this.coefficientsSalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(String dobStr) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            // Date dobDate = sdf.parse(dobStr);
            // Date currentDate = Date.from(Instant.now());
            // this.age = currentDate.getYear() - dobDate.getYear();

            Calendar dobCalendar = Calendar.getInstance();
            dobCalendar.setTime(sdf.parse(dobStr));

            Calendar currentCalendar = Calendar.getInstance();

            this.age = currentCalendar.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
            if (dobCalendar.get(Calendar.DAY_OF_YEAR) > currentCalendar.get(Calendar.DAY_OF_YEAR)) {
                this.age--;
            }
        } catch (Exception ex) {
            System.out.println("Format of param dob is not valid");
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getInfo() {
        return String.format("Employee [id=%s, firstName=%s, middleName=%s, lastName=%s, age=%d, salary=%d, coefficientsSalary=%f]",
        this.id, this.firstName, this.middleName, this.lastName, this.age, this.salary, this.coefficientsSalary);
    }

}