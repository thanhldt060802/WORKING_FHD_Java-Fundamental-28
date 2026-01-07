public class Student {

	private String id;
	private String name;
	private int age;
	
	public Student() {
		this("Unknown", "Unknown", -1);
	}
	
	public Student(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getInfo() {
		return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
	}

    public Student copy() {
		Student newStudent = new Student(this.id, this.name, this.age);
		return newStudent;
	}

}