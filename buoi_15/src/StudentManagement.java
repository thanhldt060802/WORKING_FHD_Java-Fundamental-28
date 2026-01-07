import java.util.ArrayList;

public class StudentManagement {
    
    public ArrayList<Student> studentList;

    public StudentManagement() {
        this.studentList = new ArrayList<Student>();
    }

    public void showAllStudents() {
        for (int i = 0; i < this.studentList.size(); i++) {
            System.out.println(this.studentList.get(i).getInfo());
        }
    }

    public void addStudent(Student stu) {
        if (this.checkValidNewStudent(stu)) {
            this.studentList.add(stu);
        }
    }

    public boolean checkValidNewStudent(Student stu) {
        for (int i = 0; i < this.studentList.size(); i++) {
            boolean isExistedId = this.studentList.get(i).id.equals(stu.id);  // true là tồn tài rồi, false là chưa tồn tại
            if (isExistedId) {
                return false;
            }
        }

        boolean isValidAge = stu.age > 0;  // true là hợp lệ, false là không hợp lệ
        boolean isValidName = stu.name != null && !stu.name.equals("");  // true là hợp lệ, false là không hợp lệ

        return isValidName && isValidAge;

        // boolean isValid = (stu.age > 0 && !stu.name.equals("")) ? true : false;
        
        // return isValid;

        // dieu_kien ? gia_tri_tra_ve_neu_dung : gia_tri_tra_ve_neu_sai =>  trả về một cái gì đó
        // if (dieu_kien) {
        //     return gia_tri_tra_ve_neu_dung;
        // } else {
        //     return gia_tri_tra_ve_neu_sai;
        // }

        // dieu_kien_1 ? gia_tri_tra_ve_neu_1_dung : (dieu_kien_2 ? gia_tri_tra_ve_neu_2_dung : gia_tri_tra_ve_neu_2_sai)
        // if (dieu_kien_1) {
        //     return gia_tri_tra_ve_neu_1_dung;
        // } else {
        //     if (dieu_kien_2) {
        //         return gia_tri_tra_ve_neu_2_dung;
        //     } else {
        //         return gia_tri_tra_ve_neu_2_sai;
        //     }
        // }

        // dieu_kien ? (dieu_kien ? gia_tri_tra_ve_neu_dung : gia_tri_tra_ve_neu_sai) : gia_tri_tra_ve_neu_sai

        // return ( stu.age > 0 ) ? ((stu.name != null && !stu.name.equals("")) ? true : false) : false; 
    }

}
