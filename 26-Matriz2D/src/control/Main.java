package control;

public class Main {

	public static void main(String[] args) {

		int[][] matrix = new int[5][5];

		fillMatrix(matrix);

	}

	public static int[][] fillMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				matrix[i][j] = j;
				
				System.out.println(matrix[i][j]);

			}
		}

		return matrix;
	}

}
