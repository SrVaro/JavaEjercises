package Control;

import Modelo.Alumno;
import Modelo.Asignatura;
import Modelo.Curso;
import Modelo.Examen;
import Modelo.Profesor;

public class Test {

	public static void testCurso() {
		Alumno al1 = new Alumno("Alvaro");
		Alumno al2 = new Alumno("Dabe");

		Asignatura as1 = new Asignatura("Fisica");

		Profesor p1 = new Profesor("Fesor", as1);

		Curso c1 = new Curso("1B", al1, al2, as1);

		Examen e1 = new Examen("Fisica 1", as1, al1, 8);

		p1.setCurso(c1);

		System.out.println(al1);
		System.out.println(al2);
		System.out.println(p1);
		System.out.println(as1);
		System.out.println(c1);
		System.out.println(e1);

	}

}
