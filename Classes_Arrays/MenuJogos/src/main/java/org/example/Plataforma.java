package org.example;

class Plataforma {
    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];

    public Plataforma(String nome, String criador) {
        this.nome = nome;
        this.criador = criador;
    }

    public void adicionarJogo(Jogo jogo) {
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                System.out.println("Jogo adicionado com sucesso!");
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome da plataforma: " + nome);
        System.out.println("Criador: " + criador);
        System.out.println("Jogos na plataforma:");
        for (int i = 0; i < jogos.length; i++) {
            Jogo jogo = jogos[i];
            if (jogo != null) {
                jogo.mostraInfo();
            }
        }
    }

    public void mostraMaisCaroBarato() {
        if (jogos[0] == null) {
            System.out.println("Não há jogos cadastrados.");
            return;
        }

        Jogo maisCaro = jogos[0];
        Jogo maisBarato = jogos[0];

        for (int i = 0; i < jogos.length; i++) {
            Jogo jogo = jogos[i];
            if (jogo != null) {
                if (jogo.preco > maisCaro.preco) {
                    maisCaro = jogo;
                }
                if (jogo.preco < maisBarato.preco) {
                    maisBarato = jogo;
                }
            }
        }

        System.out.println("Jogo mais caro: " + maisCaro.nome + ", Preço: " + maisCaro.preco);
        System.out.println("Jogo mais barato: " + maisBarato.nome + ", Preço: " + maisBarato.preco);
    }

    public void calculaDlc() {
        int numDlcs = 0;
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] != null && jogos[i].dlc) {
                numDlcs++;
            }
        }
        System.out.println("Total de jogos com DLC: " + numDlcs);
    }
}