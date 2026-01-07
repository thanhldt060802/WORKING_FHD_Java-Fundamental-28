package example1;
public class MS1 implements FeatureGroup1, FeatureGroup2, FeatureGroup4 {

    @Override
    public void simpleDefaultMethod1() {
        System.out.println("Handling simple default method 1 by MS1 class!");
    }

	@Override
	public void simpleMethod1() {
		System.out.println("Handling simple method 1 by MS1 class!");
	}
	
	@Override
	public void simpleMethod2() {
		System.out.println("Handling simple method 2 by MS1 class!");
	}
	
	@Override
	public void simpleMethod3() {
		System.out.println("Handling simple method 3 by MS1 class!");
	}
	
	@Override
	public void simpleMethod6() {
		System.out.println("Handling simple method 6 by MS1 class!");
	}

}