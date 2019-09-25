package Modelo;

public class Asignatura {

	private String nombre;
	private int codigo;
	private Curso curso;

	public Asignatura(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Asignatura [nombre=" + nombre + ", codigo=" + codigo + ", curso=" + curso.getNombre() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
