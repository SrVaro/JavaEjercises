package model;

import java.util.Date;

public class Magazine extends Publication {

	private int number;

	private String coleccion;

	public Magazine(Date publishDate, String name, int number, String coleccion) {
		super(publishDate, name);
		this.number = number;
		this.coleccion = coleccion;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColeccion() {
		return coleccion;
	}

	public void setColeccion(String coleccion) {
		this.coleccion = coleccion;
	}

}
