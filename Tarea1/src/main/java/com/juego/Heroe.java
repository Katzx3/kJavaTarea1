package com.juego;

public class Heroe extends personaje{

    public Heroe(){
       peleaConducta = new PeleaSi();
       armaConducta = new ArmaSi();
       itemsConducta = new ItemsSi();
       magiaConducta = new MagiaNo();
    }

    @Override
    public void display() {
        System.out.println("Un heroe nuevo ha sido creado.");
    }
}
