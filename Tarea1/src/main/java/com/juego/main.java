package com.juego;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        mundo nivel2 = new mundo(20,50,"*");
        nivel2.dibujo();

        System.out.println(" ");

        mapa nuevoNivel = new mapa();
        nuevoNivel.plantillaMapa();

        mapa nuevoLevel = new mapa();
        nuevoLevel.plantillaMapa();

        personaje heroe1 = new Heroe();
        heroe1.accionArma();
        heroe1.accionItems();
        heroe1.accionMagia();
        heroe1.display();

        personaje Magus = new Villano();
        Magus.display();
        Magus.accionMagia();
        Magus.accionPelear();
        Magus.accionArma();



    }
}
