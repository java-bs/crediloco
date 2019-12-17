package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

// clase que "hereda" atributos y métodos de Prestamo
public class PrestamoHipotecario extends Prestamo {

    private String garantia;

    public PrestamoHipotecario(Banco banco, BigDecimal monto, Integer cantidadCuotas, String garantia) {
        super(banco, monto, cantidadCuotas);
        this.garantia = garantia;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "PrestamoHipotecario{" + " Garantia: " + garantia + '}';
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Impresión: HIPOTECARIO");
    }

}
