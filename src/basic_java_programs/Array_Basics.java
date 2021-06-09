package basic_java_programs;

public class Array_Basics {

	public static void main(String[] args) {
	//Arrays are store houses. They store multiple values in a single variable
		//They are declared with the variable type using square brackets
		
		int[] iarray = {1,2,3,4,5,6, -21}; //integer array
	    System.out.println("the size of this integer array is :" + iarray.length);
		
		String[] cars = {"Maruti", "Honda", "BMW", "Mercedes"};  //String array
		System.out.println("the size of this String array is :" +cars.length);
		
		char[] viowels = {'a', 'e' , 'i' , 'o', 'u'}; //character array
		System.out.println("the size of this character array is :" +viowels.length);
		
		boolean[] array = {true, false};  //boolean array
		System.out.println("the size of this boolean array is :" +array.length);
		
		//Array index starts with 0
	
		String[] cars1 = {"Maruti", "Honda", "BMW"};
		System.out.println(cars1[0]);
		System.out.println(cars1[1]);
		System.out.println(cars1[2]);
		//System.out.println(cars1[3]);  if you try to print this it will give array out of bounds exception
		
		System.out.println(cars1.length);   // to determine the length of the array

		String[] bikes = {"Bajaj" , "KTM", "Ducati", "Hero"};
		System.out.println(bikes.length);
		
		for(int i = 0; i <=bikes.length; i++) {
			System.out.print(bikes[i] + " ");
		}
		
	}

}
