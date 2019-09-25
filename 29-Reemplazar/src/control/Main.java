package control;

public class Main {

	public static void main(String[] args) {

		System.out.println(replace("endeluego blalbla kadlfk .-. endeluego blabkla"));

	}

	public static String replace(String line) {

		return line.replaceAll("endeluego", "desde luego");

	}

}
