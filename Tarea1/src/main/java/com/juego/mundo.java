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

    public int dibujo() {
        for (int i = 0; i < altura; i++)
        {
            System.out.println();
            for (int j = 0; j < ancho; j++)
            {

                if (i == 0 || i == altura-1 ||
                        j== 0 || j == ancho-1)
                    System.out.print(marcador);
                else
                    System.out.print(" ");
            }

            }
        return 0;
    }
    }
