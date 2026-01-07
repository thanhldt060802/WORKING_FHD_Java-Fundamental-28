public class Student /*implements Comparable<Student>*/ {

    private String id;
    private String name;
    private int age;
    private double gpa;
    
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, age=%d, gpa=%f]", this.id, this.name, this.age, this.gpa);
    }

    /*
     * Trả về -1 nếu <
     * Trả về 1 nếu >
     * Trả về 0 nếu =
     */
    // @Override
    // public int compareTo(Student stu) {
    //     // return this.name.compareTo(stu.name);
    //     // int result = this.name.compareTo(stu.name);
    //     // if (result > 0) {
    //     //     return 1;
    //     // }else if (result < 0) {
    //     //     return -1;
    //     // }else {
    //     //     return 0;
    //     // }

    //     // if (this.age > stu.age) {
    //     //     return 1;
    //     // }else if (this.age < stu.age) {
    //     //     return -1;
    //     // }else {
    //     //     return 0;
    //     // }
    //     // return this.age - stu.age;
    //     // return -(this.age - stu.age);

    //     // Sắp xếp theo tuổi tăng dần và nếu tuổi bằng thì tiếp tục sắp xếp theo gpa giảm dần
    //     int compareAge = this.age - stu.age;
    //     if (compareAge != 0) {
    //         return compareAge;
    //     }else {
    //         // int compareGpa = Double.compare(this.gpa, stu.gpa);
    //         // if (compareGpa != 0) {
    //         //     return compareGpa;
    //         // }else {
    //         //     // ....
    //         // }
    //         return -Double.compare(this.gpa, stu.gpa);
    //     }
    // }
    
}