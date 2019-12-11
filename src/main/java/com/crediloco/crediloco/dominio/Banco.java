package com.crediloco.crediloco.dominio;

public class Banco {

    private static Banco instancia;
    private String codigo;

    //constructor privado, sólo accesible desde esta clase
    private Banco(String codigo) {
        this.codigo = codigo;
    }

    //metódo perteneciente a la clase (static)
    public static Banco obtenerBanco() {
        if (instancia == null) {
            instancia = new Banco("SNZ");
            return instancia;
        } else {
            return instancia;
        }
    }

    //metódo perteneciente al objeto creado (la instancia)
    public String toString() {
        return "Banco{" + "codigo=" + codigo + '}';
    }

}
