package Modelo;

public class ElementoTablaPeriodica {

	private String nombre;
	private String simbolo;
	private int numero;

	private static int numeroInstancias = 0;

	public ElementoTablaPeriodica(String nombre, String simbolo, int numero) {
		super();
		this.nombre = nombre;
		this.simbolo = simbolo;
		this.numero = numero;

		numeroInstancias++;
	}

	public static int numeroDeElementos() {
		return numeroInstancias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
