public class Student_A1 extends Person {

    // public String id; // Override field
    private double mathScores;
    private double physicScores;
    private double englishScores;

    // public Student_A1() {
    //     System.out.println("Default constructor of Student_A1");
    // }

    public Student_A1(String id, String name, double mathScores, double physicScores, double englishScores) {
        super(id, name);
        this.mathScores = mathScores;
        this.physicScores = physicScores;
        this.englishScores = englishScores;
    }

    public double getTotalScores() {
        return this.mathScores + this.physicScores + this.englishScores;
    }

    // public String getAllInfo() {
    //     return String.format("id=%s, name=%s, mathScores=%f, physicScores=%f, englishScores=%f",
    //     super.id, super.name, this.mathScores, this.physicScores, this.englishScores);
    // }

    // @Override
    // public String getInfo() {
    //     return String.format("%s, mathScores=%f, physicScores=%f, englishScores=%f",
    //     super.getInfo(), this.mathScores, this.physicScores, this.englishScores);
    // }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicScores() {
        return physicScores;
    }

    public void setPhysicScores(double physicScores) {
        this.physicScores = physicScores;
    }

    public double getEnglishScores() {
        return englishScores;
    }

    public void setEnglishScores(double englishScores) {
        this.englishScores = englishScores;
    }

    @Override
    public String toString() {
        return String.format("Student_A1 [id=%s, name=%s, mathScores=%f, physicScores=%f, englishScores=%f]",
        super.getId(), super.getName(), this.mathScores, this.physicScores, this.englishScores);
        
        // return String.format("Student_A1 [%s, mathScores=%f, physicScores=%f, englishScores=%f]",
        // super.toString(), this.mathScores, this.physicScores, this.englishScores);
    }

    @Override
    public boolean equals(Object obj) {
        // So sánh giữa this và obj

        // B1: Cast Object thành Student_A1
        Student_A1 castedObj = (Student_A1)obj;

        // B2: Thực hiện gọi ra thông tin và so sánh
        boolean result = this.getTotalScores() == castedObj.getTotalScores();

        return result;
    }
    
}
