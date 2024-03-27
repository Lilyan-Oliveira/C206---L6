package org.example;

class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone microfone;

    public Rapper(String nome, float nota, int idade, Microfone microfone) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = microfone;
    }

    public void mostraInfo() {
        System.out.println("Nome do Rapper: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Idade: " + idade);
    }
}
