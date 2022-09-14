package com.juego;

public class ArmaNo implements ArmaConducta{
    @Override
    public void arma() {
        System.out.println("El personaje no puede portar armas");
    }
}
