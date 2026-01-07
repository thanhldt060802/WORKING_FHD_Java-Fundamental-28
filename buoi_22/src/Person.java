public class Person {

	public String id;
	public String name;
	
	// public Person() {
	// 	System.out.println("Person() constructor is called!");
	// }

    public Person(String id, String name) {}
	
	public String getInfo() {
		return String.format("Person [id=%s, name=%s]", this.id, this.name);
	}

}