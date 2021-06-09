package basic_java_programs;

public class FunctionsOrMethods {

	public static void main(String[] args) { // independent small unit of execution
		System.out.println("Printing in Main");
		test();
		test();
		test(); // can call the function as many times you want
		sanitytest();
		FunctionsOrMethods.sanitytest();
		FunctionsOrMethods.test();
		something();
		something(1);
		something(1, 2, 3);
		FunctionsOrMethods.something(4, 5, 6);
		something("Hello", 1, 2);
	}

	public static void test() {
		System.out.println("Printing in test");
	}

	public static void sanitytest() {
		System.out.println("Printing in Sanity");
	}
	
	
	public static void something() { // 1st one
		System.out.println("this is something method");
	}
	
	
	public static void something(int a) { //2nd one
		System.out.println("print the value inside the parameter");
	}

	public static void something(int a, int b, int c) { //3rd one
		int sum = a + b + c;
		System.out.println(sum);

	}

	public static void something(String a, int b, int c) { //4th one
		String sum = a + b + c;
		System.out.println(sum);
	} 
}
