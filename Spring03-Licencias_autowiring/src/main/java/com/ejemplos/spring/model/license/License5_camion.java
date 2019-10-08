package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("camion")
public class License5_camion implements License5 {

	@Override
	public void getLicencia() {
		System.out.println("Tengo licencia para camiones");
		
	}

}
