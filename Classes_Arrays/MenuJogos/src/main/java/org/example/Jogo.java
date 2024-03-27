package org.example;

class Jogo {
    String nome;
    String genero;
    double preco;
    boolean dlc;

    public Jogo(String nome, String genero, double preco, boolean dlc) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome + ", Gênero: " + genero + ", Preço: " + preco + ", DLC: " + (dlc ? "Sim" : "Não"));
    }
}
