package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aldeia aldeia = new Aldeia("Aldeia da Folha", 1000, "País do Fogo");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar um ninja na aldeia");
            System.out.println("b) Mostrar as informações da aldeia e seus ninjas");
            System.out.println("c) Mostrar os nomes dos ninjas classificados no ranking S");
            System.out.println("d) Mostrar quantidade de ninjas Gennin, Chunnin e ANBU");
            System.out.println("s) Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Nome do ninja: ");
                    String nomeNinja = scanner.nextLine();
                    System.out.print("Idade do ninja: ");
                    int idadeNinja = Integer.parseInt(scanner.nextLine());
                    System.out.print("Título do ninja (Gennin/Chunnin/ANBU): ");
                    String tituloNinja = scanner.nextLine();
                    System.out.print("Ranking do ninja (S/A/B/C/D): ");
                    String rankingNinja = scanner.nextLine();

                    Ninja novoNinja = new Ninja(nomeNinja, idadeNinja, tituloNinja, rankingNinja);
                    aldeia.adicionaNinja(novoNinja);
                    break;
                case "b":
                    aldeia.mostraInfo();
                    break;
                case "c":
                    aldeia.rankingS();
                    break;
                case "d":
                    aldeia.qtdTitulos();
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
