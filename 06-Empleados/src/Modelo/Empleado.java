package Modelo;

public class Empleado {

	private String nombre;
	private String apellido;
	private String dirección;
	private String DNI;
	private String mail;

	private Departamento departamento;

	public Empleado(String nombre, String apellido, String dirección, String DNI, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dirección = dirección;
		this.DNI = DNI;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dirección=" + dirección + ", DNI=" + DNI
				+ ", mail=" + mail + ", departamento=" + departamento.toString() + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
