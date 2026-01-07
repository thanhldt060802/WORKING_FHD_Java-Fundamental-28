public class Student {

    public class FullName {

        private String firstName;
        private String middleName;
        private String lastName;

        public FullName(String firstName, String middleName, String lastName) {
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSimplifiedFullname() {
            return this.firstName + " " + this.middleName + " " + this.lastName;
        }

        @Override
        public String toString() {
            return "FullName [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + "]";
        }

    }

    private String id;
    private FullName fullName;
    private int age;
    
    public Student(String id, String firstName, String middleName, String lastName, int age) {
        this.id = id;
        this.fullName = new FullName(firstName, middleName, lastName);
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
