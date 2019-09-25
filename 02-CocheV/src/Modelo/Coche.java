package Modelo;

public class Coche {

	private String modelo;

	private String color;

	private Boolean metalizada;

	private String matricula;

	private int tipo;

	private int anno;

	private int seguro;

	public Coche(String modelo, String color, Boolean metalizada, String matricula, int tipo, int anno, int seguro) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.metalizada = metalizada;
		this.matricula = matricula;
		this.tipo = tipo;
		this.anno = anno;
		this.seguro = seguro;
	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + ", metalizada=" + metalizada + ", matricula="
				+ matricula + ", tipo=" + tipo + ", anno=" + anno + ", seguro=" + seguro + "]";
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getMetalizada() {
		return metalizada;
	}

	public void setMetalizada(Boolean metalizada) {
		this.metalizada = metalizada;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public int getSeguro() {
		return seguro;
	}

	public void setSeguro(int seguro) {
		this.seguro = seguro;
	}
}
