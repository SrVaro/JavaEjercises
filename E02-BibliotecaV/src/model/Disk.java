package model;

public class Disk extends Multimedia {

	public Disk(String tittle, Format format, int duration) {
		super(tittle, format, duration);

		loanable = new LoanablePublicationStrategy();

	}

}
