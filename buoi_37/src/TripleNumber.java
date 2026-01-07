public class TripleNumber {

	public int n1;
	public int n2;
	public int n3;
	
	public TripleNumber(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d, %d)", this.n1, this.n2, this.n3);
	}

}