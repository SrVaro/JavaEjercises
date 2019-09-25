package Utilidades;

import Modelo.Punto;

public class Geometria {
	public static double calcularDistancia(Punto p1, Punto p2) {
		return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	}
}
