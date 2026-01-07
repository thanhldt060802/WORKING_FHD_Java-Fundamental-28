package package_1;

public class Student_A1 extends Person {

	public double mathScores;
	public double physicsScores;
	public double englishScores;
	
	public Student_A1() {
	}
	
	public double getTotalScores() {
		return this.mathScores + this.physicsScores + this.englishScores;
	}

}