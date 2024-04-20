package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Mineração;

public class Anao extends Habitante implements Mineração {

    private float altura;
    private String reino;

    public Anao(String nome, int idade,float altura, String reino) {
        super(nome,idade);
        this.altura = altura;
        this.reino = reino;
    }

    @Override
    public void atacar(){
        super.atacar();
    }

    @Override
    public void minerar(){
        System.out.println("Anão está Minerado");

    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(getAltura());
        System.out.println(getReino());
        atacar();
        minerar();
    }

    public String getAltura() {
        return "Altura: " + altura;
    }

    public String getReino() {
        return "Reino: " + reino;
    }
}