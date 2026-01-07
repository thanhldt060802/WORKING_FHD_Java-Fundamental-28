package example1;
public interface FeatureGroup1 {

    default void simpleDefaultMethod1() {
		System.out.println("Handling simple default method 1 by FeatureGroup1 interface!");
	}
	
	default void simpleDefaultMethod2() {
		System.out.println("Handling simple default method 2 by FeatureGroup1 interface!");
	}

	public abstract void simpleMethod1();
	
	public abstract void simpleMethod2();
    
}
