package com.juego;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class jugadorTest {

    @Test
       void debeDanarJugador(){
       jugador player1 = new jugador("John","Puño",5);
       Assertions.assertEquals(1,player1.danomano());
    }

    @Test
    void debeDanarJugadorBad(){
        jugador player1 = new jugador("John","Puño",5);
        Assertions.assertEquals(15,player1.danomano());
    }

}