package com.crediloco.crediloco.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Domicilio {

    @Id
    private Long id;
    private String calle;
    private Integer numero;
    private String piso;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

}
