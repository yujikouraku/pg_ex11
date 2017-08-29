package ex0909;

public class PrintArray {

	public static void main(String[] args) {
		int[][] arr = {
				{ 3, 1, 4, 1, },
				{ 5, 9, 2, },
				{ 6, 5, },
				{ 3, },
		};
		printArray(arr);
	}
	public static void printArray( int[][] x) {
		System.out.println("{");
		for (int i = 0; i < x.length; i++ ) {
			System.out.print("\t" + "{");
			for (int j = 0; j < x[i].length; j++ ){
				System.out.print(" " + x[i][j] + ",");
			}
			System.out.println(" },");
		}
		System.out.println("}");
	}

}
