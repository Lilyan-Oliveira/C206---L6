package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck("Jogador");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar uma carta ao deck");
            System.out.println("b) Mostrar as informações do deck e suas cartas");
            System.out.println("c) Mostrar o poder total do deck e sua média aritmética");
            System.out.println("d) Calcular quantos soldados, arqueiros e pesados há no deck");
            System.out.println("s) Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Nome da carta: ");
                    String nomeCarta = scanner.nextLine();
                    System.out.print("Poder da carta: ");
                    int poderCarta = Integer.parseInt(scanner.nextLine());
                    System.out.print("Classificação da carta (soldado/arqueiro/pesado): ");
                    String classificacaoCarta = scanner.nextLine();

                    Carta novaCarta = new Carta(nomeCarta, poderCarta, classificacaoCarta);
                    deck.adicionarCarta(novaCarta);
                    break;
                case "b":
                    deck.mostraInfo();
                    break;
                case "c":
                    deck.calculaPoderMedio();
                    break;
                case "d":
                    deck.calculaClassificacao();
                    break;
                case "s":
                    flag = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}