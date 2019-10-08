package gui;

public class UI {

	public static void showMenu() {
		separationMsg();
		System.out.println("¿Que quieres hacer?\n\n" + "1)Listado de canciones\n" + "2)Canciones (solo musica)\n"
				+ "3)Canciones (solo videos)\n" + "4)Play (Al azar)\n"
				+ "5)Valoracion media de mis canciones\n" + "6)Play (Solo canciones de valoracion 5)");
		separationMsg();
	}

	public static void waitMsg() {
		separationMsg();
		System.out.println("Escribe cualquier caracter para continuar");
		separationMsg();
	}
	
	public static void playMP3Msg() {
		System.out.println("Reproduciendo cancion");
	}
	
	public static void playMP4Msg() {
		System.out.println("Reproduciendo videoclip");
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
