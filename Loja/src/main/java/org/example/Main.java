package org.example;

import org.example.Exceptions.InfoInvalidaException;
import org.example.Loja.Arquivo;
import org.example.Loja.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arq = new Arquivo();
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem vindo ao menu!");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Ordenar Produtos por Preço (Decrescente)");
            System.out.println("4 - Mostrar Quantidade de Produtos por Tipo");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Nome do produto:");
                        String nome = sc.nextLine();
                        System.out.println("Preço do produto:");
                        double preco = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Tipo do produto (Comida, Higiene, Decoração):");
                        String tipo = sc.nextLine();
                        Produto p = new Produto(nome, preco, tipo);
                        arq.escrever(p);
                    } catch (InfoInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Produtos cadastrados: ");
                    produtos = arq.ler();
                    for (Produto p : produtos) {
                        System.out.println(p);
                    }
                    break;
                case 3:
                    produtos.sort((p1, p2) -> Double.compare(p2.getPreco(), p1.getPreco()));
                    for (Produto p : produtos) {
                        System.out.println(p);
                    }
                    break;
                case 4:
                    int countComida = 0, countHigiene = 0, countDecoracao = 0;
                    produtos = arq.ler();
                    for (Produto p : produtos) {
                        switch (p.getTipo()) {
                            case "Comida":
                                countComida++;
                                break;
                            case "Higiene":
                                countHigiene++;
                                break;
                            case "Decoração":
                                countDecoracao++;
                                break;
                        }
                    }
                    System.out.println("Comida: " + countComida);
                    System.out.println("Higiene: " + countHigiene);
                    System.out.println("Decoração: " + countDecoracao);
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