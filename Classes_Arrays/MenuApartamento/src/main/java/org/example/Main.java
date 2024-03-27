package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Imobiliaria imobiliaria = new Imobiliaria("MeTiraDaRua", "123456789", "São Paulo");

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1) Cadastrar um apartamento novo");
            System.out.println("2) Ajustar o valor do aluguel");
            System.out.println("3) Mostrar a média das áreas dos apartamentos com 2 quartos ou menos");
            System.out.println("4) Exibir todas as informações da Imobiliária e dos apartamentos cadastrados");
            System.out.println("0) Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Endereço do apartamento: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Número de quartos: ");
                    int numQuartos = Integer.parseInt(scanner.nextLine());
                    System.out.print("Área (m²): ");
                    double area = Double.parseDouble(scanner.nextLine());
                    System.out.print("Aluguel: ");
                    double aluguel = Double.parseDouble(scanner.nextLine());

                    Apartamento novoApto = new Apartamento(endereco, numQuartos, area, aluguel);
                    imobiliaria.addApartamento(novoApto);
                    break;
                case 2:
                    imobiliaria.ajustaAluguel();
                    break;
                case 3:
                    int mediaArea = imobiliaria.mediaArea();
                    System.out.println("Média das áreas dos apartamentos com 2 quartos ou menos: " + mediaArea + " m²");
                    break;
                case 4:
                    imobiliaria.mostraInfo();
                    break;
                case 0:
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