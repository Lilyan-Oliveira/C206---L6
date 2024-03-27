package org.example;

class Locadora {
    String nome;
    String CNPJ;
    String endereco;
    Carro[] carros;
    int carrosParaAlugar;

    public Locadora(String nome, String CNPJ, String endereco, int capacidade) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.carros = new Carro[capacidade];
        this.carrosParaAlugar = capacidade;
    }

    public void adicionarCarro(Carro carro) {
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] == null) {
                carros[i] = carro;
                carrosParaAlugar++;
                System.out.println("Carro adicionado à locadora com sucesso!");
                return;
            }
        }
        System.out.println("A locadora está lotada. Não é possível adicionar mais carros.");
    }

    public void alugarCarro(int index) {
        if (index >= 0 && index < carros.length && carros[index] != null && !carros[index].alugado) {
            carros[index].alugado = true;
            carrosParaAlugar--;
            System.out.println("Carro alugado com sucesso!");
        } else {
            System.out.println("Índice de carro inválido ou carro não disponível para aluguel.");
        }
    }

    public float contarCarrosParaAlugar() {
        int disponiveis = 0;
        for (Carro carro : carros) {
            if (carro != null && !carro.alugado) {
                disponiveis++;
            }
        }
        return ((float) disponiveis / carros.length) * 100;
    }

    public void mostraInfo() {
        System.out.println("Nome da locadora: " + nome);
        System.out.println("CNPJ: " + CNPJ);
        System.out.println("Endereço: " + endereco);
        System.out.println("Total de carros: " + carros.length);
        System.out.println("Carros disponíveis para alugar: " + carrosParaAlugar);
        System.out.println("Lista de carros:");
        for (int i = 0; i < carros.length; i++) {
            if (carros[i] != null) {
                System.out.println("Carro " + (i + 1) + ":");
                carros[i].mostraInfo();
                System.out.println();
            }
        }
    }
}
