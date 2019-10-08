package com.ejemplos.spring.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// Indico la carpeta donde se encuentra
//@ComponentScan(basePackages = {"com.ejemplos.spring.service"})
@ComponentScan(basePackages = "com.ejemplos.spring")
public class AppConfig {

}
