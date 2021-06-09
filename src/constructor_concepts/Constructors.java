package constructor_concepts;

public class Constructors {

	public static void main(String[] args) {
		
		Car a = new Car();   //this points to the constructor with default argument
		Car b = new Car();
		Car c = new Car();
		
		a.model = "BMW";
		a.price = 1200000;
		
		Car d = new Car("Hyundai" , 1000000);    //this will point to the constructor which accepts a String and an integer
		System.out.println(d.model);
		System.out.println(d.price);
		
		//so now I can create the object of the Class and initalize the non static variables at the same time

		
		 Car e = new Car("AstonMartin" , 1000000);
		 System.out.println(e.model);
			System.out.println(e.price);
	}

}
