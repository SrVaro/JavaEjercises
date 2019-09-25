package data;

import java.util.Date;
import model.Book;

public interface RepositoryI {

	public abstract void publicationsBefore(Date date);

	public abstract void printAllMedia();

	public abstract void addBook(Book book);
	
	public abstract void exportData();

}
