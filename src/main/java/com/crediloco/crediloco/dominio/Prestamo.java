package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

//clase abstracta, no instanciable
public abstract class Prestamo {

    private Banco banco;
    private BigDecimal monto;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;

    // Constructor default
    
    //public Prestamo() {
    //}
    
    public Prestamo(
            Banco banco,
            BigDecimal monto,
            Integer cantidadCuotas) {
        this.banco = banco;
        this.monto = monto;
        this.cantidadCuotas = cantidadCuotas;
    }

    //método que sobreescribe el toString() default
    public String toString() {
        return "Monto: " + this.monto
                + " // cantidad de cuotas: " + this.cantidadCuotas;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public Banco getBanco() {
        return banco;
    }

    //Para que no se pueda actualizar monto
    //private void setMonto(BigDecimal monto) {
    //    this.monto = monto;
    //}

    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    //public void setCantidadCuotas(Integer cantidadCuotas) {
    //    this.cantidadCuotas = cantidadCuotas;
    //}

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
