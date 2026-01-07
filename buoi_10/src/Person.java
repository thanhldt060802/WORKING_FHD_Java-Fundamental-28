public class Person {

    private String personId;
    private String fullName;
    private int age;
    
    public Person() {
    }

    public Person(String personId, String fullName, int age) {
        this.personId = personId;
        this.fullName = fullName;
        this.age = age;
    }

    public String getPersonId() {
        return personId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
