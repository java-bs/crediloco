package com.crediloco.crediloco.dominio;

import static com.crediloco.crediloco.dominio.ImprimirDatos.COLORDEFAULT;
import java.math.BigDecimal;
import java.time.LocalDate;

//clase abstracta, no instanciable
public abstract class Prestamo implements ImprimirDatos {

    private Banco banco;
    private BigDecimal monto;
    private Integer cantidadCuotas;
    private BigDecimal tasa;
    private DocumentoDigital[] documentoDigitales;
    private String estado;
    private LocalDate fechaAcreditacion;
    private LocalDate fechaAsignacion;

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
        this.estado = "ACTIVO";
    }

    //método que sobreescribe el toString() default
    public String toString() {
        return "Monto: " + this.monto
                + " // cantidad de cuotas: " + this.cantidadCuotas;
    }

    // Implementación del método imprimirDatos() declarado en la interfaz ImprimirDatos
    @Override
    public void imprimirDatos() {
        System.out.println(this.getClass().getSimpleName()
                + ": monto del préstamo = " + monto
                + ", cantidad de cuotas = " + cantidadCuotas
                + ", fecha de acreditacion = " + fechaAcreditacion
                + ". Color de impresión: " + COLORDEFAULT);
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

    //solo accesible desde esta clase
    private void setCantidadCuotas(Integer cantidadCuotas) {
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

    public LocalDate getFechaAcreditacion() {
        return fechaAcreditacion;
    }

    public void setFechaAcreditacion(LocalDate fechaAcreditacion) {
        this.fechaAcreditacion = fechaAcreditacion;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean cancelarCuotas(int cantidadACancelar) {
        int diferenciaDeCuotas = cantidadCuotas - cantidadACancelar;
        // Verifico que sea posible cancelar dicha cantidad de cuotas
        if (diferenciaDeCuotas >= 0) {
            // Setteo la cantidadDeCuotas a la cantidad de cuotas restantes
            setCantidadCuotas(diferenciaDeCuotas);
            return true;
        } else {
            cancelarCuotas(cantidadACancelar - 1); //recursivo!!
        }
        return false;
    }

    // Función para cancelar préstamos
    public void cancelarPrestamo() {
        this.estado = "CANCELADO";
    }

}
