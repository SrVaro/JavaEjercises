package control;

import model.Array;

public class Main {

	public static void main(String[] args) {

		int[] array = Array.newIntArray(5);

		Array.printArray(array);

		Array.arraySummation(array);

		Array.reverseArray(array);

	}

}
