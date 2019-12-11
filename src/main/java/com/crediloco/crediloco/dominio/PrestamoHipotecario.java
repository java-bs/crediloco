package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

// clase que "hereda" atributos y métodos de Prestamo
public class PrestamoHipotecario extends Prestamo {

    private Garantia garantia;

    public PrestamoHipotecario(Banco banco, BigDecimal monto, Integer cantidadCuotas) {
        super(banco, monto, cantidadCuotas);
    }

    public Garantia getGarantia() {
        return garantia;
    }

    public void setGarantia(Garantia garantia) {
        this.garantia = garantia;
    }

}
