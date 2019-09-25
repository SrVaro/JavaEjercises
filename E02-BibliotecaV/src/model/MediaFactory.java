package model;

import java.util.Date;

import com.github.javafaker.Faker;

import gui.UI;
import utility.Writer;

public class MediaFactory {

	public static Book CreateRandomBook() {

		Faker faker = new Faker();

		String title = faker.book().title();
		Date date = Writer.randomDate();
		String edition = faker.funnyName().name();
		String author = faker.book().author();
		String ISBN = Integer.toString((int) (Math.random() * 1000));

		return new Book(date, title, edition, ISBN, author);
	}

	public static Book readBook() {

		String title = null;
		Date date = null;
		String edition = null;
		String author = null;
		String ISBN = null;

		UI.dataMsg("titulo", "libro");
		title = Writer.readString();

		date = Writer.readDate();

		UI.dataMsg("edicion", "libro");
		edition = Writer.readString();

		UI.dataMsg("autor", "libro");
		author = Writer.readString();

		UI.dataMsg("ISBN", "libro");
		ISBN = Writer.readString();

		return new Book(date, title, edition, ISBN, author);

	}

	public static Disk readDisk() {

		String title = null;
		Format format = null;
		int duration = 0;

		UI.dataMsg("titulo", "disco");
		title = Writer.readString();

		UI.dataMsg("formato", "disco");
		UI.formatMsg();
		int n = Writer.readInt();
		while (n < 1 || n > 3) {

			switch (n) {
			case 1:
				format = Format.MP3;
				break;
			case 2:
				format = Format.MP4;
				break;
			case 3:
				format = Format.WAV;
				break;
			}
			UI.wrongData();
			n = Writer.readInt();
		}

		UI.dataMsg("duracion", "disco");
		duration = Writer.readInt();

		return new Disk(title, format, duration);
	}
}
