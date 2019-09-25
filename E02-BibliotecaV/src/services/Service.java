package services;

import java.util.Date;

import data.RepositoryImp;
import model.Book;
import model.Disk;
import test.DataTest;

public class Service {

	private static RepositoryImp r = new RepositoryImp();
	
	public static void fillWithData() {
		DataTest.test(r);
	}

	public static void addBook(Book book) {
		r.addBook(book);
	}
	
	public static void addDisk(Disk disk) {
		r.addDisk(disk);
	}
	
	public static void printAllMedia() {
		r.printAllMedia();
	}
	
	public static void bookBorroweds() {
		r.bookBorroweds();
	}
	
	public static void publicationsBefore(Date date) {
		r.publicationsBefore(date);
	}
	
	public static void printAllMediaDiff() {
		r.printAllMediaDiff();
	}
	
	public static void exportData() {
		r.exportData();
	}

}
