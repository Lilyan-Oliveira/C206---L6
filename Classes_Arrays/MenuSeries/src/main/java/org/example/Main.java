package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma("Netflix");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar uma série na plataforma");
            System.out.println("b) Mostrar as informações da plataforma e suas séries");
            System.out.println("c) Mostrar o nome da série com maior número de temporadas finalizadas");
            System.out.println("d) Mostrar a porcentagem de séries com 3 ou mais temporadas e a média aritmética de notas dessas séries");
            System.out.println("s) Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Nome da série: ");
                    String nomeSerie = scanner.nextLine();
                    System.out.print("Nota da série: ");
                    double notaSerie = Double.parseDouble(scanner.nextLine());
                    System.out.print("Número de temporadas da série: ");
                    int temporadasSerie = Integer.parseInt(scanner.nextLine());
                    System.out.print("A série está finalizada? (s/n): ");
                    boolean finalizadaSerie = scanner.nextLine().equalsIgnoreCase("s");
                    System.out.print("Nome do diretor da série: ");
                    String nomeDiretor = scanner.nextLine();
                    Diretor diretor = new Diretor(nomeDiretor);

                    Serie novaSerie = new Serie(nomeSerie, notaSerie, temporadasSerie, finalizadaSerie, diretor);
                    plataforma.addSerie(novaSerie);
                    break;
                case "b":
                    plataforma.mostraInfo();
                    break;
                case "c":
                    String nomeSerieMaisLonga = plataforma.serieMaisLongaFinalizada();
                    System.out.println("Nome da série com maior número de temporadas finalizadas: " + nomeSerieMaisLonga);
                    break;
                case "d":
                    plataforma.mediaPorcentagem();
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
