package org.example;

class Imobiliaria {
    String nome;
    String telefone;
    String cidade;
    Apartamento[] apartamentos = new Apartamento[30];
    int totalApartamentos = 0;

    public Imobiliaria(String nome, String telefone, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.cidade = cidade;
    }

    public void addApartamento(Apartamento apto) {
        if (totalApartamentos < 30) {
            apartamentos[totalApartamentos] = apto;
            totalApartamentos++;
            System.out.println("Apartamento cadastrado com sucesso!");
        } else {
            System.out.println("Limite máximo de apartamentos atingido.");
        }
    }

    public void ajustaAluguel() {
        for (Apartamento apto : apartamentos) {
            if (apto != null) {
                apto.aluguel *= 1.05; // Aumenta o aluguel em 5%
            }
        }
        System.out.println("Aluguéis ajustados com sucesso!");
    }

    public int mediaArea() {
        double somaAreas = 0;
        int totalAptos = 0;

        for (Apartamento apto : apartamentos) {
            if (apto != null && apto.numQuartos <= 2) {
                somaAreas += apto.area;
                totalAptos++;
            }
        }

        if (totalAptos > 0) {
            return (int) (somaAreas / totalAptos); // Retorna a média como inteiro
        } else {
            return 0;
        }
    }

    public void mostraInfo() {
        System.out.println("Nome da Imobiliária: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Cidade: " + cidade);
        System.out.println("Total de apartamentos cadastrados: " + totalApartamentos);
        System.out.println("Apartamentos cadastrados:");

        for (Apartamento apto : apartamentos) {
            if (apto != null) {
                apto.mostraInfo();
                System.out.println();
            }
        }
    }
}
