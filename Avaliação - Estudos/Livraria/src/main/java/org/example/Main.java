package org.example;

import org.example.Exceptions.InfoInvalidaException;
import org.example.Livros.Arquivo;
import org.example.Livros.Livro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arq = new Arquivo();
        ArrayList<Livro> livros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem vindo ao menu!");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Ordenar Livros por Páginas (Crescente)");
            System.out.println("4 - Ordenar Livros por Páginas (Decrescente)");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Nome do livro:");
                        String nome = sc.nextLine();
                        System.out.println("Autor do livro:");
                        String autor = sc.nextLine();
                        System.out.println("Editora do livro (Leya, Arqueiro, Rocco):");
                        String editora = sc.nextLine();
                        System.out.println("Quantidade de páginas do livro:");
                        int qtdPaginas = sc.nextInt();
                        sc.nextLine();
                        Livro livro = new Livro(nome, autor, editora, qtdPaginas);
                        arq.escrever(livro);
                    } catch (InfoInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Livros cadastrados: ");
                    livros = arq.ler();
                    for (Livro livro : livros) {
                        livro.mostraInfo();
                    }
                    break;
                case 3:
                    livros.sort((p1, p2) -> Integer.compare(p1.getQtdPaginas(), p2.getQtdPaginas()));
                    for (Livro livro : livros) {
                        livro.mostraInfo();
                    }
                    break;
                case 4:
                    livros.sort((p1, p2) -> Integer.compare(p2.getQtdPaginas(), p1.getQtdPaginas()));
                    for (Livro livro : livros) {
                        livro.mostraInfo();
                    }
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}