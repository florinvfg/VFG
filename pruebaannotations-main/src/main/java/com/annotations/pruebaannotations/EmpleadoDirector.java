package com.annotations.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EmpleadoDirector implements Empleados {
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
    public EmpleadoDirector(CrearDocumentos informePeriodicoAnual) {
    }

    public String getResponsabilidades() {
        return "Dirije los departamentos y objetivos de la empresa";
    }

    /*
     * @Override
     * public String getDocumento() {
     * return "Documento Generado por el Director";
     * }
     */

    @Override
    public String getDocumento() {
        // return "Documento de Dirección específico para autowired 8.3";
        return "Documento de Dirección específico para Beans 8.9";
    }

    // 8.3 @autowired Constructor
    // private CrearDocumentoDirector documentoDirector;

    /*
     * @Autowired
     * public EmpleadoDirector(CrearDocumentoDirector documentoDirector) {
     * this.documentoDirector = documentoDirector;
     * }
     * 
     * //Si tenemos 2 constructores de la misma clase, necesitaremos detallar cual
     * es el Autowired
     * public EmpleadoDirector(){
     * 
     * }
     */

    /*
     * 8.4 Autowired metodos normales nos sirve para configurar la dependencia, lo
     * bueno que tiene es que autowired busca en todo el proyecto cualquier clase
     * que implemente la interfaz CrearDocumentos y en nuestro ejemplo la encontrará
     * en public class InformePeriodicoAnual implements CrearDocumentoDirector
     */
    /*
     * @Autowired
     * public void daIgual(CrearDocumentoDirector documentoDirector) {
     * this.documentoDirector = documentoDirector;
     * }
     */
    /*
     * 8.5 @Qualified cuando tenemos varios @Autowired Spring fallará, podemos
     * evitarlo especificando a cual queremos referirnos mediante la
     * etiqueta @Qualified y el id del objeto concreto
     */
   
    @Qualifier("informePeriodicoMensual")
    private CrearDocumentos documentoDirector;


    // 8.7 @PostConstruct y @PreDestroy
    /*@PostConstruct
    public void metodoPostConstruct() {
        System.out.println(
                "Ejecutando el método PostConstruct. Ejecuta tareas justo cuando se construye el bean, antes de que el bean esté disponible. Por ejemplo para activar servicios antes de que el bean esté listo.");
    }

    @PreDestroy
    public void metodoPreDestroy() {
        System.out.println(
                "Ejecutando el método PreDestroy. Ejecuta tareas después de que el bean haya sido utilizado y destruido. Por ejemplo para liberar recursos, cerrar conexiones, etc.");
     }
     */

  

}
