package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

// clase que "hereda" atributos y métodos de Prestamo
public class PrestamoPersonal extends Prestamo {

    private String situacionVeraz;

    public PrestamoPersonal(Banco banco, BigDecimal monto, Integer cantidadCuotas, String situacionVeraz) {
        super(banco, monto, cantidadCuotas);
        this.situacionVeraz = situacionVeraz;
    }

    public String getSituacionVeraz() {
        return situacionVeraz;
    }

    public void setSituacionVeraz(String situacionVeraz) {
        this.situacionVeraz = situacionVeraz;
    }

    @Override
    public String toString() {
        return "PrestamoPersonal{" + "Situacion Veraz: " + situacionVeraz + '}';
    }

}
