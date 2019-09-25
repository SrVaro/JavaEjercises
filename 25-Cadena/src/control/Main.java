package control;

public class Main {

	public static void main(String[] args) {
		String[] array = new String[5];

		array[0] = "Alvaro";
		array[1] = "as";
		array[2] = "Alvfgfharo";
		array[3] = "Alvacxzvczvzvro";
		array[4] = "Alveers";

		sizeLiterals(array);
	}

	public static int[] sizeLiterals(String[] array) {

		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i].length();
		}

		return newArray;
	}

}
