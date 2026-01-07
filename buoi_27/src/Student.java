public class Student {

	public String id;
	public String name;
	public int age;
	
	public Student(String id) {
		this.id = id;
	}
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.id.equals(((Student)obj).id);
	}
	
	@Override	
	public String toString() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

}