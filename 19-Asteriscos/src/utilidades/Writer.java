package utilidades;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Writer {

	public static int leerInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String leerString() {
		return new Scanner(System.in).nextLine();
	}

}
