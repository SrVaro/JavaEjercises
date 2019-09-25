package control;

import utilidades.Writer;

public class Main {

	public static void main(String[] args) {
		System.out.println(sumaNPrimos(Writer.leerInt()));
	}

	public static int sumaNPrimos(int n) {
		int suma = 0;

		for (int i = 0; i < n; i++) {
			if (par(i))
				suma += i;
		}

		return suma;
	}

	public static boolean par(int n) {
		if (n % 2 != 1) {
			return true;
		} else {
			return false;
		}
	}

}
