package example1;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // MS1 ms1 = new MS1();  // Original object
		// ms1.simpleDefaultMethod1();
		// ms1.simpleDefaultMethod2();
		// ms1.simpleMethod1();
		// ms1.simpleMethod2();
		// ms1.simpleMethod3();
		// ms1.simpleMethod6();

		// List
		// ArrayList

		FeatureGroup1 ms2 = new MS2();  // Polymorphic object
		ms2.simpleDefaultMethod1();
		ms2.simpleDefaultMethod2();
		ms2.simpleMethod1();
		ms2.simpleMethod2();
		((FeatureGroup3)ms2).simpleMethod4();
		((FeatureGroup3)ms2).simpleMethod5();

    }

}
