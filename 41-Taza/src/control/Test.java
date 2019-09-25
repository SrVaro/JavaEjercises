package control;

import data.Ceramica;
import data.Taza;

public class Test {

	public static void testTaza() {
		
		Ceramica c = new Ceramica();

		Taza<Ceramica> c1 = new Taza<>(c);
		
		System.out.println(c1.getMaterial());

	}

}
