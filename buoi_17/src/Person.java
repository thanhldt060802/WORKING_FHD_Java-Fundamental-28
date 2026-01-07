public class Person {

	public String id;
	public String name;
	
	public Person() {

	}
	
	public String getInfo() {
		return String.format("Person [id=%s, name=%s]", this.id, this.name);
	}
    
    @Override
    public String toString() {
        return String.format("Person [id=%s, name=%s]", this.id, this.name);
    }

}