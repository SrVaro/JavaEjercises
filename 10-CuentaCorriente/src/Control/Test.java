package Control;

import Modelo.Cliente;
import Modelo.CuentaCorriente;

public class Test {

	public static void testCC() {
		Cliente c1 = new Cliente("Alvaro");
		Cliente c2 = new Cliente("Pedro");

		CuentaCorriente cc1 = new CuentaCorriente(c1);

		cc1.ingresar(cc1.getIdentificador(), c2, 100);
		// cc1.ingresar(432, c2, 500);

		System.out.println(cc1.interesesGenerados());
	}
}
