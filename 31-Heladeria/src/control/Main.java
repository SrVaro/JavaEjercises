package control;

import model.IceCream;

public class Main {

	public static void main(String[] args) {
		System.out.println("Tipos de helados:");
		
		System.out.println(IceCream.MINI + " con " + IceCream.MINI.getBalls() + " bolas");
		System.out.println(IceCream.SUPER + " con " + IceCream.SUPER.getBalls() + " bolas");
		System.out.println(IceCream.MEGA + " con " + IceCream.MEGA.getBalls() + " bolas");

	}

}
