package Modelo;

public class Examen {

	private String nombre;
	private Asignatura asignatura;
	private Alumno alumno;
	private float nota;

	public Examen(String nombre, Asignatura asignatura, Alumno alumno, float nota) {
		super();
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.alumno = alumno;
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Examen [nombre=" + nombre + ", asignatura=" + asignatura + ", alumno=" + alumno + ", nota=" + nota
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

}
