package control;

import utility.Writer;

public class Main {

	public static void main(String[] args) {
		translate();
	}

	public static void translate() {

		System.out.println("Introduce una palabra");

		String line = Writer.readString();

		System.out.println("¿En que idioma quieres traducirlo?\n1)Aleman\n2)Bulgaro\n3)Catalan");

		int idiom = Writer.readInt();

		char lastChar = line.charAt(line.length() - 1);

		switch (idiom) {

		case 1:

			if (isVocal(lastChar)) {
				line = line.substring(0, line.length() - 1) + "ujem";
			} else {
				line = line.substring(0, line.length() - 1) + "ujem";
			}

			break;

		case 2:

			if (isVocal(lastChar)) {
				line += "kov";
			} else {
				line = line.substring(0, line.length() - 1) + "kov";
			}

			break;

		case 3:

			line = line.substring(0, line.length() - 1);

			break;
		}

		System.out.println(line);

	}

	public static boolean isVocal(char c) {
		boolean vocal = false;

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			vocal = true;
		}

		return vocal;
	}

}
