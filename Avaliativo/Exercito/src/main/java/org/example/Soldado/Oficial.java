package org.example.Soldado;

import org.example.Soldado.Interfaces.Defesa;

public class Oficial extends Soldado implements Defesa {

    private String patente;

    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: " + patente);
        usandoItem();
        defender();
    }

    @Override
    public void usandoItem() {
        if(itemEspecial != null){
            System.out.println(getNome() + " está usando item especial: " + itemEspecial.tipo);
        }
        else {
            System.out.println(getNome() + " não está usando item especial ");
        }
    }

    @Override
    public void defender() {
        if(itemEspecial != null){
            System.out.println(getNome() +" irá se defender");
        }
        else {
            System.out.println(getNome() + " não se defendeu");
        }
    }
}
