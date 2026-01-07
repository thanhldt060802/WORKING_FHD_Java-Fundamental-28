public abstract class Employee {

	public String id;
	public String name;
	public int salary;
	
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public abstract double calculateSalary();

}