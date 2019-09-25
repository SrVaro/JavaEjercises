package Utilidades;

import java.util.Scanner;

import Modelo.Punto;

@SuppressWarnings("resource")
public class Writer {

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static Punto leerPunto() {
		return new Punto(leerInt(), leerInt());
	}

}
