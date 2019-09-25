package Modelo;

public class Asignatura {

	private String nombre;

	public Asignatura(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
