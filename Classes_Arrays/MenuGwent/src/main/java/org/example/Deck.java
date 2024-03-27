package org.example;

class Deck {
    String dono;
    Carta[] cartas = new Carta[30];

    public Deck(String dono) {
        this.dono = dono;
    }

    public void adicionarCarta(Carta carta) {
        for (int i = 0; i < cartas.length; i++) {
            if (cartas[i] == null) {
                cartas[i] = carta;
                System.out.println("Carta adicionada ao deck com sucesso!");
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Dono do deck: " + dono);
        System.out.println("Cartas no deck:");
        for (Carta carta : cartas) {
            if (carta != null) {
                System.out.println("Nome: " + carta.nome + ", Poder: " + carta.poder + ", Classificação: " + carta.classificacao);
            }
        }
    }

    public void calculaPoderMedio() {
        int somaPoder = 0;
        int totalCartas = 0;

        for (Carta carta : cartas) {
            if (carta != null) {
                somaPoder += carta.poder;
                totalCartas++;
            }
        }

        double poderMedio = totalCartas > 0 ? (double) somaPoder / totalCartas : 0;
        System.out.println("Poder médio do deck: " + poderMedio);
    }

    public void calculaClassificacao() {
        int soldados = 0;
        int arqueiros = 0;
        int pesados = 0;

        for (Carta carta : cartas) {
            if (carta != null) {
                switch (carta.classificacao) {
                    case "soldado":
                        soldados++;
                        break;
                    case "arqueiro":
                        arqueiros++;
                        break;
                    case "pesado":
                        pesados++;
                        break;
                }
            }
        }

        System.out.println("Quantidade de soldados no deck: " + soldados);
        System.out.println("Quantidade de arqueiros no deck: " + arqueiros);
        System.out.println("Quantidade de pesados no deck: " + pesados);
    }
}
