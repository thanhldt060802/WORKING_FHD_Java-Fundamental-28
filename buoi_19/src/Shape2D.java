public abstract class Shape2D {

	public String name;
	
	public Shape2D(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Shape2D [name=%s]", this.name);
	}

	public abstract double calculatePerimeter();
	
	public abstract double calculateArea();

    public void greeting() {
        System.out.println("Hello world!");
    }

}