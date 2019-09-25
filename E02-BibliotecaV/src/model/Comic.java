package model;

import java.util.Date;

public class Comic extends Publication {

	private int number;
	private int frecuency;

	public Comic(Date publishDate, String name, int number, int frecuency) {
		super(publishDate, name);
		this.number = number;
		this.frecuency = frecuency;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFrecuency() {
		return frecuency;
	}

	public void setFrecuency(int frecuency) {
		this.frecuency = frecuency;
	}

}
