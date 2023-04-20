package com.spring.spring;

public interface Empleados {

    public abstract String getResponsabilidades();
/* 7.2 Creamos el campo de nuestra interfaz GestionDocumento */
private GestionDocumentos documentoNuevo;


/* 7.2 Creamos el constructor que inyectará la dependencia */
public EmpleadoDirector(GestionDocumentos documentoNuevo) {
    this.documentoNuevo = documentoNuevo;
}

/*7.2 en el siguiente método añadimos el campo de clase documentoNuevo con el método de la Interfaz GestionDocumentos*/
public String getDocumento() {
   return "Informe del DIRECTOR: " + documentoNuevo.getDocumento();
}

   
}
