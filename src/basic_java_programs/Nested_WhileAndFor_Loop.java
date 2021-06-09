package basic_java_programs;

public class Nested_WhileAndFor_Loop {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 8 ) {
			System.out.println("While loop repitition which is outer loop" + i);
			
			for(int j = 1 ; j <=5 ; j++) {
				System.out.println("i = " + i + " : j =" + j);
			}
			i++;
		}

	}

}
