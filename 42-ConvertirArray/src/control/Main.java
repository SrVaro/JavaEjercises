package control;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int[] array = new int[3];
		
		array[0] = 5;
		array[1] = 2;
		array[2] = 6;
		
		ArrayToArrayList(array);
		
		String[] arrayS = new String[3];
		
		arrayS[0] = "sdklja";
		arrayS[1] = "d";
		arrayS[2] = "hcv";
		
		ArrayToArrayListGeneric(arrayS);
		

	}

	public static void ArrayToArrayList(int[] array) {

		ArrayList<Integer> newArrayList = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			newArrayList.add(array[i]);
		}
		
		System.out.println(newArrayList.toString());

	}

	public static <E> void ArrayToArrayListGeneric(E[] array) {

		ArrayList<E> newArrayList = new ArrayList<>();

		for (int i = 0; i < array.length; i++) {
			newArrayList.add(array[i]);
		}
		
		System.out.println(newArrayList.toString());

	}

}
