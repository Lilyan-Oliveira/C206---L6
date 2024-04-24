package org.example;

import org.example.Soldado.Soldado;

public class Exercito {

    private String nome;
    private Soldado[] soldados = new Soldado[3];

    public void setSoldados(Soldado[] soldados) {
        this.soldados = soldados;
    }

    public void addSoldado(Soldado s){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i] == null){
                soldados[i] = s;
                break;
            }
        }
    }

    public void mostraInfo(){
        for (int i = 0; i < soldados.length; i++) {
            if(soldados[i] != null){
                soldados[i].mostraInfo();
                System.out.println(" ");
            }
        }
    }
}
