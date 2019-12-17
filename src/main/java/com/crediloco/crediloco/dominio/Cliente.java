package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;

public class Cliente implements ImprimirDatos {

    private DocumentoDigital dni;
    private Domicilio domicilio;
    private BigDecimal ingresos;
    private Prestamo[] prestamos;
    private String nombre;

    //constructor que recibe y asigna el nombre durante la creación del objeto
    public Cliente(String nombreNuevo) {
        System.out.println("Creacion de cliente " + nombreNuevo);
        this.nombre = nombreNuevo;
    }

    public String toString() {
        return "Cliente{" + "dni=" + dni + ", domicilio=" + domicilio + ", ingresos=" + ingresos + ", prestamos=" + prestamos + ", nombre=" + nombre + '}';
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Impresión: "
                + "DNI = " + dni + ", ingresos = " + ingresos
                + ". Color de impresión: " + COLORSECUNDARIO);
        for (Prestamo prestamo : this.prestamos) {
            prestamo.imprimirDatos();
        }
    }

    public DocumentoDigital getDni() {
        return dni;
    }

    public void setDni(DocumentoDigital dni) {
        this.dni = dni;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public BigDecimal getIngresos() {
        return ingresos;
    }

    public void setIngresos(BigDecimal ingresos) {
        this.ingresos = ingresos;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }

}
