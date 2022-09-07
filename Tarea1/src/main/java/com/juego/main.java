package com.juego;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        //jugador player1 = new jugador("Alex","puno",500);
        //System.out.println(player1.getNombre());
      //  System.out.println(player1.getSalud());
       // System.out.println(player1.getArma());

       // player1.danoarma();

        //enemigo better = new enemigo("badguy","sword", 70, true);

        //better.danomano();
        //better.danoarma();

        //mundo nivel1 = new mundo(4,10,"$");
        //nivel1.dibujo();

        //System.out.println(" ");

        //mapa nuevoNivel = new mapa();
        //nuevoNivel.plantillaMapa();

        mapa nuevoLevel = new mapa();
        nuevoLevel.plantillaMapa();




    }
}
