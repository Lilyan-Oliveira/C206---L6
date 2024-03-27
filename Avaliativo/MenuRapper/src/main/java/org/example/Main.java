package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena("Arena Inatel", "Santa Rita do Sapucaí");

        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (flag) {
            System.out.println("\nMenu:");
            System.out.println("1) Adicionar um Rapper na arena de batalha");
            System.out.println("2) Mostrar as informações da arena e seus Rappers");
            System.out.println("3) Mostrar os Rappers com microfone dourado");
            System.out.println("4) Mostrar o Rapper vencedor e o último colocado");
            System.out.println("0) Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Rapper: ");
                    String nome = sc.nextLine();
                    System.out.print("Nota do Rapper: ");
                    float nota = Float.parseFloat(sc.nextLine());
                    System.out.print("Idade do Rapper: ");
                    int idade = Integer.parseInt(sc.nextLine());
                    System.out.print("Material do microfone (Dourado, Madeira, Plástico): ");
                    String materialMicrofone = sc.nextLine();
                    Rapper rapper = new Rapper(nome, nota, idade, new Microfone(materialMicrofone));
                    arena.addRapper(rapper);
                    break;
                case 2:
                    arena.mostraInfo();
                    break;
                case 3:
                    arena.microfoneDou();
                    break;
                case 4:
                    arena.ranking();
                    break;
                case 0:
                    flag = false;
                    System.out.println("Saindo do Menu");
                    break;
                default:
                    System.out.println("Digite uma opção válida, por favor");
            }
        }
        sc.close();
    }
}
