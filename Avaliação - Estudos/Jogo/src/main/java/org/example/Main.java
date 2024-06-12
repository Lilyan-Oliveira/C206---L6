package org.example;

import org.example.Exceptions.PrecoNegativoException;
import org.example.Jogo.Arquivo;
import org.example.Jogo.Jogo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arq = new Arquivo();
        ArrayList<Jogo> jogos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem vindo ao menu!");
            System.out.println("1 - Cadastrar um novo jogo");
            System.out.println("2 - Listar jogos");
            System.out.println("3 - Ordenar jogos por Preço (Crescente)");
            System.out.println("4 - Ordenar jogos por Preço (Decrescente)");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Nome do jogo:");
                        String nome = sc.nextLine();
                        System.out.println("Preço do jogo:");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Genero do jogo (A, B, C):");
                        String genero = sc.nextLine();
                        Jogo j = new Jogo(nome, preco, genero);
                        arq.escrever(j);
                    } catch (PrecoNegativoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Jogos cadastrados: ");
                    jogos = arq.ler();
                    for (Jogo j : jogos) {
                        System.out.println(j);
                    }
                    break;
                case 3:
                    jogos.sort(Comparator.comparingDouble(Jogo::getPreco));  // Ordenação crescente
                    for (Jogo j : jogos) {
                        System.out.println(j);
                    }
                    break;
                case 4:
                    jogos.sort((p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()));
                    for (Jogo j : jogos) {
                        System.out.println(j);
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