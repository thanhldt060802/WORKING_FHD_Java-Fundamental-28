import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
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
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : this.students) {
            if (s.getGender() == Gender.FEMALE) {
                result.add(s);
            }
        }
        return result;
    }

    /**
     * <h3>Câu A2 - Dễ:</h3>
     * <p>Yêu cầu: Lọc sinh viên có tuổi trên 22.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A2() throws Exception {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : this.students) {
            if (s.getAge() > 22) {
                result.add(s);
            }
        }
        return result;
    }

    /**
     * <h3>Câu A3 - Dễ:</h3>
     * <p>Yêu cầu: Sắp xếp sinh viên theo tuổi tăng dần.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A3() throws Exception {
        int i, j;
        Student temp;
        boolean swapped;
        for (i = 0; i < this.students.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < this.students.size() - i - 1; j++) {
                if (this.students.get(j).getAge() > this.students.get(j + 1).getAge()) {
                    temp = this.students.get(j);
                    this.students.set(j, this.students.get(j + 1));
                    this.students.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
        return this.students;
    }

    /**
     * <h3>Câu A4 - Dễ:</h3>
     * <p>Yêu cầu: Sắp xếp sinh viên theo tên từ A->Z.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A4() throws Exception {
        int i, j;
        Student temp;
        boolean swapped;
        for (i = 0; i < this.students.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < this.students.size() - i - 1; j++) {
                if (this.students.get(j).getName().compareTo(this.students.get(j + 1).getName()) > 0) {
                    temp = this.students.get(j);
                    this.students.set(j, this.students.get(j + 1));
                    this.students.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }
        return this.students;
    }

    /**
     * <h3>Câu A5 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách tên sinh viên.</p>
     * <i>Trả về: List tên sinh viên.</i>
     */
    public List<String> A5() throws Exception {
        ArrayList<String> result = new ArrayList<String>();
        for (Student s : this.students) {
            result.add(s.getName());
        }
        return result;
    }

    /**
     * <h3>Câu A6 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách tên lớp, loại trừ nếu tên lóp bị trùng.</p>
     * <i>Trả về: List tên lớp.</i>
     */
    public List<String> A6() throws Exception {
        LinkedHashSet<String> result = new LinkedHashSet<String>();
        for (Student s : this.students) {
            result.add(s.getClassName());
        }
        return new ArrayList<String>(result);
    }
    
    /**
     * <h3>Câu A7 - Dễ:</h3>
     * <p>Yêu cầu: Nhóm sinh viên theo lớp.</p>
     * <i>Trả về: Map với key là tên lớp, value là danh sách sinh viên thuộc lớp đó.</i>
     */
    public Map<String, List<Student>> A7() throws Exception {
        HashMap<String, List<Student>> result = new HashMap<String, List<Student>>();
        for (Student s : this.students) {
            List<Student> studentList = result.get(s.getClassName());
            if (studentList == null) {
                studentList = new ArrayList<Student>();
                result.put(s.getClassName(), studentList);
            }
            studentList.add(s);
        }
        return result;
    }

    /**
     * <h3>Câu A8 - Dễ:</h3>
     * <p>Yêu cầu: Nhóm sinh viên theo giới tính.</p>
     * <i>Trả về: Map với key là giới tính, value là danh sách sinh viên thuộc giới tính đó.</i>
     */
    public Map<Gender, List<Student>> A8() throws Exception {
        HashMap<Gender, List<Student>> result = new HashMap<Gender, List<Student>>();
        for (Student s : this.students) {
            List<Student> studentList = result.get(s.getGender());
            if (studentList == null) {
                studentList = new ArrayList<Student>();
                result.put(s.getGender(), studentList);
            }
            studentList.add(s);
        }
        return result;
    }

    /**
     * <h3>Câu A9 - Dễ:</h3>
     * <p>Yêu cầu: Đếm số lượng sinh viên nữ.</p>
     * <i>Trả về: Số lượng sinh viên.</i>
     */
    public long A9() throws Exception {
        long result = 0;
        for (Student s : this.students) {
            if (s.getGender() == Gender.FEMALE) {
                result++;
            }
        }
        return result;
    }

    /**
     * <h3>Câu A10 - Dễ:</h3>
     * <p>Yêu cầu: Tính trung bình điểm được ghi nhận của môn học có tên "Math".</p>
     * <i>Trả về: Điểm trung bình.</i>
     */
    public double A10() throws Exception {
        // double result = 0.0;
        // int count = 0;
        // for (Enrollment e : this.enrollments) {
        //     for (Course c : this.courses) {
        //         if (c.getId() == e.getCourseId() && c.getName().equals("Math")) {
        //             result += e.getScore();
        //             count++;
        //         }
        //     }
        // }

        double result = 0.0;
        int count = 0;
        long foundCourseId = -1;
        for (Course c : this.courses) {
            if (c.getName().equals("Math")) {
                foundCourseId = c.getId();
            }
        }
        for (Enrollment e : this.enrollments) {
            if (e.getCourseId() == foundCourseId) {
                result += e.getScore();
                count++;
            }
        }

        return result / count;
    }

    /**
     * <h3>Câu A11 - Dễ:</h3>
     * <p>Yêu cầu: Lọc sinh viên nữ, sắp xếp theo tuổi tăng dần.</p>
     * <i>Trả về: List sinh viên.</i>
     */
    public List<Student> A11() throws Exception {
        ArrayList<Student> result = new ArrayList<Student>();
        for (Student s : this.students) {
            if (s.getGender() == Gender.FEMALE) {
                result.add(s);
            }
        }

        int i, j;
        Student temp;
        boolean swapped;
        for (i = 0; i < result.size() - 1; i++) {
            swapped = false;
            for (j = 0; j < result.size() - i - 1; j++) {
                if (result.get(j).getAge() > result.get(j + 1).getAge()) {
                    temp = result.get(j);
                    result.set(j, result.get(j + 1));
                    result.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (swapped == false) {
                break;
            }
        }

        return result;
    }

    /**
     * <h3>Câu A12 - Dễ:</h3>
     * <p>Yêu cầu: Lấy danh sách mã số sinh viên các sinh viên nam có tuổi dưới 23.</p>
     * <i>Trả về: List mã số sinh viên.</i>
     */
    public List<Long> A12() throws Exception {
        List<Long> result = new ArrayList<Long>();
        for (Student s : this.students) {
            if (s.getAge() < 23) {
                result.add(s.getId());
            }
        }
        return result;
    }

}
