package basic_java_programs;

public class Nested_For_Loop_Basics {

	public static void main(String[] args) {
		//for loop inside a for loop is known as nested for loop
		//inner loop executes completely when outer loop executes
		for(int i =1 ; i<=5 ; i++) {
			//code logic which is specific to this body of the outer loop
			System.out.println("Outer for loop repitition" + i);
			
			for(int j = 1 ; j<=5 ; j++) {
				//code logic which will be for both inner loop and outer loop
				System.out.println(" i = " + i + " : j = " + j);
			}
			
			//code logic which will be for the outer loop
		}

	}

}
