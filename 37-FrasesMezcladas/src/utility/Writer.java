package utility;

import java.util.Scanner;

@SuppressWarnings("resource")
public class Writer {

	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String readString() {
		return new Scanner(System.in).nextLine();
	}

}
