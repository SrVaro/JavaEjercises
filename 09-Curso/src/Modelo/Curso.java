package Modelo;

public class Curso {

	private String nombre;

	private Alumno al1, al2;

	private Asignatura as1;

	public Curso(String nombre, Alumno al1, Alumno al2, Asignatura as1) {
		super();
		this.nombre = nombre;
		this.al1 = al1;
		this.al2 = al2;
		this.as1 = as1;
	}

	@Override
	public String toString() {
		return "Curso [nombre=" + nombre + ", al1=" + al1 + ", al2=" + al2 + ", as1=" + as1 + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alumno getAl1() {
		return al1;
	}

	public void setAl1(Alumno al1) {
		this.al1 = al1;
	}

	public Alumno getAl2() {
		return al2;
	}

	public void setAl2(Alumno al2) {
		this.al2 = al2;
	}

	public Asignatura getAs1() {
		return as1;
	}

	public void setAs1(Asignatura as1) {
		this.as1 = as1;
	}
}