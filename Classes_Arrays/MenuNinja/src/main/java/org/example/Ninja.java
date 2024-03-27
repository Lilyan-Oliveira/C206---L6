package org.example;

class Ninja {
    String nome;
    int idade;
    String titulo;
    String ranking;

    public Ninja(String nome, int idade, String titulo, String ranking) {
        this.nome = nome;
        this.idade = idade;
        this.titulo = titulo;
        this.ranking = ranking;
    }

    public void mostraInfo() {
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Título: " + titulo);
        System.out.println("Ranking: " + ranking);
    }
}
