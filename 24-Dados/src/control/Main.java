package control;

public class Main {

	public static void main(String[] args) {
		rollDices();
	}

	public static void rollDices() {

		int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0;

		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.ceil((Math.random() * 6)));

			switch (n) {
			case 1:
				d1++;
				break;
			case 2:
				d2++;
				break;
			case 3:
				d3++;
				break;
			case 4:
				d4++;
				break;
			case 5:
				d5++;
				break;
			case 6:
				d6++;
				break;
			}
		}

		System.out.println("Dado 1: " + d1 + "%");
		System.out.println("Dado 2: " + d2 + "%");
		System.out.println("Dado 3: " + d3 + "%");
		System.out.println("Dado 4: " + d4 + "%");
		System.out.println("Dado 5: " + d5 + "%");
		System.out.println("Dado 6: " + d6 + "%");

	}
}
