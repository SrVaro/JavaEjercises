package Utilidades;

import Modelo.Punto;

public class Geometria {
	public static double calcularDistancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	}

	public static String calcularAreaRectangulo() {

		System.out.println("Ingresa los cuatro puntos que conforman el rectangulo");

		Punto p1 = Writer.leerPunto();

		Punto p2 = Writer.leerPunto();

		Punto p3 = Writer.leerPunto();

		Punto p4 = Writer.leerPunto();

		double base = Geometria.calcularDistancia(p1, p2);
		double altura = Geometria.calcularDistancia(p3, p4);

		return "El area del rectangulo es: " + base * altura;

	}

	public static double LadoMasLargoDado() {

		System.out.println("Ingresa tres puntos que conforman un triangulo");

		Punto p1 = Writer.leerPunto();

		Punto p2 = Writer.leerPunto();

		Punto p3 = Writer.leerPunto();

		return getLadoMasLargo(p1, p2, p3);
	}

	public static double getLadoMasLargo(Punto p1, Punto p2, Punto p3) {
		return Math.max(calcularDistancia(p3, p1), Math.max(calcularDistancia(p1, p2), calcularDistancia(p2, p3)));
	}
}
