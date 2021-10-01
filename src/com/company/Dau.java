package com.company;

public class Dau {

    int caras = 6;
    int dau;
    //int tirades;
    //int[] freq = new int[12];



    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }


    public int metodoTirar() {

        dau = (int)(Math.random()*caras+1);

        return dau;

    }


}
