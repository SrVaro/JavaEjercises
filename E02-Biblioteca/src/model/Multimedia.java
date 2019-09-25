package model;

public abstract class Multimedia {

	private String tittle;
	private Format format;
	private int duration;
	protected PublicationStrategy loanable;

	public Multimedia(String tittle, Format format, int duration) {
		super();
		this.tittle = tittle;
		this.format = format;
		this.duration = duration;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
