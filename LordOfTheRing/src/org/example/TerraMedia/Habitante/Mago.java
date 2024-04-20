package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Cura;
import org.example.TerraMedia.Interfaces.Feitiço;

public class Mago extends Habitante implements Cura, Feitiço {

    private String cor;

    public Mago(String nome, int idade,String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    @Override
    public void atacar(){
        super.atacar();
    }

    @Override
    public void curar(){
        energia = energia * 1.15f;
        System.out.println("Heroi " + nome + " foi curado");
        System.out.println("Energia remanescente " + energia);
    }

    @Override
    public void lancaFeitico() {
        if (energia > 0f){
            energia = energia * 0.9f;
            System.out.println("Mago lançou um feitiço");
            System.out.println("Energia remanescente " + energia);
        }
        else {
            System.out.printf("Energia insuficiente");
        }
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(getCor());
        atacar();
        curar();
        lancaFeitico();
    }

    public String getCor() {
        return "Cor: " + cor;
    }
}