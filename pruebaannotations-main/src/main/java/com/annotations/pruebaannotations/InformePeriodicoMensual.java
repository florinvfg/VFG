package com.annotations.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformePeriodicoMensual implements CrearDocumentos {

    @Override
    public String getDocumento() {
        return "Informe Periodico MENSUAL @QUALIFIER 8.5";
    }
    
}
