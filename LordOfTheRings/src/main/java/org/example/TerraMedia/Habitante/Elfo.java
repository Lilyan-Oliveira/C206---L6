package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Cura;

public class Elfo extends Habitante implements Cura {

    private String tribo;

    public Elfo(String tribo) {
        this.tribo = tribo;
        Habitante.contador++;
        id = Habitante.contador;
    }

    public void viajar(){
        System.out.printf("Elfo está viajando");
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

        System.out.println("Cura elfo");
    }
}
