package com.juego;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public abstract class personaje {
    PeleaConducta peleaConducta;
    ArmaConducta armaConducta;
    MagiaConducta magiaConducta;
    ItemsConducta itemsConducta;

    protected personaje() {
    }

    public abstract void display();

    public void accionPelear(){
        peleaConducta.pelear();
    }

    public void accionArma(){
        armaConducta.arma();
    }

    public void accionMagia(){
        magiaConducta.magia();
    }

    public void accionItems(){
        itemsConducta.items();
    }



}
