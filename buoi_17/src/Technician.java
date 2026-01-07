public class Technician extends Employee {
    
    @Override
	public double calculateSalary() {
		return super.calculateSalary() * 1.2;
	}

}
