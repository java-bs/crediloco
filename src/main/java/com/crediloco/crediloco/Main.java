package com.crediloco.crediloco;

import java.util.Scanner;

public class Main {

    public static void main(String[] parametros) {
        System.out.println("Cómo te llamas?");
        Scanner scanner = new Scanner(System.in);  // Crear un scanner

        String userName = scanner.nextLine();  // Leer entrada de usuario

        System.out.println("Hola " + userName + "!");
        
    }

}
