package com.juego;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


import java.io.IOException;

public class mapa{

private static Logger logger = LogManager.getLogger(mapa.class);

  //Constructor de mapa, pdfbox requiere una Exception
    public mapa() {
    }

    public void plantillaMapa() throws IOException {

        PDDocument plantilla = new PDDocument();
        PDPage nivel = new PDPage();
        plantilla.addPage(nivel);

        PDPageContentStream dibujo = new PDPageContentStream(plantilla,nivel);
        dibujo.beginText();
        dibujo.setFont(PDType1Font.HELVETICA, 12);
        dibujo.setLeading(16.0f);
        dibujo.newLineAtOffset(25,nivel.getTrimBox().getHeight() -25);

        String text1 = "This is the map line number 1";
        String text2 = "This is the map line number 2";
        String text3 = "This is the map line number 3";

        dibujo.showText(text1);
        dibujo.newLine();
        dibujo.showText(text2);
        dibujo.newLine();
        dibujo.showText(text3);
        dibujo.newLine();

        dibujo.endText();
        dibujo.close();


        plantilla.save("/home/alexander/Documentos/GitHub/kJavaTarea1/Tarea1/mapa_pruebaExpo2.pdf");
        logger.error("Pdf is created");
        logger.warn("Pdf is created");
        logger.info("Pdf is created");
        logger.fatal("Pdf is created");
        logger.debug("Pdf is created");

        plantilla.close();

    }

}
