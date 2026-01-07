public class UtilMethods<T> {

	private T nonStaticValue;
	
	public void nonStaticPrint(T value) {
		System.out.println(value);
	}

	public static <T> void staticPrint(T value) {
		System.out.println(value);
	}

}