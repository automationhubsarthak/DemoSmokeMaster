package basic_java_programs;

public class OneDArrays {

	public static void main(String[] args) {

		String str[] = new String[3];
		str[0] = "Hello";
		str[1] = "CromaBatch";
		str[2] = "Welcome";
		System.out.println("The length of the String array is :" + str.length);
		for (int x = 0; x < str.length; x++) {
			System.out.println(str[x]);
		}

		int i[] = new int[3];
		i[0] = 23;
		i[1] = 10;
		i[2] = 234;
		System.out.println("The length of the integer array is :" + i.length);
		for (int y = i.length - 1; y >= 0; y--) {
			System.out.println(i[y]);
		}

		char array2[] = new char[3];
		array2[0] = 'c';
		array2[1] = 'r';
		array2[2] = 'm';
		System.out.println("The length of the character array is :" + array2.length);

		// print all the elements inside this character array
		for (int z = 0; z < array2.length; z++) {
			System.out.println(array2[z]);
		}

	}

}
