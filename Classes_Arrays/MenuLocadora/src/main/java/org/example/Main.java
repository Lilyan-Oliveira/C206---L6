package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locadora locadora = new Locadora("LocaCar", "123456789", "Rua das Locadoras, 123", 10);

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("a) Adicionar um carro em uma locadora");
            System.out.println("b) Mostrar as informações da locadora e seus carros");
            System.out.println("c) Calcular e armazenar quantos % dos carros estão disponíveis para alugar");
            System.out.println("d) Alugar um carro");
            System.out.println("0) Sair");

            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();

            switch (opcao) {
                case "a":
                    System.out.print("Modelo do carro: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Cor do carro: ");
                    String cor = scanner.nextLine();
                    System.out.print("Velocidade máxima do motor (km/h): ");
                    float velocidadeMaxima = Float.parseFloat(scanner.nextLine());
                    Motor motor = new Motor(velocidadeMaxima);
                    Carro novoCarro = new Carro(modelo, cor, motor);
                    locadora.adicionarCarro(novoCarro);
                    break;
                case "b":
                    locadora.mostraInfo();
                    break;
                case "c":
                    float percentual = locadora.contarCarrosParaAlugar();
                    System.out.printf("Percentual de carros disponíveis para alugar: %.2f%%\n", percentual);
                    break;
                case "d":
                    System.out.print("Digite o índice do carro que deseja alugar: ");
                    int indice = Integer.parseInt(scanner.nextLine());
                    locadora.alugarCarro(indice - 1); // Índice começa em 1, mas array começa em 0
                    break;
                case "0":
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