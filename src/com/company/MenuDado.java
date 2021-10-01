package com.company;

import java.util.Scanner;

public class MenuDado {
    Scanner scanner = new Scanner(System.in);
    int a;
    boolean b = true;
    JocDaus jocDaus = new JocDaus();


    void muestra() {
        while (b) {
            jocDaus.interfaz();

            a = scanner.nextInt();

            switch (a) {
                case 1:
                    jocDaus.interfaz();
                    jocDaus.jugar();
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println(jocDaus.toString());
                    b = false;
                    break;
                default:
                    System.out.println("Tienes que escribir 1 o 2 o 3");
                    break;
            }

        }
    }

}
