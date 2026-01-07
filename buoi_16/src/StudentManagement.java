import java.util.ArrayList;

public class StudentManagement {
    
    public ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<Student>();
    }

    public void showAllStudents() {
        if (!this.studentList.isEmpty()) {
            for (int i = 0; i < this.studentList.size(); i++) {
                System.out.println(this.studentList.get(i).getInfo());
            }
        } else {
            System.out.println("Empty list!");
        }
    }

    public void addStudent(Student stu) {
        // if (!this.isExistedId(stu.id) && this.isValidInfo(stu)) {
        //     this.studentList.add(stu);
        // }

        if(this.searchStudentById(stu.id) == null && this.isValidInfo(stu)) {
            this.studentList.add(stu);
        }
    }

    public void updateStudent(Student stu) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).id.equals(stu.id) && this.isValidInfo(stu)) {
                this.studentList.get(i).name = stu.name;
                this.studentList.get(i).age = stu.age;
                return;
            }
        }
        // System.out.println("Id does not exist");
    }

    public void removeStudentById(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).id.equals(id)) {
                this.studentList.remove(i);
                return;
            }
        }
    }

    public Student searchStudentById(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).id.equals(id)) {
                return this.studentList.get(i);
            }
        }
        return null;
    }

    // Hàm kiểm tra trùng Id
    public boolean isExistedId(String id) {
        for (int i = 0; i < this.studentList.size(); i++) {
            if (this.studentList.get(i).id.equals(id)) { // true là tồn tài rồi, false là chưa tồn tại
                return true;
            }
        }
        return false;
    }

    // Hàm kiểm tra tính hợp lệ của dữ liệu Sinh Viên
    public boolean isValidInfo(Student stu) {
        boolean isValidAge = stu.age > 0;  // true là hợp lệ, false là không hợp lệ
        boolean isValidName = stu.name != null && !stu.name.equals("");  // true là hợp lệ, false là không hợp lệ

        return isValidName && isValidAge;
    }

}