package org.example.Loja;

import org.example.Exceptions.InfoInvalidaException;

public class Produto {

    private String nome;
    private double preco;
    private String tipo;

    // Construtor
    public Produto(String nome, double preco, String tipo) throws InfoInvalidaException {
        if (preco <= 0 || (!tipo.equals("Comida") && !tipo.equals("Higiene") && !tipo.equals("Decoração"))) {
            throw new InfoInvalidaException("Informações inválidas para o produto.");
        }
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " \n" +
                "Preço: R$" + preco +
                " \n" +
                "Tipo: " + tipo +
                " \n";
    }


}
