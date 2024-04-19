package org.example;

import org.example.TerraMedia.Habitante.Anao;
import org.example.TerraMedia.Habitante.Elfo;
import org.example.TerraMedia.Habitante.Mago;
import org.example.TerraMedia.TerraMedia;

public class Main {
    public static void main(String[] args) {

        Anao anao1 = new Anao(1,"Leste");
        Elfo elfo1 = new Elfo("Lothlórien");
        Mago mago1 = new Mago("Branco");

        TerraMedia terraMedia = new TerraMedia();

        terraMedia.addHabitante(anao1);
        terraMedia.addHabitante(elfo1);
        terraMedia.addHabitante(mago1);

        terraMedia.listaHabitante();



    }
}