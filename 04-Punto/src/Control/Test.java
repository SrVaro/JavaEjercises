package Control;

import Geometria.Geometria;
import Modelo.Punto;

public class Test {

	public static void testPuntos() {
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(10, 0);

		System.out.println(Geometria.calcularDistancia(p1, p2) + " unidades");

		System.out.println(p2.calcularDistanciaCentro() + " unidades");
	}

}
