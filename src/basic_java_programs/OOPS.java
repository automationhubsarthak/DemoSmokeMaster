package basic_java_programs;

public class OOPS {
	
	String name;
	static int age;
	int rollnumber;
	static int strengthofclass = 10;

	public static void main(String[] args) {
		test();
		System.out.println("this is the main method");
		
		OOPS obj = new OOPS();
		obj.sampleTest();
		obj.rollnumber = 21;
		obj.name = "Hello";
	}

	public static void test() {
		int a = 100;
		String coding = "JAVA";
	
	}

	public void sampleTest() {
		test();
		
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a + b + c;
		System.out.println(sum);
	}

}
