package org.example;

public class Escola {

    String nomeEscola;
    String email;
    int numTelefone;
    String endereco;
    Estudante[] estudantes = new Estudante[300]; //array de estudantes do tipo estudante

    public Escola(String nome, String email, int numTelefone, String endereco) {
        this.nomeEscola = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }

    //Variáveis para contar quantos alunos tem em cada ano
    int primeiro = 0;
    int segundo = 0;
    int terceiro = 0;

    public void addEstudante(Estudante estudante){
        for (int i = 0; i < estudantes.length; i++){
            if(estudantes[i]==null){
                estudantes[i] = estudante;
                System.out.println("estudante adicionado");
                break;
            }
        }
    }

    public void mostraInfo(){

        System.out.println("Nome da escola: "+nomeEscola);
        System.out.println("Email da escola: "+email);
        System.out.println("Numero de telefone da escola: "+numTelefone);
        System.out.println("Endereco da escola: "+endereco);
        System.out.println("Estudantes matriculados na escola:");
        for (int i = 0; i < estudantes.length; i++) {
            if(estudantes[i]!=null){
                estudantes[i].mostraInfo();
            }
        }
    }

    public void qtdEstudanteAno() {
        for (int i = 0; i < estudantes.length; i++) {
            if (estudantes[i] != null) {
                if (estudantes[i].ano.equals("Primeiro")) {
                    primeiro++;
                } else if (estudantes[i].ano.equals("Segundo")) {
                    segundo++;
                } else if (estudantes[i].ano.equals("Terceiro")) {
                    terceiro++;
                }
            }
        }

        System.out.println("Alunos do primeiro: " +primeiro);
        System.out.println("Alunos do segundo: " +segundo);
        System.out.println("Alunos do terceiro: " +terceiro);
    }
}
