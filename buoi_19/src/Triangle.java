public class Triangle extends Shape2D {

	public int a;
	public int b;
	public int c;
	
	public Triangle(String name, int a, int b, int c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}

    @Override
	public double calculatePerimeter() {
		return this.a + this.b + this.c;
	}
	
	@Override
	public double calculateArea() {
		double p = this.calculatePerimeter() / 2;
		return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
	}

    @Override
    public void greeting() {
        System.out.println("Good bye world!");
    }

}