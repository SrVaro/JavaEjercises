package model;

import java.util.Date;

public class Book extends Publication {

	private String edition;
	private String ISBN;
	private String author;

	public Book(Date publishDate, String name, String edition, String ISBN, String author) {
		super(publishDate, name);
		this.edition = edition;
		this.ISBN = ISBN;
		this.author = author;

		loanable = new LoanablePublicationStrategy();
	}

	@Override
	public String toString() {
		return "Book [edition=" + edition + ", ISBN=" + ISBN + ", author=" + author + ", toString()=" + super.toString()
				+ "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

}
