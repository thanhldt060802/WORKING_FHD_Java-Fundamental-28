public class A {

	public static class B {
	
		public int value;
		
		public B(int value) {
			this.value = value;
		}
		
		public void greeting() {
			System.out.println("From class B");
		}

        // public void testCallbackA() {
        //     A.this.greeting();
        //     System.out.println(A.this.value);
        // }
	
	}
	
	public int value;
	
	public A(int value) {
		this.value = value;
	}
	
	public void greeting() {
		System.out.println("From class A");
	}

    // public void testCallbackB() {
    //     B.this.greeting();
    //     System.out.println(B.this.value);
    // }

    public void solveProblem() {
		class C {
		
			public int value;
			
			public C(int value) {
				this.value = value;
			}
			
			public void greeting() {
				System.out.println("From class C!");
			}
		
		}
		
		C objectC = new C(-100);
		System.out.println(objectC.value);
		objectC.greeting();
	}

}