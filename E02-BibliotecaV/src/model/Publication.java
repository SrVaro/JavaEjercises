package model;

import java.util.Date;

public abstract class Publication {

	private Date publishDate;
	protected PublicationStrategy loanable;

	private boolean borrowed;

	private String name;

	public Publication(Date publishDate, String name) {
		super();
		this.publishDate = publishDate;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publication [publishDate=" + publishDate + ", borrowed=" + borrowed + ", name=" + name + "]";
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBorrowed() {
		return borrowed;
	}

	public void setBorrowed(boolean borrowed) {
		this.borrowed = borrowed;
	}

}
