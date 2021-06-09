package basic_java_programs;

public class Concatenation {

	public static void main(String[] args) {

    int i = 100;          //initialized the value of i
    i = 300;                // you have changed the value of i from 100 to 300. So Java complier will accept this value
    i = 100;                //this is the latest value of i, so java compiler will take this value
    
    int j = 200;
    
    String S1 = "Selenium";
    String S2 = "Java";
    System.out.println(S1 + S2);
    System.out.println(i+j);
    
   System.out.println(i+j+S1+S2);
   System.out.println(S1+S2+i+j);
   System.out.println(S1+S2+(i+j));
    
    

	}

}
