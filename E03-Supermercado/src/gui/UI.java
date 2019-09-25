package gui;

public class UI {

	public static void showMenu() {
		separationMsg();
		System.out.println("¿Que quieres hacer?\n\n" + "1)Añadir un libro a la biblioteca\n" + "2)Añadir un disco\n"
				+ "3)Numero de libros prestados\n" + "4)Publicaciones anteriores a (fecha a elegir)\n"
				+ "5)Listado de publicaciones y discos\n"
				+ "6)Listado de publicaciones y discos diferenciando prestados\n"
				+ "7)Exportar datos a un archivo de texto");
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
