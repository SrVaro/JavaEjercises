package Modelo;

public class Departamento {

	private String nombre;
	private String ubicación;
	private String teléfono;

	public Departamento(String nombre, String ubicación, String teléfono) {
		super();
		this.nombre = nombre;
		this.ubicación = ubicación;
		this.teléfono = teléfono;
	}

	@Override
	public String toString() {
		return "Departamento [nombre=" + nombre + ", ubicación=" + ubicación + ", teléfono=" + teléfono + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicación() {
		return ubicación;
	}

	public void setUbicación(String ubicación) {
		this.ubicación = ubicación;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}
}
