package basic_java_programs;

public class ReturnTypes_Java {

	public static void main(String[] args) {
		ReturnTypes_Java ref = new ReturnTypes_Java();
		int l = ref.sum();
		System.out.println(l);
		
		
		
		String S2 = ref.something();
		System.out.println(S2);
		
		int m = ref.somethingparameter(10, 20);
		System.out.println(m);
		
	}
	
	//return type of this method is int
	public int sum() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;	
	}
	
	//return type of this method is String
	public String something() {
		String S1 = "Selenium";
	return S1;
	}
	
	//i and j are input parameters or arguments
	//return type of this method is int
	public int somethingparameter(int i, int j) {
		int k = i*j;
		return k;
	}

}
