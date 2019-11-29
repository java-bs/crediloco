package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

public class Prestamo {

    private BigDecimal monto;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;

    //método que sobreescribe el toString() default
    public String toString() {
        return "Monto: " + this.monto
                + " // cantidad de cuotas: " + this.cantidadCuotas;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public BigDecimal getTasa() {
        return tasa;
    }

    public void setTasa(BigDecimal tasa) {
        this.tasa = tasa;
    }

    public DocumentoDigital[] getDocumentoDigitales() {
        return documentoDigitales;
    }

    public void setDocumentoDigitales(DocumentoDigital[] documentoDigitales) {
        this.documentoDigitales = documentoDigitales;
    }

}
