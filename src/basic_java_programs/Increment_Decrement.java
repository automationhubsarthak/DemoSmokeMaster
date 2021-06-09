package basic_java_programs;

public class Increment_Decrement {

	public static void main(String[] args) {
		
		int m = 100; 
		int n = m--;  
		System.out.println(n);
		System.out.println(m);
	   int p = --m;   
	   System.out.println(p);
		int l = n--;     
		System.out.println(l);
		System.out.println(n);
		int z = p-- + --n;  
		System.out.println(z);
		z = --p - ++n; 
		System.out.println(z);
		z = --p - n++;
		System.out.println(z);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("the latest value of z is :" + z); 
		
		System.out.println("the value of n is: " + n);    //yahaan bhi n ki latest value aayegi 98                                               
		System.out.println("this post increment parameter will print : " + n++);  //print hoga 98 but latest value of n inside logic will become 99
		System.out.println(" this pre increment parameter will print : " + ++n); //100 - this will print and n ki value bhi 100 ho jayegi
		System.out.println("this post decrement parameter will print : " + n--);     //print hoga 100 but n latest value 99 ho jayegi
		System.out.println("this pre decrement parameter will print :" + --n);      //print karegi 98 aur n ki latest value bhi 98 ho jayegi     
		
		System.out.println("the value of p is:" + p);
		//System.out.println(p++);
		//System.out.println(++p);
		//System.out.println(p--);
		//System.out.println(--p);
		
		System.out.println("the value of l is:" + l);
		//System.out.println(l++);
		//System.out.println(++l);
		//System.out.println(l--);
		//System.out.println(--l);
		
		
		System.out.println(z);
		//System.out.println(z++);
		//System.out.println(++z);
		//System.out.println(z--);
		//System.out.println(--z); */
	}

}
