package org.example.Soldado;

import org.example.Soldado.Interfaces.Curar;

public class MedicoMilitar extends Soldado implements Curar {

    private int anosExperincia;
    private int capacidadeEmergencia;

    public MedicoMilitar(String nome, long cpf, int anosExperincia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperincia = anosExperincia;
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de trabalho na área: " + anosExperincia);
        System.out.println("Capacidade de emergencia: " + capacidadeEmergencia);
        usandoItem();
        curar();
    }


    @Override
    public void usandoItem() {

        if(itemEspecial != null){
            System.out.println(getNome() + " está usando item especial: " + itemEspecial.tipo);
            capacidadeEmergencia += 100;
            System.out.printf("Experiencia de combate: " + capacidadeEmergencia);
        }
        else {
            System.out.println(getNome() + " não está usando item especial ");
        }
    }

    @Override
    public void curar() {
        if(capacidadeEmergencia > 920){
            System.out.println(" O médico está curando");
        }
        else
            System.out.println(" O médico não pode curar");
    }
}
