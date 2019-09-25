package Control;

import Utilidades.Writer;

public class Main {

	public static void main(String[] args) {
		parImpar();
	}

	public static void parImpar() {

		if (Writer.leerInt() % 2 != 1) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
	}
}
