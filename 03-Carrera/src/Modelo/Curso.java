package Modelo;

public class Curso {

	private Asignatura asig1;
	private Asignatura asig2;

	private String nombre;

	public Curso(Asignatura asig1, Asignatura asig2, String nombre) {
		super();
		this.asig1 = asig1;
		this.asig2 = asig2;
		this.nombre = nombre;

		this.asig1.setCurso(this);
		this.asig2.setCurso(this);
	}

	@Override
	public String toString() {
		return "Curso [asig1=" + asig1.toString() + ", asig2=" + asig2.toString() + "]";
	}

	public Asignatura getAsig1() {
		return asig1;
	}

	public void setAsig1(Asignatura asig1) {
		this.asig1 = asig1;
	}

	public Asignatura getAsig2() {
		return asig2;
	}

	public void setAsig2(Asignatura asig2) {
		this.asig2 = asig2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
