package Modelo;

public class Carrera {

	private Curso curso1;
	private Curso curso2;

	public Carrera(Curso curso1, Curso curso2) {
		super();
		this.curso1 = curso1;
		this.curso2 = curso2;
	}

	@Override
	public String toString() {
		return "Carrera [curso1=" + curso1.toString() + ", curso2=" + curso2.toString() + "]";
	}

	public Curso getCurso1() {
		return curso1;
	}

	public void setCurso1(Curso curso1) {
		this.curso1 = curso1;
	}

	public Curso getCurso2() {
		return curso2;
	}

	public void setCurso2(Curso curso2) {
		this.curso2 = curso2;
	}
}
