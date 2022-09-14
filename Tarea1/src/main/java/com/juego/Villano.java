package com.juego;

public class Villano extends personaje{


    public Villano(){
        peleaConducta = new PeleaSi();
        armaConducta = new ArmaSi();
        magiaConducta = new MagiaSi();
        itemsConducta = new ItemsNo();
    }

    @Override
    public void display() {
        System.out.println("The Black Wind Begins to Blow...");
    }
}
