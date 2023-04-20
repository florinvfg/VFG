package com.annotations.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

//en la siguiente clase tengo 2 getter de email y nombreEmpresa que quiero que cojan los correspondientes valores del archivo datosEmpresa.properties usando la annotation @Value del Framework Spring, pero al invocarlos desde el programa principal me devuelve el texto "null" en lugar de los valores de los campos asignados en el archivo de configuración
public class EmpleadoStuff implements Empleados {


    //8.10 Inyectar valores email y nombreEmpresa
    @Value("${email}")
    private String email;

    @Value("${nombreEmpresa}")
    private String nombreEmpresa;

    public String getEmail() {
        return email;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public EmpleadoStuff(CrearDocumentos informeDiarioStuff) {
    }

    @Override
    public String getResponsabilidades() {
      return "Las responsabilidades de un empelado Stuff dependen de su sector";}

    @Override
    public String getDocumento() {
    return "Documento STUFF específico para Beans 8.9";}


    @Qualifier("informeDiarioStuff")
    private CrearDocumentos informeDiarioStuff;

    
}
