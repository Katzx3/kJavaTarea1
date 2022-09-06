package com.juego;


public class enemigo extends jugador{
    private int salud;
    private boolean armadura;

    public enemigo(String nombre, String arma, int salud, boolean armadura) {
        super(nombre, arma, salud);
        this.salud = salud;
        //if(salud < 0 || salud >50){
        //    this.salud = 50;
        //    System.out.println("La salud del enemigo no puede ser mayor que 50 ni menor que 0");
        //}
        this.armadura = armadura;
    }

    @Override
    public void danomano() {
        if(armadura){
            this.salud -=2;
            if(this.salud <= 0){
                this.salud =0;
            }
            System.out.println(getNombre()+" enemigo tiene armadura, fue atacado mano a mano sufrio  2 de dano" +
                    "su nuevo nivel de salud es:" + this.salud);
        }
        if(!armadura){
            this.salud -= 10;
            if(this.salud <=0){
                this.salud =0;
              System.out.println(getNombre()+" fue herido por un ataca mano a mano y no tiene armadura." +
                        "La salud fue reducida en 10 unidades su nuevo nivel del salud es "+this.salud);
            }
                }
        if(this.salud == 0){
            System.out.println( getNombre()+" fue derrotado");
        }
    }

    @Override
    public void danoarma() {
        if(armadura){
            this.salud -=70;
            if(this.salud <= 0){
                this.salud =0;
            }
            System.out.println(getNombre()+" enemigo tiene armadura, fue atacado por un arma sufrio  70 de dano" +
                    "su nuevo nivel de salud es:" + this.salud);
        }
        if(!armadura){
            this.salud -= 10;
            if(this.salud <=0){
                this.salud =0;
                System.out.println(getNombre()+" fue herido por un arma y no tiene armadura." +
                        "La salud fue reducida en 10 unidades su nuevo nivel del salud es "+this.salud);
            }
        }
        if(this.salud == 0){
            System.out.println( getNombre()+" fue derrotado");
        }
    }
}
