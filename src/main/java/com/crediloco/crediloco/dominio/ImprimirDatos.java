package com.crediloco.crediloco.dominio;

public interface ImprimirDatos {

    // los atributos en una interfaz se llaman fields, son public, static y final, son constantes
    // por convención, se escriben en mayúsculas
    String COLORDEFAULT = "negro";
    String COLORSECUNDARIO = "azul";

    // los métodos en una interfaz son, por default, abstract y public, no tengo que especificarlo
    // no podemos implementar métodos dentro de interfaces, sólo declararlos
    void imprimirDatos();
}
