package com.juego;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class mundo {
    private int altura;
    private int ancho;
    private String marcador;

    public mundo(int altura, int ancho, String marcador) {
        this.altura = altura;
        this.ancho = ancho;
        this.marcador = marcador;
    }

    public void dibujo(){
        System.out.println("EL mundo tiene"+getAltura()+" unidades de alturar y " +getAncho()+" unidades" +
                "de altura.");
    }
}
