public class Developer extends Employee {
    
    @Override
	public double calculateSalary() {
		return super.calculateSalary() * 1.8;
	}

}
