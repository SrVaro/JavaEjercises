package model;

public enum IceCream {

	MINI(2),

	SUPER(3),

	MEGA(5);

	private final int balls;

	private IceCream(int balls) {
		this.balls = balls;
	}

	public int getBalls() {
		return balls;
	}

}
