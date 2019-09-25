package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SuppressWarnings("resource")
public class Writer {

	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String readString() {
		return new Scanner(System.in).nextLine();
	}

	public static Date readDate() {

		Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

			System.out.println("Escribe la fecha de publicacion del libro: (yyyy-mm-dd)");

			date = dateFormat.parse(Writer.readString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return date;
	}

}
