package Modelo;

import Utilidades.Geometria;

public class Rectangulo {

	private Punto p1, p2, p3, p4;

	public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public double calcularArea() {

		double base = Geometria.calcularDistancia(p1, p2);
		double altura = Geometria.calcularDistancia(p3, p4);

		return base * altura;
	}
}
