package Control;

import Modelo.Punto;
import Modelo.Triangulo;
import Utilidades.Geometria;

public class Test {

	public static void testTriangulo() {
		Triangulo t1 = new Triangulo(new Punto(0, 0), new Punto(0, 10), new Punto(5, 0));

		System.out.println(t1.getLadoMayor());

		System.out.println(Geometria.LadoMasLargoDado());
	}

}
