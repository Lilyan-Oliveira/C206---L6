package org.example.Soldado;

import org.example.Soldado.Interfaces.Defesa;

public class Sargento extends Soldado implements Defesa {

    private String especializacao;
    private int experienciaCompate;

    public Sargento(String nome, long cpf, String especializacao, int experienciaCompate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCompate = experienciaCompate;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialização: " + especializacao);
        System.out.println("Experiencia: " + experienciaCompate);
        usandoItem();
        defender();
    }

    @Override
    public void usandoItem() {
        if(itemEspecial != null){
            System.out.println(getNome() + " está usando item especial: " + itemEspecial.tipo);
            experienciaCompate += 300;
            System.out.printf("Experiencia de combate: " + experienciaCompate);
        }
        else {
            System.out.println(getNome() + " não está usando item especial ");
        }
    }

    @Override
    public void defender() {

        if(experienciaCompate > 650){
            System.out.println(" O sargento está defendendo");
        }
        else
            System.out.println(" O sargento não consegue se defender");
    }
}
