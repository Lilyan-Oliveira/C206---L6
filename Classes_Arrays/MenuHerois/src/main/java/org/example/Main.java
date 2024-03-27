package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Equipe equipe = new Equipe("Capitão América");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar novo herói");
            System.out.println("b) Mostrar as informações da equipe e de seus heróis");
            System.out.println("c) Mostrar o herói mais forte");
            System.out.println("d) Calcular a porcentagem de heróis na equipe que podem voar");
            System.out.println("s) Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Nome do herói: ");
                    String nomeHeroi = scanner.nextLine();
                    System.out.print("Poder do herói: ");
                    float poderHeroi = Float.parseFloat(scanner.nextLine());
                    System.out.print("O herói pode voar? (s/n): ");
                    boolean podeVoar = scanner.nextLine().equalsIgnoreCase("s");

                    Heroi novoHeroi = new Heroi(nomeHeroi, poderHeroi, podeVoar);
                    equipe.adicionarHeroi(novoHeroi);
                    break;
                case "b":
                    equipe.mostraInfo();
                    break;
                case "c":
                    equipe.mostraMaisForte();
                    break;
                case "d":
                    int totalVoadores = equipe.calculaVoadores();
                    int totalHerois = 0;
                    for (Heroi heroi : equipe.herois) {
                        if (heroi != null) {
                            totalHerois++;
                        }
                    }
                    double porcentagemVoadores = (double) totalVoadores / totalHerois * 100;
                    System.out.println("Porcentagem de heróis que podem voar na equipe: " + porcentagemVoadores + "%");
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
