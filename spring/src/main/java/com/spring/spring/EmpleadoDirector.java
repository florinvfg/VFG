package com.spring.spring;

public class EpleadoDirector implements Empleados {

    @Override
    public String toString() {
        
  /*7.C.1 Creamos campos para la inyección de dependencias */
    private String emailDepartamental;
    private String empresa;
   
    public String getEmailDepartamental() {
        return emailDepartamental;
    }


    public void setEmailDepartamental(String email) {
        this.emailDepartamental = email;
    }


    public String getEmpresa() {
        return empresa;
    }


    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

        
        
        return "EpleadoDirector []";
    }
    
}
