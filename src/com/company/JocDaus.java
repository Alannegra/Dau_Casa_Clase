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

    void jugar (){
        partidas++;
        System.out.println();
        System.out.println();
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
