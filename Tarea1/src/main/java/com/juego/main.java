package com.juego;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        //jugador player1 = new jugador("Pedro","espada",300);
        //System.out.println(player1.getNombre());
        //System.out.println(player1.getSalud());
        //System.out.println(player1.getArma());

       //player1.danoarma();

       //enemigo enemigo1 = new enemigo("Juan","mano a mano", 50, true);
        //enemigo1.danomano();
        //enemigo1.danoarma();

        mundo nivel2 = new mundo(20,50,"*");
        nivel2.dibujo();

        System.out.println(" ");

        mapa nuevoNivel = new mapa();
        nuevoNivel.plantillaMapa();

        mapa nuevoLevel = new mapa();
        nuevoLevel.plantillaMapa();




    }
}
