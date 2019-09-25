package utility;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import gui.UI;

@SuppressWarnings("resource")
public class Writer {

	public static int readInt() {
		return new Scanner(System.in).nextInt();
	}

	public static String readString() {
		return new Scanner(System.in).nextLine();
	}

	public static Date randomDate() {

		Random random = new Random();
		int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);

		return Date.valueOf(randomBirthDate);

	}

	public static Date readDate() {

		UI.dateMsg();

		boolean correct = false;
		Date date = null;

		while (!correct) {

			try {
				date = Date.valueOf(Writer.readString());
				correct = true;
			} catch (IllegalArgumentException e) {
				UI.wrongData();
			}

		}

		return date;
	}

}
