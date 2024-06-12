package org.example.Livros;

import org.example.Exceptions.InfoInvalidaException;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int qtdPaginas;

    // Construtor
    public Livro(String nome, String autor, String editora, int qtdPaginas) throws InfoInvalidaException {
        if (qtdPaginas <= 0 || (!editora.equals("Leya") && !editora.equals("Arqueiro") && !editora.equals("Rocco"))) {
            throw new InfoInvalidaException("Informações inválidas para o livro.");
        }
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.qtdPaginas = qtdPaginas;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    // Método para mostrar informações do livro
    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Quantidade de Páginas: " + qtdPaginas);
        System.out.println(" ");
    }
}
