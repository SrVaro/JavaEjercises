package control;

import utilidades.Writer;
import org.apache.commons.lang3.time.StopWatch;

public class Main {

	public static void main(String[] args) {

		dibujarPiramide(Writer.leerInt());

	}

	public static void dibujarPiramide(int n) {

		StopWatch watch = new StopWatch();
		watch.start();

		StringBuilder fila = new StringBuilder("");

		int max = n * 2;

		for (int j = 0; j < max; j++) {

			int nEsp = max - j;
			StringBuilder esp = new StringBuilder("");

			for (int i = 0; i < nEsp; i++) {
				esp.append(" ");
			}

			fila.append("* ");

			if (!par(j)) {
				System.out.println(esp + fila.toString());
			}

			esp.delete(0, esp.capacity());
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
