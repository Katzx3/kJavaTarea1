package com.juego;

public class MagiaNo implements MagiaConducta{

    @Override
    public void magia() {
        System.out.println("El personaje no puede usar magia");
    }
}
