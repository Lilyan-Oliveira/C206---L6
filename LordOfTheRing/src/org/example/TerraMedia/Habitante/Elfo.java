package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Interfaces.Cura;

public class Elfo extends Habitante implements Cura {

    private String tribo;

    public Elfo(String nome, int idade,String tribo) {
        super(nome, idade);
        this.tribo = tribo;
    }

    public void viajar(){
        System.out.println("Elfo está viajando");
    }

    @Override
    public void atacar(){
        super.atacar();
    }

    @Override
    public void curar() {
        energia = energia * 1.15f;
        System.out.println("Heroi " + nome + " foi curado");
        System.out.println("Energia remanescente " + energia);
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println(getTribo());
        atacar();
        curar();
        viajar();
    }

    public String getTribo() {
        return "Tribo: " + tribo;
    }
}