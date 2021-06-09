package basic_java_programs;

public class Pyramid_Example_NestedFor_Loop {

	public static void main(String[] args) {
	
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}	
		int down = 10;
		for(int a=1; a<=down; a++) {
			for(int b=down; b>a; b--) {
				System.out.print("$");
			}
			
			System.out.println();
		}

	}

}
