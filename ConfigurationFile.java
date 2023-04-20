package com.annotations.pruebaannotations;

import org.springframework.context.annotation.Bean;
//8.8 @Configuration - Indicamos la ruta de nuestro archivo ConfigurationFile.java usando Annotations de Spring
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.annotations.pruebaannotations")
@PropertySource("datosEmpresa.properties")//8.10 añadir archivo propiedades me devuelve el error: Caused by: java.io.FileNotFoundException: class path resource [datosEmpresa.propierties] cannot be opened because it does not exist
public class ConfigurationFile {

    //8.9 definimos bean para el informe diario de EmpleadoStuff
    @Bean
    public CrearDocumentos informePersonalizadoStuff() {
        return new InformeDiarioStuff();
    }

    public CrearDocumentos informePeriodicoMensual() {
        return new InformePeriodicoMensual();
    }

    //8.9 definimos bean para EmpleadoStuff e inyectar dependencias
    @Bean
    public Empleados empleadoStuff() {
        EmpleadoStuff empleadoStuff = new EmpleadoStuff(informePersonalizadoStuff());
        return empleadoStuff;
    }

}
