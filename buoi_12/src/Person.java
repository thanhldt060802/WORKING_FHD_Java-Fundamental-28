public class Person {

    private String id;
    private String name;

    // public Person() {
    //     System.out.println("Default constructor of Person");
    // }

    public Person(String id, String name) {
        // System.out.println("Two params constructor of Person");
        this.id = id;
        this.name = name;
    }

    // public Person(String id) {
    //     this(id, "Unknown");
    //     System.out.println("One param constructor of Person");
    // }

    // public String getInfo() {
    //     return String.format("id=%s, name=%s", this.id, this.name);
    // }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Person [id=%s, name=%s]", this.id, this.name);
    }
    
}
