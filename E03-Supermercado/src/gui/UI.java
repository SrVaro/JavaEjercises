package gui;

public class UI {

	public static void showMenu() {
		separationMsg();
		System.out.println("¿Que quieres hacer?\n\n" + "1)Dar de alta un producto\n" + "2)Eliminar un producto\n"
				+ "3)Listar los productos existentes\n" + "4)Existencias de un producto\n"
				+ "5)Listar los productos con menos de 5 unidades\n");
		separationMsg();
	}

	public static void waitMsg() {
		separationMsg();
		System.out.println("Escribe cualquier caracter para continuar");
		separationMsg();
	}

	public static void dateMsg() {
		System.out.println("Escribe la fecha de publicacion del libro: (yyyy-mm-dd)");
	}

	public static void dataMsg(String data, String object) {
		System.out.println("Escribe el " + data + " del " + object + ":");
	}

	public static void separationMsg() {
		System.out.println("----------------------------------------------------------------");
	}

	public static void wrongData() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("WARNING");
		System.out.println("Introduce datos validos");
		System.out.println("Vuelve a introducir los datos");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
