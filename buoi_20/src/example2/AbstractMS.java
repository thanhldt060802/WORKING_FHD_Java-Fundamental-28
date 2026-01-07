package example2;

public abstract class AbstractMS implements FeatureGroup {

	@Override
	public void simpleMethod1() {
		System.out.println("Handling simple method 1 by AbstractMS class!");
	}
	
	public abstract void simpleMethod3();

}
