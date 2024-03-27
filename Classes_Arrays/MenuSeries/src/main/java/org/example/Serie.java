package org.example;

public class Serie {

    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, Diretor diretor) {
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.diretor = diretor;
    }

    public void mostraInfo() {
        System.out.println("Nome da série: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Número de temporadas: " + temporadas);
        System.out.println("Finalizada: " + (finalizada ? "Sim" : "Não"));
        System.out.println("Diretor: " + diretor.nome);
    }
}
