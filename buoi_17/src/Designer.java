public class Designer extends Employee {
    
    @Override
	public double calculateSalary() {
		return super.calculateSalary() * 1.5;
	}

}
