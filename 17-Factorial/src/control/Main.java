package control;

import utilidades.Writer;

public class Main {

	public static void main(String[] args) {
		factorial(Writer.leerInt());
	}

	public static void factorial(int n) {

		int res = 1;

		for (int i = 2; i <= n; i++) {
			res = res * i;
		}

		System.out.println(res);

	}

}
