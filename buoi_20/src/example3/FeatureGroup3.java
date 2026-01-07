package example3;

public interface FeatureGroup3 extends FeatureGroup1, FeatureGroup2 {

	@Override
	default void simpleMethod1() {
		System.out.println("Handling simple method 1 by FeatureGroup3 interface!");
	}

	public abstract void simpleMethod4();
	
}
