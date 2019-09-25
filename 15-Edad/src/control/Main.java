package control;

import utilidades.Writer;

public class Main {

	public static void main(String[] args) {

		comprobarEdad(Writer.leerInt());

	}

	public static void comprobarEdad(int edad) {

		if (isBetween(edad, 0, 4))
			System.out.println("pequeñin");
		else if (isBetween(edad, 4, 10))
			System.out.println("niño");
		else if (isBetween(edad, 10, 40))
			System.out.println("adolescente");
		else if (isBetween(edad, 40, 80))
			System.out.println("talludito");

	}

	public static boolean isBetween(int x, int lower, int upper) {
		return lower <= x && x <= upper;
	}
}
