public class Main {

    public static void main(String[] args) {

        // SinhVien s1 = new SinhVien("001", "Thanh", 23);
        // SinhVien s2 = new SinhVien(s1);

        // s2.maSoSV = "999";

        // System.out.println("s1:");
        // s1.inThongTinRaManHinh();
        // System.out.println("s2:");
        // s2.inThongTinRaManHinh();

        Student s1 = new Student("001", "Le", "Dao Tan", "Thanh", 23);
        // s1.setStudentId("999");
        // System.out.println(s1.getStudentId());
        // s1.print();
        // System.out.println(s1.getFullName());

        // s1.print();
        // if (s1.setAge(20)) {
        //     System.out.println("setAge successfully");
        // }else {
        //     System.out.println("setAge failed");
        // }
        // s1.print();
        // if (s1.setAge(-100)) {
        //     System.out.println("setAge successfully");
        // }else {
        //     System.out.println("setAge failed");
        // }
        // s1.print();

        s1.print();
        if (s1.setLastName("Tai")) {
            System.out.println("setLastName successfully");
        }else {
            System.out.println("setLastName failed");
        }
        s1.print();
        if (s1.setLastName("")) {
            System.out.println("setLastName successfully");
        }else {
            System.out.println("setLastName failed");
        }
        s1.print();

    }
    
}
