package com.juego;

public class Bat implements Monster{

    public Bat(){
        System.out.println("Se creo un vampiro");
    }

    @Override
    public Monster copiar() {
        System.out.println("Proceso de creación del vampiro");

        Bat objetoBat = null;

        try {
            objetoBat = (Bat) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return objetoBat;
    }
    public String toString(){
        return "Un nuevo vampiro ha aparecido";
    }
}
