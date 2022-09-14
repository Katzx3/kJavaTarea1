package com.juego;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mundoTest {

    @Test
    void dibujo() {
        mundo mundoTest = new mundo(25,35,"?");
        Assertions.assertEquals(15,mundoTest.dibujo());
    }

    @Test
    void dibujo2() {
        mundo mundoTest = new mundo(25,35,"?");
        Assertions.assertEquals(0,mundoTest.dibujo());
    }
}