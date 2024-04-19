package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Arma;

public abstract class Habitante {

    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia = 100f;
    private Arma arma;

    public void setArma(Arma arma) {

        this.arma = arma;
    }

    public void atacar(){

        System.out.println("Herói atacou com a arma: " );

        if (arma.isMagica()){
            energia -=20;
        }

        else{
            energia -= 10;
        }
    }

    public void mostraInfo(){

    }
}
