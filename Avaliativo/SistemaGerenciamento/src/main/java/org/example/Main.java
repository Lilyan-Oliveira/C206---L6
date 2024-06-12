package org.example;

import org.example.Alunos.Aluno;
import org.example.Alunos.Arquivo;
import org.example.Exceptions.InfoInvalidaException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Arquivo arq = new Arquivo();
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Bem-vindo ao portal de cadastros do Inatel");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Ordenar alunos por média (Crescente)");
            System.out.println("4 - Quantidade de alunos por curso");
            System.out.println("5 - Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    try {
                        System.out.println("Nome do aluno:");
                        String nome = sc.nextLine();
                        System.out.println("Matrícula:");
                        int matricula = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Curso (Computação, Software, Telecomunicações):");
                        String curso = sc.nextLine();
                        System.out.println("Média do aluno:");
                        float media = sc.nextFloat();
                        sc.nextLine();
                        Aluno a = new Aluno(nome, matricula, curso, media);
                        arq.escrever(a);
                    } catch (InfoInvalidaException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Alunos cadastrados: ");
                    alunos = arq.ler();
                    for (Aluno a : alunos) {
                        System.out.println(a);
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    alunos.sort(Comparator.comparing(Aluno::getMedia));
                    for (Aluno a : alunos) {
                        System.out.println(a);
                        System.out.println(" ");
                    }
                    break;
                case 4:
                    int countComputacao = 0, countSoftware = 0, countTelecom = 0;
                    alunos = arq.ler();
                    for (Aluno a : alunos) {
                        switch (a.getCurso()) {
                            case "Computação":
                                countComputacao++;
                                break;
                            case "Software":
                                countSoftware++;
                                break;
                            case "Telecomunicações":
                                countTelecom++;
                                break;
                        }
                    }
                    System.out.println("Computação: " + countComputacao);
                    System.out.println("Software: " + countSoftware);
                    System.out.println("Telecomunicações: " + countTelecom);
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            System.out.println("Volte sempre!");
        }
        sc.close();
    }
}
