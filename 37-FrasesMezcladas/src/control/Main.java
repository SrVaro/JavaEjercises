package control;

import utility.Writer;

public class Main {

	public static void main(String[] args) {
		mix(Writer.readString(), Writer.readString());
	}

	public static void mix(String line1, String line2) {

		char[] chars1 = line1.toCharArray();
		char[] chars2 = line2.toCharArray();

		char[] newChars = new char[line1.length() + line2.length()];

		int cont1 = 0;
		int cont2 = 0;

		for (int i = 0; i < newChars.length; i++) {

			if (par(i)) {
				newChars[i] = chars1[cont1];
				cont1++;
			} else {
				newChars[i] = chars2[cont2];
				cont2++;
			}
		}

		System.out.println(new String(newChars));

	}

	public static boolean par(int n) {
		if (n % 2 != 1) {
			return true;
		} else {
			return false;
		}
	}

}
