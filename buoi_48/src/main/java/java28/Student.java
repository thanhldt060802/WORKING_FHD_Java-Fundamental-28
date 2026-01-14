package java28;

public class Student {

	private String id;
	private String name;
	private int age;
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setId(String id) {
		 this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}