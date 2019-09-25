package Control;

import Modelo.Asignatura;
import Modelo.Carrera;
import Modelo.Curso;

public class Test {

	public static void testCarrera() {
		Asignatura a1 = new Asignatura("Mates", 0);

		Asignatura a2 = new Asignatura("Fisica", 1);

		Asignatura a3 = new Asignatura("Lengua", 2);

		Curso c1 = new Curso(a1, a2, "1B");

		Curso c2 = new Curso(a3, a2, "3C");

		Carrera carr = new Carrera(c1, c2);

		System.out.println(carr);
	}
}
