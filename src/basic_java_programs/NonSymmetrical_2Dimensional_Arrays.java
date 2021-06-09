package basic_java_programs;

public class NonSymmetrical_2Dimensional_Arrays {

	public static void main(String[] args) {
		int array[][] = { { 1, 2 }, { 3, 4, 5 } };
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		int[][] arrMulti = new int[2][]; // yes it's valid

		arrMulti[0] = new int[2];
		arrMulti[1] = new int[3];

		arrMulti[0][0] = 1;
		arrMulti[0][1] = 2;
		arrMulti[1][0] = 3;
		arrMulti[1][1] = 4;
		arrMulti[1][2] = 5;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
