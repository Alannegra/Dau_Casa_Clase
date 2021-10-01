package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    int a ;
    boolean b = true;
    //Game game;
    JocDaus jocDaus;


    public Menu() {
        this.jocDaus = new JocDaus();
    }

    void muestra (){

        while (b){
            System.out.println("--- MENU ---");
            System.out.println("1--- Dau ---");
            System.out.println("2--- Parx ---");
            System.out.println("3--- Tic ---");
            System.out.println("4--- QUIT ---");


            a = scanner.nextInt();

        switch (a){
            case 1:
                jocDaus.jugar();
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
