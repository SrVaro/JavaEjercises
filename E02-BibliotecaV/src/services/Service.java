package services;

import data.RepositoryImp;
import model.MediaFactory;
import test.DataTest;
import utility.Writer;

public class Service {

	private static RepositoryImp r = new RepositoryImp();
	
	public static void fillWithData() {
		DataTest.test(r);
	}

	public static void addBook() {
		r.addBook(MediaFactory.readBook());
	}
	
	public static void addDisk() {
		r.addDisk(MediaFactory.readDisk());
	}
	
	public static void printAllMedia() {
		r.printAllMedia();
	}
	
	public static void bookBorroweds() {
		r.bookBorroweds();
	}
	
	public static void publicationsBefore() {
		r.publicationsBefore(Writer.readDate());
	}
	
	public static void printAllMediaDiff() {
		r.printAllMediaDiff();
	}
	
	public static void exportData() {
		r.exportData();
	}

}
