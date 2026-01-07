package example1;
public class MS2 implements FeatureGroup1, FeatureGroup3 {

	@Override
	public void simpleMethod1() {
		System.out.println("Handling simple method 1 by MS2 class!");
	}
	
	@Override
	public void simpleMethod2() {
		System.out.println("Handling simple method 2 by MS2 class!");
	}
	
	@Override
	public void simpleMethod4() {
		System.out.println("Handling simple method 4 by MS2 class!");
	}
	
	@Override
	public void simpleMethod5() {
		System.out.println("Handling simple method 5 by MS2 class!");
	}

}