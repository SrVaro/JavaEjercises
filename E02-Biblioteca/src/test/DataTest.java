package test;

import java.sql.Date;
import java.time.LocalDate;

import data.RepositoryImp;
import model.Book;

public class DataTest {
	
	public static void test(RepositoryImp r) {
		
		Book book1 = new Book(Date.valueOf((LocalDate.now())), "Blablabla", "Cuarta", "1", "Alvaro");
		Book book2 = new Book(Date.valueOf((LocalDate.now())), "Dfdskglk", "Primera", "2", "Pepito");
		Book book3 = new Book(Date.valueOf((LocalDate.now())), "Zzxcvcxv", "Seguna", "3", "Antonio");
		Book book4 = new Book(Date.valueOf((LocalDate.now())), "Hjopkgfl", "Cuarta", "4", "David");
		Book book5 = new Book(Date.valueOf((LocalDate.now())), "Amnbmb", "Sexta", "5", "Manolo");
		
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
