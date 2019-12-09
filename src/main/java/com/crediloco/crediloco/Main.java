package com.crediloco.crediloco;

import com.crediloco.crediloco.dominio.Banco;
import com.crediloco.crediloco.dominio.Cliente;
import com.crediloco.crediloco.dominio.Prestamo;
import java.math.BigDecimal;

// java ->   Main.main();
public class Main {

    public static void main(String[] parametros) {
        System.out.println("Hola mundo!");

        Banco bancoSaenz = Banco.obtenerBanco();

        String codigoDelBanco = bancoSaenz.getCodigo();

        System.out.println(Banco.convertirAString());


        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new Prestamo(bancoSaenz, elMonto, 6);

        //elMonto = new BigDecimal(4435.564);
        //elMonto.setScale(5, RoundingMode.HALF_UP);
        //miPrimerPrestamo.setMonto(elMonto);
        Prestamo miSegundoPrestamo = new Prestamo(bancoSaenz, elMonto, 12);

        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente("José");

        Prestamo[] prestamosDelCliente
                = {miPrimerPrestamo, miSegundoPrestamo};
        //asignacion de prestamos al cliente
        cliente.setPrestamos(prestamosDelCliente);

        //cliente.getPrestamos()[2] = miPrimerPrestamo;
        //cliente.getPrestamos().length;
        System.out.println("Prestamo creado: " + miPrimerPrestamo);
        System.out.println("Cliente creado: " + cliente);
    }

}
