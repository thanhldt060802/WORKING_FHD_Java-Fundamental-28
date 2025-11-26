public class EmployeeA extends Employee {

    public EmployeeA(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.salary * 1.5;
    }

    public void test() {
        System.out.println("Hello");
    }
    
}
