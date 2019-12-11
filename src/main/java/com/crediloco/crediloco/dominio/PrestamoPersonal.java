package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

// clase que "hereda" atributos y métodos de Prestamo
public class PrestamoPersonal extends Prestamo {

    private String situacionVeraz;

    public PrestamoPersonal(Banco banco, BigDecimal monto, Integer cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }

    public String getSituacionVeraz() {
        return situacionVeraz;
    }

    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }

    public String toString() {
        return "Situacion veraz: " + this.situacionVeraz;
    }

}
