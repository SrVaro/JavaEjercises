package com.ejemplos.spring.model.license;

import org.springframework.stereotype.Component;

@Component("coche")
public class License5_coche implements License5 {

	@Override
	public void getLicencia() {
		System.out.println("Tengo licencia para coches");
		
	}

}
