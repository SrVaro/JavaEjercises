package control;

import utility.Matrix;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = new int[5][5];

		fillMatrix(matrix);

		Matrix.printIntMatrix(matrix);

		System.out.println("---------");

		Matrix.printIntMatrix(rotateMatrix(matrix));

	}

	public static int[][] fillMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				matrix[i][j] = j;

			}
		}

		return matrix;
	}

	public static int[][] rotateMatrix(int[][] matrix) {

		int row = matrix.length;
		int col = matrix[0].length;

		int nRow = 0;
		int nCol = 0;
		int[][] newMatrix = new int[row][col];
		for (int i = row - 1; i >= 0; i--) {
			nCol = 0;
			for (int j = col - 1; j >= 0; j--) {
				newMatrix[nRow][nCol] = matrix[i][j];
				nCol++;
			}
			nRow++;
		}
		return newMatrix;

	}

}
