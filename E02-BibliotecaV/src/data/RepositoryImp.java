package data;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import gui.UI;
import model.Book;
import model.Disk;
import model.Multimedia;
import model.Publication;

public class RepositoryImp implements RepositoryI {

	private ArrayList<Publication> publicationList = new ArrayList<>();
	private ArrayList<Multimedia> multimediaList = new ArrayList<>();

	public void bookBorroweds() {

		int sum = 0;

		for (Publication p : publicationList) {
			if (p.isBorrowed())
				sum++;
		}

		System.out.println(sum);
	}

	public void publicationsBefore(Date date) {
		for (Publication p : publicationList) {
			if (p.getPublishDate().before(date))
				System.out.println(p);
		}
	}

	public void printAllMedia() {
		publicationList.forEach((n) -> System.out.println(n));
	}

	public void printAllMediaDiff() {
		System.out.println("Publicaciones prestadas:");
		for (Publication p : publicationList) {
			if (p.isBorrowed())
				System.out.println(p);
		}

		UI.separationMsg();

		System.out.println("Publicaciones no prestadas:");
		for (Publication p : publicationList) {
			if (!p.isBorrowed())
				System.out.println(p);
		}
	}

	public void addBook(Book book) {
		publicationList.add(book);
	}

	public void addDisk(Disk disk) {
		multimediaList.add(disk);
	}

	public void exportData() {

		BufferedWriter writer = null;
		try {
			String timeLog = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
			File logFile = new File(timeLog);

			System.out.println(logFile.getCanonicalPath());

			writer = new BufferedWriter(new FileWriter(logFile));

			writer.write("Publicaciones:\n");

			for (Publication p : publicationList) {
				writer.write(p.toString() + "\n");
			}

			for (Multimedia m : multimediaList) {

				writer.write(m.toString() + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}

	}

}
