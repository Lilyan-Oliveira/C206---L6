package org.example;

class Heroi {
    String nome;
    float poder;
    boolean podeVoar;

    public Heroi(String nome, float poder, boolean podeVoar) {
        this.nome = nome;
        this.poder = poder;
        this.podeVoar = podeVoar;
    }

    public void mostraInfo() {
        System.out.println("Nome do herói: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Pode voar? " + (podeVoar ? "Sim" : "Não"));
    }
}
