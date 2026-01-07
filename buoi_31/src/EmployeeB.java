public class EmployeeB extends Employee {

    public EmployeeB(String id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return super.salary * 2.5;
    }
    
}
