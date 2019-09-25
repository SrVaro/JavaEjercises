package Modelo;

public class Profesor {

	private String nombre;
	private Asignatura asignatura;
	private Curso curso;

	public Profesor(String nombre, Asignatura as1) {
		super();
		this.nombre = nombre;
		this.asignatura = as1;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", Asignatura=" + asignatura + ", curso=" + curso + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso c1) {
		this.curso = c1;
	}

}
