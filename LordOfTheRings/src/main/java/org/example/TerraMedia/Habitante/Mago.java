package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Cura;
import org.example.TerraMedia.Interfaces.Feitiço;

public class Mago extends Habitante implements Cura, Feitiço {

    private String cor;

    public Mago(String cor) {
        this.cor = cor;
        Habitante.contador ++;
        id = Habitante.contador;
    }

    @Override
    public void atacar(){

    }

    @Override
    public void mostraInfo(){

        super.mostraInfo();
    }

    @Override
    public void curar() {

        System.out.println("Cura mago");
    }

    @Override
    public void lancaFeitico() {

        energia -=10;
        System.out.println("Mago lançou um feitiço");
    }
}
