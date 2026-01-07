public class Cone extends Shape3D {
	
	public int h;
	public int r;

	public Cone(String name, int h, int r) {
		super(name);
		this.h = h;
		this.r = r;
	}
	
	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(this.r, 2) + Math.PI * this.r * Math.sqrt(Math.pow(this.h, 2) + Math.pow(this.r, 2));
	}
	
	@Override
	public double calculateVolume() {
		return Math.PI * Math.pow(this.r, 2) * this.h / 3;
	}
	
}