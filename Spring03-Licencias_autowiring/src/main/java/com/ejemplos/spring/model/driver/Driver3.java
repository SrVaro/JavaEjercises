package com.ejemplos.spring.model.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ejemplos.spring.model.license.License3;

@Component("driver3")
public class Driver3 {

	private License3 license;
	
	
	@Autowired
	public Driver3(License3 license) {
		this.license = license;
	}

	@Override
	public String toString() {
		return "Driver3 [license3=" + license + "]" + " @autowired por constructores";
	}
	
	
}
