package com.annotations.pruebaannotations;

import org.springframework.stereotype.Component;

@Component
public class InformePeriodicoAnual implements CrearDocumentos {

    @Override
    public String getDocumento() {
        return "Informe Periodico Anual Autowired 8.5";
    }


    
}
