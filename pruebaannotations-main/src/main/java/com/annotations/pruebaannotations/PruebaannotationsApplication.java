package com.annotations.pruebaannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PruebaannotationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaannotationsApplication.class, args);
		// Indicamos la ruta del contexto XML
		// ClassPathXmlApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");

		// 8.8 @Configuration Indicamos la ruta de nuestro archivo
		// ConfigurationFile.java usando Annotations de Spring
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);

		// 8.2 Construimos un bean del contenedor con el nombre de la eqitueta
		// "EmpleadoDirector"
		// Empleados Maria = context.getBean("EmpleadoDirector", Empleados.class);

		// 8.3 Construimos un bean del contenedor con autowired (se debe poner el nombre
		// en minúsculas "empleadoDirector")
		Empleados Maria = context.getBean("empleadoDirector", Empleados.class);

		// usamos el bean
		System.out.println(Maria.getDocumento());
		System.out.println(Maria.getResponsabilidades());

		// 8.5 @scope
		Empleados Ana = context.getBean("empleadoDirector", Empleados.class);
		System.out.println("A continuación verás la dirección de memoria de Ana");
		System.out.println(Ana);

		Empleados Manolo = context.getBean("empleadoDirector", Empleados.class);
		System.out.println("A continuación verás la dirección de memoria de Manolo");
		System.out.println(Manolo);

		if (Ana == Manolo) {
			System.out.println("Es el mismo objeto");
		} else {
			System.out.println("Son distintos");
		}

		// 8.9Beans
		// añade un sout que incluyauna linea en blanco delante y otra después
		System.out.println("\n 8.9 Beans \n");

		Empleados Patricia = context.getBean("empleadoDirector", Empleados.class);
		System.out.println(Patricia.getDocumento());
		System.out.println(Patricia.getResponsabilidades());

		Empleados Juan = context.getBean("empleadoStuff", Empleados.class);
		System.out.println(Juan.getDocumento());
		System.out.println(Juan.getResponsabilidades());

		// 8.10 @PropertySource y @Value para leer propiedades
		//System.out.println(Juan.getEmail()); Juan no podría acceder a la propiedad email porque no es un EmpleadoStuff
		EmpleadoStuff Juan2 = context.getBean("empleadoStuff", EmpleadoStuff.class);
		System.out.println("8.10 Email de Juan2 EmpleadoStuff invocado con etiqueta @Value: "+Juan2.getEmail());
		System.out.println("8.10 Empresa de Juan2 EmpleadoStuff invocado con etiqueta @Value: "+Juan2.getNombreEmpresa());

		//@8.10PropertySource y @Value para leer propiedades en EmpleadoDirector
		EmpleadoDirector Maria2 = context.getBean("empleadoDirector", EmpleadoDirector.class);
		System.out.println("8.10 Email de Maria2 EmpleadoDirector invocado con etiqueta @Value: "+Maria2.getEmail());
		System.out.println("8.10 Empresa de Maria2 EmpleadoDirector invocado con etiqueta @Value: "+Maria2.getNombreEmpresa());

		// cerramos el contexto XML
		context.close();

	}

}
