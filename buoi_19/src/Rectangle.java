public class Rectangle extends Shape2D {

	public int w;
	public int h;
	
	public Rectangle(String name, int w, int h) {
		super(name);
		this.w = w;
		this.h = h;
	}
	
	@Override
	public double calculatePerimeter() {
		return (this.w + this.h) * 2;
	}
	
	@Override
	public double calculateArea() {
		return this.w * this.h;
	}

}