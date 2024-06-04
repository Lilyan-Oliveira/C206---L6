package org.example;

import Exercicio.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando um arquivo
        Exercicio.Arquivo arq = new Exercicio.Arquivo();
        //criando funcionarios
        Cliente cli = new Cliente();
        //variavel para escanear
        Scanner sc = new Scanner(System.in);
        //flag para manter o fluxo
        boolean flag = true;

        while(flag){

            System.out.println("Bem vindo ao menu!");
            System.out.println("1-Cadastrar Clientes!");
            System.out.println("2-Listar clientes");
            System.out.println("3-Listar clientes A-Z");
            System.out.println("4-Listar Z-A");
            System.out.println("5-Sair");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1:
                    System.out.println("Nome do cliente");
                    cli.setNomeCliente(sc.nextLine());
                    System.out.println("Cpf do cliente");
                    cli.setCpfCliente(sc.nextLine());
                    System.out.println("Idade do cliente");
                    cli.setIdadeCliente(sc.nextInt());
                    System.out.println("Endereço do cliente");
                    cli.setEnderecoCliente(sc.nextLine());

                    arq.escrever(cli);

                    break;

                case 2:
                    //armazena o retorno do medoto de leitura
                    ArrayList <Cliente> funcs = arq.ler();

                    for (int i = 0; i < funcs.size(); i++) {
                        System.out.println("INFORMACOES DO CLIENTE");
                        System.out.println(funcs.get(i).getNomeCliente());
                        System.out.println(funcs.get(i).getIdadeCliente());
                        System.out.println(funcs.get(i).getCpfCliente());
                        System.out.println(funcs.get(i).getEnderecoCliente());

                    }
                    break;

                case 3:
                    flag =false;
                    break;

            }

        }
    }
}