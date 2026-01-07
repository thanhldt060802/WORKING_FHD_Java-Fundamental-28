public class Main {

    public static void main(String[] args) {

        // Student_A1 s = new Student_A1("001", "Thành", 9.7, 7.9, 8.8);
        // s.id = "S01";
        // s.name = "Thành";
        // s.mathScores = 9.7;
        // s.physicScores = 9.7;
        // s.englishScores = 7.7;

        // System.out.println(s.getInfo());
        // System.out.println(s.getAllInfo());
        // System.out.println(s.toString());
        // System.out.println(s);

        Student_A1 s1 = new Student_A1("001", "Thành", 9.7, 7.9, 8.8);
        Student_A1 s2 = new Student_A1("001", "Thành", 9.7, 7.9, 8.8);
        System.out.println(s1.equals(s2));

    }
    
}
