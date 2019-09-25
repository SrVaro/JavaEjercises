package utility;

public class Matrix {

	public static void printIntMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {

			String fila = "";

			for (int j = 0; j < matrix[0].length; j++) {

				fila += matrix[i][j] + " ";
			}

			System.out.println(fila);

		}

	}

}
