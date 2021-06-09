package basic_java_programs;

public class For_Loops {

	public static void main(String[] args) {
		
		/*
		 syntax of for loop:    for(statement1; statement 2; statement 3){ 
		                                         logic of your code
		                                         }
		 */
		//print first 10 natural numbers from 10 to 1
		for(int i = 10; i >=1;  i--) {        // we use for loop when we know the number of iterations 
			System.out.println(i);
		}
		
		//print the sum of first 100 natural numbers
		//1 + 2 + 3 + 4+ ........+ 100 = 5050
		
		int sum = 0;
		for (int j = 1 ; j <=100 ; j++) {
			sum  = sum + j; // = 0 + 1 = 1
			                         // = 1 + 2 = 3
			                         // 3 + 3 = 6
			                         //6 + 4 = 10
			                         //10 + 5 = 15
			                         //15 + 6 = 21
			                         //21 + 7 = 28
		}
		System.out.println("the sum of first 100 natural numbers are : " + sum);
		

	}

}
