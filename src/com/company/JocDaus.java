package com.company;

public class JocDaus {


    Dau dau1 = new Dau();
    Dau dau2 = new Dau();
    Dau dau3 = new Dau();

    int partidas;
    int win;
    int lose;

    public JocDaus() {

    }

    @Override
    public String toString() {
        return "Games\t" + "WIN!!!\t" + "lose" + "\n" +partidas + "\t"  + "\t" + win + "\t" + "\t" +  lose;
    }

    void interfaz(){

        System.out.println("  ___      _     ___     ___  \n" +
                " |   \\    /_\\   |   \\   / _ \\ \n" +
                " | |) |  / _ \\  | |) | | (_) |\n" +
                " |___/  /_/ \\_\\ |___/   \\___/ " +
                "                              ");
        System.out.println("\t########################");
        System.out.println("\t########1.PLAY.1########");
        System.out.println("\t########2.SETT.2####");
        System.out.println("\t########3.QUIT.3########");
        System.out.println("\t########################");






    }

    void jugar (){
        partidas++;
        if(dau1.metodoTirar() == dau2.metodoTirar() && dau1.metodoTirar() == dau3.metodoTirar()){
           win++;
        }else{
           lose++;
        }




    }
    void fin (){
        System.out.println( "Games " + "WIN!!! " + "lose " + "\n");
        System.out.println( "   " +partidas + "   " + win + "     " + lose);
    }








}
