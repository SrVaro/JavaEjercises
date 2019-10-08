package com.ejemplos.spring.control;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ejemplos.spring.config.AppConfig;
import com.ejemplos.spring.model.driver.Driver1;
import com.ejemplos.spring.model.driver.Driver2;
import com.ejemplos.spring.model.driver.Driver3;
import com.ejemplos.spring.model.driver.Driver4;
import com.ejemplos.spring.model.driver.Driver5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		// En este caso no cargamos configuracion XML realmente. Se indicarán anotaciones
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		// Setter Autowiring
		Driver1 driver1 = (Driver1) context.getBean("driver1");
		System.out.println("Driver1 Details : " + driver1);
		
		// ByType Autowiring
		Driver2 driver2 = (Driver2) context.getBean("driver2");
		System.out.println("Driver2 Details : " + driver2);			
		
		// By Constructor Autowiring
		Driver3 driver3 = (Driver3) context.getBean("driver3");
		System.out.println("Driver3 Details : " + driver3);		
		
		// Byname Autowiring-Resource
		Driver4 driver4 = (Driver4) context.getBean("driver4");
		System.out.println("Driver4 Details : " + driver4);		
		
		// Qualifier	
		Driver5 driver5 = (Driver5) context.getBean("driver5");
		System.out.print("Driver5 Details : " + driver5);			
		driver5.tipoDeLicencia();
		
		 ((ConfigurableApplicationContext)context).close();
    }
}
