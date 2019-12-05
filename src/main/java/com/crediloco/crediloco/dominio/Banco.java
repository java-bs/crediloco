package com.crediloco.crediloco.dominio;

public class Banco {

    private static Banco instancia;
    private String codigo;

    //constructor privado
    private Banco(String codigo) {
        this.codigo = codigo;
    }

    //metódo perteneciente a la clase
    public static Banco obtenerBanco() {
        if (instancia == null) {
            instancia = new Banco("SNZ");
            return instancia;
        } else {
            return instancia;
        }
    }

    //metódo perteneciente a la clase
    public static String convertirAString() {
        return "Banco " + instancia.codigo;
    }

    // metodo perteneciente al objeto creado
    public String getCodigo() {
        return codigo;
    }

    //metódo perteneciente al objeto creado
    public String toString() {
        return "Banco{" + "codigo=" + codigo + '}';
    }

}
