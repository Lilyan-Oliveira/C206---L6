package org.example.Jogo;

import org.example.Exceptions.PrecoNegativoException;

public class Jogo {

    private String nome;
    private double preco;
    private String genero;

    // Construtor
    public Jogo(String nome, double preco, String genero) throws PrecoNegativoException {
        if (preco <= 0 ) {
            throw new PrecoNegativoException("Informações inválidas para o produto.");
        }
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " \n" +
                "Preço: R$" + preco +
                " \n" +
                "Tipo: " + genero +
                " \n";
    }

}
