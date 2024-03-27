package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Estudante[] estudantes = new Estudante[300];
        //INSTANCIANDO UMA NOVA ESCOLA
        Escola e1 = new Escola("ETE", "etefmc@gmail.com", 99191919, "avenida sinha moreira");

        boolean flag = true;//VARIAVEL PARA CONTROLE DO MENU

        Scanner in = new Scanner(System.in);//PARA LEITURA DE DADOS

        while (flag) {

            System.out.println("BEM VINDO AO MENU DA ESCOLA!!!");
            System.out.println("1-Cadastrar estudantes ");
            System.out.println("2-Mostrar informacoes dos estudantes");
            System.out.println("3-Quantidade de alunos em cada ano");
            System.out.println("4-Sair do menu");

            int op;
            op = in.nextInt();

            switch (op) {

                case 1:
                    //CADASTRANDO UM NOVO ESTUDANTE
                    System.out.println("Vamos cadastrar um estudante!");
                    in.nextLine();

                    System.out.println("Entre com o nome do aluno: ");
                    String nomealu = in.nextLine();

                    System.out.println("Entre com a idade do aluno: ");
                    int idade = in.nextInt();
                    in.nextLine();

                    System.out.println("Entre com o ano: ");
                    String ano = in.nextLine();

                    Estudante estu = new Estudante(nomealu, idade, ano);
                    e1.addEstudante(estu);

                    break;

                case 2:
                    //MOSTRANDO INFORMACOES DA ESCOLA E DOS ESTUDANTES
                    e1.mostraInfo();
                    break;

                case 3:
                    //MOSTRANDO QUANTIDADE DE ESTUDANTES E RESPECTIVOS ANOS
                    e1.qtdEstudanteAno();
                    break;

                case 4:
                    //SAIR DO MENU
                    flag = false;
                    System.out.println("Voce saiu do menu");
                    break;

                default:
                    System.out.println("Digite um numero valido");
                    break;

            }
        }
    }
}
