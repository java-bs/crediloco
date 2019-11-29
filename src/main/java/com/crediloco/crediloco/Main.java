package com.crediloco.crediloco;

import com.crediloco.crediloco.dominio.Cliente;
import com.crediloco.crediloco.dominio.Prestamo;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] parametros) {
        System.out.println("Hola mundo!");
        
        Prestamo miPrimerPrestamo = new Prestamo();
        miPrimerPrestamo.setCantidadCuotas(6);
        
        BigDecimal elMonto = new BigDecimal("1550.25");
        //elMonto.setScale(5);
        //elMonto = new BigDecimal(4435.564);
        miPrimerPrestamo.setMonto(elMonto);
        
        Prestamo miSegundoPrestamo = new Prestamo();
        miSegundoPrestamo.setCantidadCuotas(12);
        miPrimerPrestamo.setMonto(elMonto);
        
        
        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente("José");
        
        Prestamo[] prestamosDelCliente = {miPrimerPrestamo, miSegundoPrestamo};
        //asignacion de prestamos al cliente
        cliente.setPrestamos(prestamosDelCliente);
        
        System.out.println("Prestamo creado: " + miPrimerPrestamo);
        System.out.println("Cliente creado: " + cliente);
    }
    
}