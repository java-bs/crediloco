package com.crediloco.crediloco.dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        
        List<Prestamo> listaPrestamos = Arrays.asList(prestamos);
        List<Prestamo> listaFiltrada = listaPrestamos.stream()
                .filter(pres -> pres.getFechaAcreditacion() != null)
                .filter(i -> i.getFechaAcreditacion().isBefore(LocalDate.now()))
                .collect(Collectors.toList());
        
        listaFiltrada
                .sort(Comparator.comparing(Prestamo::getFechaAcreditacion));
        
        for (Prestamo prestamo : listaFiltrada) {
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
