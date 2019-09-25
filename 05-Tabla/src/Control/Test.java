package Control;

import Modelo.ElementoTablaPeriodica;

public class Test {

	@SuppressWarnings("unused")
	public static void testElementos() {
		ElementoTablaPeriodica e1 = new ElementoTablaPeriodica("Boro", "BR", 43);
		ElementoTablaPeriodica e2 = new ElementoTablaPeriodica("Boro", "BR", 43);
		ElementoTablaPeriodica e3 = new ElementoTablaPeriodica("Boro", "BR", 43);
		ElementoTablaPeriodica e4 = new ElementoTablaPeriodica("Boro", "BR", 43);
		ElementoTablaPeriodica e5 = new ElementoTablaPeriodica("Boro", "BR", 43);

		System.out.println(ElementoTablaPeriodica.numeroDeElementos());
	}

}
