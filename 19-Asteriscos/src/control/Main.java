package control;

import org.apache.commons.lang3.time.StopWatch;

import utilidades.Writer;

public class Main {

	public static void main(String[] args) {

		dibujarPiramide(Writer.leerInt());

	}

	public static void dibujarPiramide(int n) {

		StopWatch watch = new StopWatch();
		watch.start();

		String fila = "";

		int max = n * 2;

		for (int j = 0; j < max; j++) {

			int nEsp = max - j;
			String esp = "";

			for (int i = 0; i < nEsp; i++) {
				esp += " ";
			}

			fila += "* ";

			if (!par(j)) {
				System.out.println(esp + fila);
			}

			esp = "";
		}

		watch.stop();
		System.out.println(watch.getTime());
	}

	public static boolean par(int n) {
		if (n % 2 != 1) {
			return true;
		} else {
			return false;
		}
	}
}
