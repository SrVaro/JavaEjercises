package control;

public class Main {

	public static void main(String[] args) {

		String[] array = new String[5];

		array[0] = "c";
		array[1] = "d";
		array[2] = "z";
		array[3] = "a";
		array[4] = "b";

		printArray(array);

		System.out.print("-------------------\n");

		sortArray(array);
	}

	public static String[] sortArray(String[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			for (int j = 1; j < array.length - i; j++) {

				String aux = "";

				if ((int) array[j - 1].charAt(0) > (int) array[j].charAt(0)) {
					aux = array[j - 1];
					array[j - 1] = array[j];
					array[j] = aux;
				}
			}

			printArray(array);
			System.out.println("-------------");

		}
		return array;
	}

	public static void printArray(String[] array) {

		String repArray = "";

		for (int i = 0; i < array.length; i++) {
			repArray += array[i] + ", ";
			System.out.println((int) array[i].charAt(0));
		}

		System.out.println(repArray);
	}

}
