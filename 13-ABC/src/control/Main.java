package control;

public class Main {

	public static void main(String[] args) {
		// abecedarioWhile();
		// abecedarioFor();
		abecedarioDoWhile();
	}

	public static void abecedarioDoWhile() {
		boolean fin = true;
		Character a = 65;

		do {
			System.out.println(a);
			a++;
			if (a == 91)
				fin = false;
		} while (fin);
	}

	public static void abecedarioFor() {
		Character a = 65;
		for (a = 65; a <= 90; a++) {
			System.out.println(a);
		}
	}

	public static void abecedarioWhile() {
		boolean fin = true;
		Character a = 65;

		while (fin) {
			System.out.println(a);
			a++;
			if (a == 90)
				fin = false;
		}
	}

}
