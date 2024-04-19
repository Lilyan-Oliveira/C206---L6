package org.example.TerraMedia;

import org.example.TerraMedia.Habitante.Habitante;

public class TerraMedia {

    private Habitante[] herois;

    public TerraMedia() {
        setHerois(new Habitante[3]);
    }

    public void setHerois(Habitante[] herois) {
        this.herois = herois;
    }

    public void addHabitante(Habitante habitante){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    public void listaHabitante(){
        for (int i = 0; i < herois.length; i++) {
            if(herois[i] != null){
                System.out.println("Heróis da lista: " + herois[i]);
            }
        }
    }
}
