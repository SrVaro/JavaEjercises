package com.ejemplos.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.dao.EmpleadoDao;
import com.ejemplos.spring.model.Empleado;
import com.ejemplos.spring.util.Simulaciones;

//Incluye las capas de servicios y logica
@Service("employeeService")
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao employeeDao;

	public EmpleadoServiceImpl() {

	}

	public EmpleadoServiceImpl(EmpleadoDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	public void saveEmployee(Empleado employee) {
		employee.setFechaAlta(Simulaciones.fechaAleatoria());
		employeeDao.saveEmployee(employee);
	}

}
