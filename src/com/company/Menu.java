package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int a ;
    boolean b = true;
    //Game game;
    JocDaus jocDaus;
    MenuDado menuDado;



    public Menu() {

        this.jocDaus = new JocDaus();
        this.menuDado= new MenuDado();

    }

    void muestra (){
        while (b){
            System.out.println("  __  __   ___   _  _   _   _ \n" +
                    " |  \\/  | | __| | \\| | | | | |\n" +
                    " | |\\/| | | _|  | .` | | |_| |\n" +
                    " |_|  |_| |___| |_|\\_|  \\___/ ");
            System.out.println("\t\t1--- Dau ---");
            System.out.println("\t\t2--- Parx ---");
            System.out.println("\t\t3--- Tic ---");
            System.out.println("\t\t4--- QUIT ---");


            a = scanner.nextInt();

        switch (a){
            case 1:
                menuDado.muestra();
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                break;
            case 4:
                System.out.println(jocDaus.toString());
                b = false;
                break;
            default:
                System.out.println("1 o 2 o 3");
                break;
        }

        }


    }
}
