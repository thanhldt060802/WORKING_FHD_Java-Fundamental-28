public class Manager extends Developer {
    
    @Override
	public double calculateSalary() {
		return super.calculateSalary() * 1.7;
	}

}
