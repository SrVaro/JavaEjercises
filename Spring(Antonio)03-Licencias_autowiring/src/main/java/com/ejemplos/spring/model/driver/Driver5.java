package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License5;

@Component
public class Driver5 {
	
	@Autowired
	//@Qualifier("camion")
	// @Qualifier es util cuando se pueden emparejar varios beans
	//    si hay ambiguedad
	
	// Si no se hubiera colocado al lanzar en el main
	//   		Driver5 driver5 = (Driver5) context.getBean("driver5");
	// cuando crea el objeto driver5 no sabria cual de las dos licencias podr�a utilizar
	//   y daria una excepcion
	private License5 license;
	
	

	public void setLicense(License5 license) {
		this.license = license;
	}

	public void tipoDeLicencia(){
		license.getLicencia();
	}
	
	public String toString() {
		return "Driver5 + " +  "@Qualifier para elegir licencia. ";
	}
	
}
