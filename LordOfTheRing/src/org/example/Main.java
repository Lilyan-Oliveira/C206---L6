package org.example;

import org.example.TerraMedia.Arma;
import org.example.TerraMedia.Habitante.Anao;
import org.example.TerraMedia.Habitante.Elfo;
import org.example.TerraMedia.Habitante.Mago;
import org.example.TerraMedia.TerraMedia;

public class Main {
    public static void main(String[] args) {

        TerraMedia terraMedia = new TerraMedia();

        Arma arma1 = new Arma("Machado",true);
        Arma arma2 = new Arma("Arco",false);
        Arma arma3 = new Arma("Cajado",true);

        Anao anao1 = new Anao("Gimli",70,1.1f,"Durin");
        Elfo elfo1 = new Elfo("Legolas",300,"Sindarin");
        Mago mago1 = new Mago("Gandalf",2000,"Branco");

        terraMedia.addHabitante(anao1);
        terraMedia.addHabitante(elfo1);
        terraMedia.addHabitante(mago1);

        terraMedia.listaHabitante();

        anao1.setArma(arma1);
        elfo1.setArma(arma2);
        mago1.setArma(arma3);

        System.out.println("---------------------------------------");

        terraMedia.listaHabitante();

    }
}