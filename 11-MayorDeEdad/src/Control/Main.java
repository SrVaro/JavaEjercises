package Control;

import Utilidades.Writer;

public class Main {

	private final static int MAYORIA = 18;

	public static void main(String[] args) {
		System.out.println(mayorDeEdad(Writer.leerInt()));
	}

	public static boolean mayorDeEdad(int edad) {
		boolean mayorDeEdad = false;

		if (edad >= MAYORIA)
			mayorDeEdad = true;

		return mayorDeEdad;
	}

}
