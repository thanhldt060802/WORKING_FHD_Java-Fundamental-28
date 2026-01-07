public class Student_A1 extends Person {

	public double mathScores;
	public double physicsScores;
	public double englishScores;
	
	public Student_A1() {
        super("???", "???");
		System.out.println("Student_A1() constructor is called!");
	}
	
	public Student_A1(String id, String name, double mathScores, double physicsScores, double englishScores) {
        super("???", "???");
		System.out.println("Student_A1(String, String, double, double, double) constructor is called!");
		super.id = id;
		super.name = name;
		this.mathScores = mathScores;
		this.physicsScores = physicsScores;
		this.englishScores= englishScores;
	}
	
	public double getTotalScores() {
		return this.mathScores + this.physicsScores + this.englishScores;
	}
	
	public String getAllInfo() {
		return String.format("Student_A1 [id=%s, name=%s, mathScores=%f, physicsScores=%f, englishScores=%f]",
		super.id, super.name, this.mathScores, this.physicsScores, this.englishScores);
	}

}