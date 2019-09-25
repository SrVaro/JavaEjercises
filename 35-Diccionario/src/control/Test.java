package control;

import model.Term;

public class Test {

	public static void testDictionary() {

		Term[] termList = new Term[5];

		Term t1 = new Term("diccionario",
				"Repertorio en forma de libro o en soporte electrónico"
						+ " en el que se recogen, según un orden determinado, las palabras o expresiones "
						+ "de una o más lenguas");
		Term t2 = new Term("blablabla", "adsf as dfas dfas dfasf");
		Term t3 = new Term("dgfdafasdg", "dasfasfa sdfones de una o más lenguas");
		Term t4 = new Term("jk", "asdfhjkñp");
		Term t5 = new Term("diccionario", "cv xvz zxvs");
		
		termList[0] = t1;
		termList[1] = t2;
		termList[2] = t3;
		termList[3] = t4;
		termList[4] = t5;
		
		Term.lettersAndWords(termList);
		

	}

}
