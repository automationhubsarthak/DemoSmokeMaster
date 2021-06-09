package constructor_concepts;

public class Car {
	
	String model;
	int price;
	int wheels;
	
	//constructor - name similar to the class name. It looks similar to a method but it is not a method. It has no return type
	//whenever we write an object in the main method like new Car(); then the constructor is called. So typically as soon as we make the object of the Class, the constructor is called
	//constructor will help us initalize the object
	 public Car() {
		System.out.println("This is no argument constructor"); 
	 }
	 
	/* public Car(String m, int p) {      //this concept is known as overloading of Constructors
		 model = m;
		 price = p;
	 } */
	 
public Car(String model, int price) {
	this.model = model;          // in this situation global variable model does not come into picture as local variable is hiding it
	this.price = price;           //hence use the keyword this. It is a keyword in Java which will always point towards the current object
	
}
	
	public static void main(String[] args) {
		Car C1 = new Car();
		Car C2 = new Car();
		Car C3 = new Car();
		
		C1.model = "Hyundai";
		C1.price = 1000000;
		C1.wheels = 4;
		C1.start();
		C1.accelerate();
		
		C2.model = "Maruti";
		C2.price = 500000;
		C2.wheels = 4;
		C2.start();
		C2.accelerate();
		
	}
	
	public void start() {
		System.out.println(model + "starting");
	}
	
	public void accelerate() {
		System.out.println(model + "accelerating");
	}

}
