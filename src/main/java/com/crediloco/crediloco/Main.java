package com.crediloco.crediloco;

import com.crediloco.crediloco.dominio.Banco;
import com.crediloco.crediloco.dominio.Cliente;
import com.crediloco.crediloco.dominio.Prestamo;
import com.crediloco.crediloco.dominio.PrestamoHipotecario;
import com.crediloco.crediloco.dominio.PrestamoPersonal;
import java.math.BigDecimal;

// java ejecuta  ->  Main.main();
public class Main {

    public static void main(String[] parametros) {
        System.out.println("Hola mundo!");

        Banco bancoSaenz = Banco.obtenerBanco();

        System.out.println("Iniciando sistema del banco: " + bancoSaenz);

        BigDecimal elMonto = new BigDecimal("1550.25");
        Prestamo miPrimerPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 6, "SIT6");

        //elMonto = new BigDecimal(4435.564);
        //elMonto.setScale(5, RoundingMode.HALF_UP);
        //miPrimerPrestamo.setMonto(elMonto);
        Prestamo miSegundoPrestamo = new PrestamoPersonal(bancoSaenz, elMonto, 12, "SIT3");

        //uso de constructor de Cliente
        //como no hay setter del nombre, una vez que lo creo no lo puedo cambiar
        Cliente cliente = new Cliente("José");
        cliente.setIngresos(new BigDecimal("35000.50"));

        PrestamoHipotecario miPrestamoHipotecario = new PrestamoHipotecario(bancoSaenz, elMonto, 30, "Auto");

        Prestamo[] prestamosDelCliente = {
            miPrimerPrestamo,
            miSegundoPrestamo,
            miPrestamoHipotecario};
        //asignacion de prestamos al cliente
        cliente.setPrestamos(prestamosDelCliente);
        
        cliente.imprimirDatos();
//        miPrestamoHipotecario.imprimirDatos();
    }

}
