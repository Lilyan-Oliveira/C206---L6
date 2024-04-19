package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Mineração;

public class Anao extends Habitante implements Mineração {

    private float altura;
    private String reino;

    public Anao(float altura, String reino) {
        this.altura = altura;
        this.reino = reino;
        contador++;
        id = contador;
    }

    @Override
    public void atacar(){

    }

    @Override
    public void mostraInfo(){

        super.mostraInfo();
    }

    @Override
    public void minerar(){

        System.out.println("Anão está Minerado");

    }
}
