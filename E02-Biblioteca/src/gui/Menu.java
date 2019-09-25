package gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.Book;
import model.Disk;
import model.Format;
import utility.Writer;

public class Menu {

	public static void showMenu() {
		System.out.println("-------------------------------------------------------------");
		System.out.println("¿Que quieres hacer?\n\n" + "1)Añadir un libro a la biblioteca\n" + "2)Añadir un disco\n"
				+ "3)Numero de libros prestados\n" + "4)Publicaciones anteriores a (fecha a elegir)\n"
				+ "5)Listado de publicaciones y discos\n"
				+ "6)Listado de publicaciones y discos diferenciando prestados");
		System.out.println("-------------------------------------------------------------");
	}

	public static Book readBook() {

		String title = null;
		Date date = null;
		String edition = null;
		String author = null;
		String ISBN = null;

		System.out.println("Escribe el titulo del libro:");
		title = Writer.readString();

		date = Writer.readDate();
		
		System.out.println("Escribe la edicion del libro:");
		edition = Writer.readString();

		System.out.println("Escribe el nombre del autor:");
		author = Writer.readString();

		System.out.println("Escribe el ISBN del libro:");
		ISBN = Writer.readString();

		return new Book(date, title, edition, ISBN, author);

	}

	public static Disk readDisk() {

		String title = null;
		Format format = null;
		int duration = 0;

		System.out.println("Escribe el titulo del disco:");
		title = Writer.readString();

		System.out.println("Elige el formato del disco:\n1)MP3\n2)MP4\3)WAV");
		switch (Writer.readInt()) {
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

		System.out.println("Escribe la duracion del disco:");
		duration = Writer.readInt();

		return new Disk(title, format, duration);

	}
}
