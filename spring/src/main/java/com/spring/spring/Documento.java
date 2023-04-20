package com.spring.spring;

public class Documento implements GestionDocumentos{

    @Override
    public String getDocumento() {
        // TODO Auto-generated method stub
        /*7.B.2 el setter se crea automaticamente escribiendo set en la clase*/
    public void setDocumentoNuevo(GestionDocumentos documentoNuevo) {
        this.documentoNuevo = documentoNuevo;
    }

        return "Presentación del Documenbto";
    }
  

}
