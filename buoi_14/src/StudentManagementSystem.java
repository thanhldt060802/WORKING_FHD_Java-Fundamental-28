import java.util.Arrays;

public class StudentManagementSystem {
    
    private int currentSize;
    private Student[] studentList;

    public StudentManagementSystem(int size) {
        if (size <= 0) {
            size = 1;
        }
        this.currentSize = 0;
        this.studentList = new Student[size];
    }

    // Tính đóng gói

    public int getCurrentSize() {
        return this.currentSize;
    }

    public Student[] getStudentList() {
        return this.studentList;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public void setStudentList(Student[] studentList) {
        this.studentList = studentList;
    }

    // Hàm mở rộng

    /*
     * this.currentSize = 0
     * this.studentList = [null, null, null]
     * 
     * sau lần add(stu1) đầu tiên
     * this.currentSize = 1
     * this.studentList = [stu1, null, null]
     * 
     * sau lần add(stu2) thứ 2
     * this.currentSize = 2
     * this.studentList = [stu1, stu2, null]
     * 
     * sau lần add(stu3) thứ 3
     * this.currentSize = 3
     * this.studentList = [stu1, stu2, stu3]
     * 
     * sau lần add(stu4) thứ 4
     * // ---
     * newStudentList = [null, null, null, null, null, null]
     * newStudentList <- this.studentList
     * newStudentList = [stu1, stu2, stu3, null, null, null]
     * this.studentList = newStudentList
     * => this.studentList = [stu1, stu2, stu3, null, null, null]
     * // ---
     * this.currentSize = 4
     * this.studentList = [stu1, stu2, stu3, stu4, null, null]
     */
    public void add(Student stu) {
        if (this.currentSize >= this.studentList.length) {
            // Student[] newStudentList = new Student[this.studentList.length * 2];
            // for (int i = 0; i < this.studentList.length; i++) {
            //     newStudentList[i] = this.studentList[i];
            // }

            // this.studentList = newStudentList;

            this.studentList = Arrays.copyOf(this.studentList, this.studentList.length * 2);
        }

        this.studentList[this.currentSize] = stu;
        this.currentSize++;
    }

}
