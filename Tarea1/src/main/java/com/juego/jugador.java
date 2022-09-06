package com.juego;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class jugador {
    private String nombre;
    private String arma;
    private int salud;


    public jugador(String nombre, String arma, int salud) {

        this.nombre = nombre;
        this.arma = arma;
        this.salud = salud;
        if(salud < 0 || salud >100){
            this.salud = 100;
            System.out.println("La salud no puede ser mayor que 100 ni menor que 0");
        }
    }

    public void danomano(){
        this.salud -= 10;
        if(this.salud <=0){
            this.salud =0;
        }
        System.out.println(getNombre()+" fue herido por un mano a mano. La salud fue reducida en 10 unidades"+
                " su nuevo nivel del salud es "+this.salud);
        if(this.salud == 0){
            System.out.println( getNombre()+" esta muerto");
        }
    }

    public void danoarma(){
        this.salud -= 30;
        if(this.salud <=0){
            this.salud =0;
        }
        System.out.println(getNombre()+" fue herido por un arma. La salud fue reducida en 30 unidades"+
                " su nuevo nivel del salud es "+this.salud);
        if(this.salud == 0){
            System.out.println( getNombre()+" esta muerto");
        }
    }
}
