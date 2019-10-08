package com.ejemplos.spring.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;

import com.ejemplos.spring.configuration.AppConfig;
import com.ejemplos.spring.model.Empleado;
import com.ejemplos.spring.service.EmpleadoService;

@Controller("employeeControl")
public class ControlEmpleados {

	//SI comenta @autowired tb funciona, porque realmente estoy creando un Bean , no un Component
	@Autowired
	private EmpleadoService empService;

	public void prueba() {
		// Le indico donde se encuentra la configuracion
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		empService = (EmpleadoService) context.getBean("employeeService");

		// Prueba: Registramos el nuevo empleado
		Empleado employee = new Empleado("Antonio Santos");
		empService.saveEmployee(employee);

		context.close();
	}

}
