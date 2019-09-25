package control;

public class Main {

	public static void main(String[] args) {

		dividirEnMonedas(5.35f);

	}

	public static void dividirEnMonedas(double n) {

		double[] monedas = new double[8];

		monedas[0] = 2;
		monedas[1] = 1;
		monedas[2] = 0.50d;
		monedas[3] = 0.20d;
		monedas[4] = 0.10d;
		monedas[5] = 0.05d;
		monedas[6] = 0.02d;
		monedas[7] = 0.01d;

		int suma = 0;

		for (int eur = 0; eur < monedas.length; eur++) {

			n = Math.round(n * 100d) / 100d;

			while (n >= monedas[eur]) {
				n -= monedas[eur];
				suma++;
			}

			System.out.println(suma + " monedas de " + monedas[eur] + "€");

			suma = 0;
		}
	}
}
