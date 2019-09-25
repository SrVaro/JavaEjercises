package control;

import java.util.ArrayList;

import utility.Writer;

public class Main {

	public static void main(String[] args) {

		numberSucesion();

	}

	public static void numberSucesion() {

		int n = Writer.readInt();

		ArrayList<Object> nList = new ArrayList<>();

		while (n != 0) {
			nList.add(n);

			n = Writer.readInt();
		}

		operations(nList);

	}

	public static void operations(ArrayList<Object> arrayList) {

		int suma = 0;
		int mayor = 0;
		int menor = (int) arrayList.get(0);

		for (int i = 0; i < arrayList.size(); i++) {
			int num = (int) arrayList.get(i);
			suma += num;
			if (num > mayor)
				mayor = num;
			if (num < menor)
				menor = num;
		}

		System.out.println("La media aritmetica: " + suma / arrayList.size());
		System.out.println("El mayor numero: " + mayor);
		System.out.println("El menor numero: " + menor);

	}

}
