package Control;

import Modelo.Departamento;
import Modelo.Director;
import Modelo.Empleado;

public class Test {
	public static void testEmpleados() {
		Empleado e1 = new Empleado("Alvaro", "Luque", "Cordoba", "8538978938A", "blabla@correo.com");

		Empleado e2 = new Empleado("Jefe", "Boss", "Cordoba", "8538978938A", "blabla@correo.com");

		Departamento dep1 = new Departamento("Ventas", "Madrid", "849948723");

		e1.setDepartamento(dep1);
		e2.setDepartamento(dep1);

		Director dir = new Director(e1, dep1);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(dep1);
		System.out.println(dir);
	}
}
