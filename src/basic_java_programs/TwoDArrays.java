package basic_java_programs;

public class TwoDArrays {

	public static void main(String[] args) {

		String x[][] = new String[3][4];

		x[0][0] = "Begin";
		x[0][1] = "Coding";
		x[0][2] = "More";
		x[0][3] = "Now";

		x[1][0] = "Begin";
		x[1][1] = "Coding";
		x[1][2] = "More";
		x[1][3] = "Now";

		x[2][0] = "Begin";
		x[2][1] = "Coding";
		x[2][2] = "More";
		x[2][3] = "Now";
		
		System.out.println("The rows in the array are : " + x.length);       // number of rows
		System.out.println("The columns in the array are :" + x[0].length);     //number of columns
		
		int rows = x.length;
		int cols = x[0].length;
		
		for(int rowNum= 0; rowNum<rows; rowNum++) {
			for(int colNum=0; colNum<cols; colNum++) {
				System.out.print(x[rowNum][colNum] + " ----");
			}
			System.out.println();
		}
		
      
		 Object obj[][] = new Object[2][5];           //Object Array can store different data types
		 obj[0][0] = "HelloWorld";              //can keep a String
		 obj[0][1] = 123;                             //can store an integer
		 obj[0][2] = 'c';                                  //character
		 obj[0][3] = true;                             //boolean value
		 obj[0][4] = 32.12;                         //double
	}

}
