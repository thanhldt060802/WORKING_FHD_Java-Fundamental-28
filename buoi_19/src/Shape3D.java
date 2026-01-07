public abstract class Shape3D extends Shape2D {
	
	public Shape3D(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return String.format("Shape3D [name=%s]", super.name);
	}
	
	@Override
	public double calculatePerimeter() {
		return -1;
	}
	
	public abstract double calculateVolume();

}