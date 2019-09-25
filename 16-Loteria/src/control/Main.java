package control;

public class Main {

	public static void main(String[] args) {

		int[] b = new int[15];

		for (int i = 0; i < b.length; i++) {
			b[i] = (int) Math.ceil(Math.random() * 1000000);
		}

		comprobarLoteria(b);
	}

	public static void comprobarLoteria(int[] num) {

		final int PREMIO = (int) Math.ceil(Math.random() * 1000000);

		for (int i = 0; i < num.length; i++) {
			if ((int) Math.ceil(Math.random() * 1000000) != PREMIO)
				System.out.println("No hay premio");
			else
				System.out.println("Hay premio");
		}

	}

}