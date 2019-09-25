package data;

public class Taza<T> {

	private T material;

	public Taza(T material) {
		super();
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
}
