package org.example.TerraMedia;

public class Arma {

    private String nomeArma;
    private boolean magica;

    public Arma (String nomeArma, boolean magica){
        this.nomeArma = nomeArma;
        this.magica = magica;
    }

    public boolean isMagica() {
        System.out.println("Arma: " + nomeArma);
        return magica;
    }

}