package basic_java_programs;

public class Incr_dcr {

	public static void main(String[] args) {
		
		int a = 20;
		int b = a--;
		
		int c = a++ + b--;
		System.out.println(c);
		
		c = --a - b++;
		System.out.println(c);
		
		c = a++ - ++b;
		System.out.println(c);
		
		c = a -- + --b;
		System.out.println(c);
		
		c = (a*b) + b-- - (a*c) + b++ - a--;
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);

	}

}
