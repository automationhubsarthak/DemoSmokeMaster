package basic_java_programs;

public class Nested_For_Loop { //for loop inside a for loop is called nested for loop

	public static void main(String[] args) {
		
		for(int i=1 ;  i<=5 ; i++) {
			System.out.println("the value of is i is : " + i);
			for(int j=1 ; j<=5; j++) {
				System.out.println("The value of j is : "+ j);
			}
		}
		
	}

}
