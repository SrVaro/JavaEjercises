package Modelo;

public class Deportivo extends Coche {

	private boolean descapotable;

	public Deportivo(String modelo, String color, Boolean metalizada, String matricula, int tipo, int anno, int seguro,
			boolean descapotable) {
		super(modelo, color, metalizada, matricula, tipo, anno, seguro);

		this.descapotable = descapotable;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	@Override
	public String toString() {
		return "Deportivo [descapotable=" + descapotable + ", toString()=" + super.toString() + "]";
	}

}
