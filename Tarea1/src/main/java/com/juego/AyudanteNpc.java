package com.juego;

public class AyudanteNpc extends personaje{

    public AyudanteNpc() {
        peleaConducta = new PeleaNo();
        armaConducta = new ArmaNo();
        magiaConducta = new MagiaSi();
        itemsConducta = new ItemsSi();
    }

    @Override
    public void display() {
        System.out.println("Hey Listen!");
    }
}
