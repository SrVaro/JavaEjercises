package data;

import java.util.ArrayList;
import java.util.Date;

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
		
		System.out.println("----------------------------------------");
		
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

}
