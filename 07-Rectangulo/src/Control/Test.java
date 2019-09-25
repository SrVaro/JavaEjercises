package Control;

import Modelo.Punto;
import Modelo.Rectangulo;
import Utilidades.Writer;

public class Test {
	public static void testRectangulo() {

		System.out.println("Ingresa los cuatro puntos que conforman el rectangulo (x,y)");

		Punto p1 = Writer.leerPunto();

		Punto p2 = Writer.leerPunto();

		Punto p3 = Writer.leerPunto();

		Punto p4 = Writer.leerPunto();

		Rectangulo r = new Rectangulo(p1, p2, p3, p4);

		System.out.println("El area del rectangulo es: " + r.calcularArea());
	}
}
