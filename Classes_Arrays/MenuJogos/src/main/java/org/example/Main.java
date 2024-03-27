package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("PlataformaX", "DesenvolvedorY");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1) Adicionar um jogo na plataforma");
            System.out.println("2) Mostrar as informações da plataforma e seus jogos");
            System.out.println("3) Mostrar o nome do jogo mais caro e do mais barato cadastrados");
            System.out.println("4) Calcular quantos jogos possuem DLC");
            System.out.println("5) Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do jogo: ");
                    scanner.nextLine();
                    String nomeJogo = scanner.nextLine();
                    System.out.print("Gênero do jogo: ");
                    String generoJogo = scanner.nextLine();
                    System.out.print("Preço do jogo: ");
                    double precoJogo = Double.parseDouble(scanner.nextLine());
                    System.out.print("O jogo possui DLC? (s/n): ");
                    boolean dlcJogo = scanner.nextLine().equalsIgnoreCase("s");
                    Jogo jogo = new Jogo(nomeJogo, generoJogo, precoJogo, dlcJogo);
                    plataforma.adicionarJogo(jogo);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    plataforma.mostraMaisCaroBarato();
                    break;
                case 4:
                    plataforma.calculaDlc();
                    break;
                case 5:
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
