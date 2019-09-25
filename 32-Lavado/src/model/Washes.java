package model;

public enum Washes {

	BASIC(3),

	REGULAR(5),

	SUPER(7);

	private final int type;

	private Washes(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}
