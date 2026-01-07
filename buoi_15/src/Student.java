public class Student {
    
    public String id;
    public String name;
    public int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Student [id=%s, name=%s, age=%d]", this.id, this.name, this.age);
    }

}
