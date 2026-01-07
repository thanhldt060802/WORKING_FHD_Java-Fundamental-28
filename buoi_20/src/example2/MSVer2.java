package example2;

public class MSVer2 extends MSVer1 implements FeatureGroup1, FeatureGroup2 {

	@Override
	public void simpleMethod1() {
		System.out.println("Handling simple method 1 by MSVer2 class!");
	}
	
	@Override
	public void simpleMethod2() {
		System.out.println("Handling simple method 2 by MSVer2 class!");
	}
	
	@Override
	public void simpleMethod3() {
		System.out.println("Handling simple method 3 by MSVer2 class!");
	}

}
