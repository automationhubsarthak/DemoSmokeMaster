package exception_handling;

public class Division {

	public static void main(String[] args) {
	
		try {
			System.out.println("A");
			int j = 2/0;      //Exception will come
			System.out.println("B");
			System.out.println(j);
		} catch (Exception e) {      //if you want to write catch(Throwable e) then you can get both errors and exceptions. As Throwable is the super class
			System.out.println("Some error :" + e.getMessage());
		   e.printStackTrace();
		}
 System.out.println("C");
	}

}
