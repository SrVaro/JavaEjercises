package test;

import data.RepositoryImp;
import model.Book;
import model.MediaFactory;

public class DataTest {

	public static void test(RepositoryImp r) {

		Book book1 = MediaFactory.CreateRandomBook();
		Book book2 = MediaFactory.CreateRandomBook();
		Book book3 = MediaFactory.CreateRandomBook();
		Book book4 = MediaFactory.CreateRandomBook();
		Book book5 = MediaFactory.CreateRandomBook();

		book1.setBorrowed(true);
		book2.setBorrowed(true);
		book5.setBorrowed(true);

		r.addBook(book1);
		r.addBook(book2);
		r.addBook(book3);
		r.addBook(book4);
		r.addBook(book5);

	}

}
