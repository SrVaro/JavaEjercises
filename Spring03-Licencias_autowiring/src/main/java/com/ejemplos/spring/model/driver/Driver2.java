package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License2;

@Component("driver2")
public class Driver2 {
	
	@Autowired
	private License2 license;
	
	public void setLicense(License2 license) {
		this.license = license;
	}

	public License2 getLicense() {
		return license;
	}

	@Override
	public String toString() {
		return "Driver2 [license2=" + license + "]" + " @autowired por atributos/propiedades";
	}
	
	
}
