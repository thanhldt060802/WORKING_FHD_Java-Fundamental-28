import java.util.List;
import java.util.Map;

import entity.Course;
import entity.Enrollment;
import entity.Student;
import enumeration.Gender;

public class Task {

    private List<Student> students; // Danh sách sinh viên
    private List<Course> courses; // Danh sách khoá học
    private List<Enrollment> enrollments; // Danh sách môn học ghi nhận

    public Task(List<Student> students, List<Course> courses, List<Enrollment> enrollments) {
        this.students = students;
        this.courses = courses;
        this.enrollments = enrollments;
    }

    public void showData() {
        System.out.println("Mock data - Student:");
        this.students.forEach(
            (student) -> System.out.println(student));
        System.out.println();
        System.out.println("Mock data - Course:");
        this.courses.forEach(
            (course) -> System.out.println(course));
        System.out.println();
        System.out.println("Mock data - Enrollment:");
        this.enrollments.forEach(
            (enrollment) -> System.out.println(enrollment));
        System.out.println();
    }

    /**
     * <h3>Câu A1 - Dễ:</h3>
     * <p>Yêu cầu: Lọc sinh viên có giới tính nữ.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A1() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A2 - Dễ:</h3>
     * <p>Yêu cầu: Lọc sinh viên có tuổi trên 22.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A2() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A3 - Dễ:</h3>
     * <p>Yêu cầu: Sắp xếp sinh viên theo tuổi tăng dần.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A3() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A4 - Dễ:</h3>
     * <p>Yêu cầu: Sắp xếp sinh viên theo tên từ A->Z.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A4() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A5 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách tên sinh viên.</p>
     * <i>Trả về: List tên sinh viên.</i>
     */
    public List<String> A5() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A6 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách tên lớp, loại trừ nếu tên lóp bị trùng.</p>
     * <i>Trả về: List tên lớp.</i>
     */
    public List<String> A6() throws Exception {
        throw new Exception("This task is unimplemented!");
    }
    
    /**
     * <h3>Câu A7 - Dễ:</h3>
     * <p>Yêu cầu: Nhóm sinh viên theo lớp.</p>
     * <i>Trả về: Map với key là tên lớp, value là danh sách sinh viên thuộc lớp đó.</i>
     */
    public Map<String, List<Student>> A7() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A8 - Dễ:</h3>
     * <p>Yêu cầu: Nhóm sinh viên theo giới tính.</p>
     * <i>Trả về: Map với key là giới tính, value là danh sách sinh viên thuộc giới tính đó.</i>
     */
    public Map<Gender, List<Student>> A8() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A9 - Dễ:</h3>
     * <p>Yêu cầu: Đếm số lượng sinh viên nữ.</p>
     * <i>Trả về: Số lượng sinh viên.</i>
     */
    public long A9() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A10 - Dễ:</h3>
     * <p>Yêu cầu: Tính trung bình điểm được ghi nhận của môn học có tên "Math".</p>
     * <i>Trả về: Điểm trung bình.</i>
     */
    public double A10() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A11 - Dễ:</h3>
     * <p>Yêu cầu: Lọc sinh viên nữ, sắp xếp theo tuổi tăng dần.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A11() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

    /**
     * <h3>Câu A12 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách mã số sinh viên các sinh viên nam có tuổi dưới 23.</p>
     * <i>Trả về: List mã số sinh viên.</i>
     */
    public List<Long> A12() throws Exception {
        throw new Exception("This task is unimplemented!");
    }

}
