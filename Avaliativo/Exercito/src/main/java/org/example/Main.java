package org.example;

import org.example.Soldado.MedicoMilitar;
import org.example.Soldado.Oficial;
import org.example.Soldado.Sargento;

public class Main {
    public static void main(String[] args) {

        Exercito exercito = new Exercito();

        Oficial oficial1 = new Oficial("Oficial 1", 1234567891, "Patente1");
        Sargento sargento1 = new Sargento("Sargento 1", 1234567892, " Especialização1", 360);
        MedicoMilitar medicoMilitar1 = new MedicoMilitar("Médico1", 1234567893, 12, 1000);

        exercito.addSoldado(oficial1);
        exercito.addSoldado(sargento1);
        exercito.addSoldado(medicoMilitar1);

        exercito.mostraInfo();
        System.out.println("---------------------------");

        ItemEspecial itemEspecial1 = new ItemEspecial("Item especial do oficial");
        ItemEspecial itemEspecial2 = new ItemEspecial("Item especial sargento");
        ItemEspecial itemEspecial3 = new ItemEspecial("Item especial médico");

        oficial1.setItemEspecial(itemEspecial1);
        sargento1.setItemEspecial(itemEspecial2);
        medicoMilitar1.setItemEspecial(itemEspecial3);

        exercito.mostraInfo();
    }
}