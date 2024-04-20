package org.example.TerraMedia.Habitante;

import org.example.TerraMedia.Arma;

public abstract class Habitante {

    public static int contador = 0;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia = 100f;
    private Arma arma;

    public Habitante (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        contador++;
        id = contador;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void atacar(){

        if (arma != null){
            if (arma.isMagica()){
                if (energia >= 20){
                    energia -=20;
                    System.out.println("Herói atacou com a arma mágica" );
                } else System.out.println("Sem energia");
            } else if (energia >= 10) {
                energia -= 10;
                System.out.println("Herói atacou com a arma normal" );
            } else System.out.println("Sem energia");
            System.out.println("Energia remanescente" + energia);
        } else System.out.println("Herois sem arma, não possível atacar");
    }


    public void mostraInfo(){
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Energia: " + energia);
    }
}