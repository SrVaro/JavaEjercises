package Modelo;

public class Director {

	private Empleado empleado;
	private Departamento departamento;

	public Director(Empleado empleado, Departamento departamento) {
		super();
		this.empleado = empleado;
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Director [empleado=" + empleado + ", departamento=" + departamento + "]";
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
