package control;

import utilidades.Writer;

public class Main {

	public static void main(String[] args) {
		limite();
	}

	public static void limite() {

		System.out.println("Escribe un limite superior");
		int upperLimit = Writer.readInt();

		System.out.println("Escribe el limite inferior");
		int lowerLimit = Writer.readInt();

		System.out.println("Escribe un numero");

		int n = Writer.readInt();

		while (isBetween(n, lowerLimit, upperLimit)) {
			System.out.println(Math.pow(n, 4));

			System.out.println("Escribe un numero");
			n = Writer.readInt();
		}

	}

	public static boolean isBetween(int x, int lower, int upper) {
		return lower <= x && x <= upper;
	}
}
