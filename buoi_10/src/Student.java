public class Student {

    private String studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;

    public Student(String studentId, String firstName, String middleName, String lastName, int age) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
    }

    public void print() {
        System.out.printf("StudentId=%s, FirstName=%s, MiddleName=%s, LastName=%s, Age=%d\n",
        this.studentId, this.firstName, this.middleName, this.lastName, this.age);
    }

    // Getters: Get data
    public String getStudentId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getFullName() {
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }

    // Setters: Set data
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean setLastName(String lastName) {
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
            return true;
        }
        return false;
    }

    public boolean setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
            return true;
        }
        return false;
    }
    
}
