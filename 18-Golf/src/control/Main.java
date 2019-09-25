package control;

import utilidades.Writer;

public class Main {

	private static final int DESC_MAYORES = 50;
	private static final int DESC_MUJERES = 15;
	private static final int DESC_MENORES_SOCIO = 35;
	private static final int DESC_MENORES_NO_SOCIO = 25;

	public static void main(String[] args) {

		cuotaSocio();

	}

	public static void cuotaSocio() {

		int cuotaInicial = 500;

		int descuento = 0;

		System.out.println("Introduzca su sexo: \n1) Mujer \n2) Hombre");

		int sexo = Writer.leerInt();

		System.out.println("Introduzca su edad:");

		int edad = Writer.leerInt();

		int socio = 0;

		if (edad < 18) {
			System.out.println("Es tu padre socio: \\n1) Si \\n2) No");

			socio = Writer.leerInt();
		}

		switch (sexo) {

		case 1:

			descuento = DESC_MUJERES;

		case 2:

			if (entre(edad, 0, 18)) {

				switch (socio) {
				case 1:
					descuento = DESC_MENORES_SOCIO;
					break;
				case 2:
					descuento = DESC_MENORES_NO_SOCIO;
					break;
				}

			} else if (edad >= 65) {
				descuento = DESC_MAYORES;
			}

			break;
		}

		System.out.println("Tu cuota es de " + (cuotaInicial - ((descuento * cuotaInicial) / 100)) + "€");
	}

	public static boolean entre(int x, int lower, int upper) {
		return lower <= x && x <= upper;
	}
}
