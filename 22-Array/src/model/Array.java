package model;

import utilidades.Writer;

public class Array {

	public static void printArray(int[] array) {

		String repArray = "";

		for (int i = 0; i < array.length; i++) {
			repArray += array[i] + ", ";
		}

		System.out.println(repArray);
	}

	public static int[] newIntArray(int size) {

		int[] newArray = new int[size];

		System.out.println("Introduce " + size + " numeros");

		for (int i = 0; i < size; i++) {
			newArray[i] = Writer.readInt();
		}

		return newArray;
	}

	public static float arraySummation(int[] array) {

		int suma = 0;

		for (int i = 0; i < array.length; i++) {
			suma += array[i];
		}

		System.out.println("Suma total: " + suma);

		return suma;
	}

	public static int[] reverseArray(int[] array) {

		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[array.length - i - 1] = array[i];
		}

		printArray(newArray);

		return newArray;
	}
}
