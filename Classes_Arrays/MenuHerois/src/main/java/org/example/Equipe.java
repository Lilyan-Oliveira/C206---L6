package org.example;

class Equipe {
    String capitao;
    Heroi[] herois = new Heroi[10];

    public Equipe(String capitao) {
        this.capitao = capitao;
    }

    public void adicionarHeroi(Heroi heroi) {
        for (int i = 0; i < herois.length; i++) {
            if (herois[i] == null) {
                herois[i] = heroi;
                System.out.println("Herói adicionado com sucesso!");
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Capitão da equipe: " + capitao);
        System.out.println("Heróis na equipe:");
        for (int i = 0; i< herois.length; i++) {
            Heroi heroi = herois[i];
            if (heroi != null) {
                heroi.mostraInfo();
            }
        }
    }

    public void mostraMaisForte() {
        float poderMaximo = 0;
        String heroiMaisForte = "";

        for (int i = 0; i < herois.length; i++) {
            Heroi heroi = herois[i];
            if (heroi != null && heroi.poder > poderMaximo) {
                poderMaximo = heroi.poder;
                heroiMaisForte = heroi.nome;
            }
        }

        System.out.println("Herói mais forte: " + heroiMaisForte);
    }

    public int calculaVoadores() {
        int totalVoadores = 0;
        for (int i = 0; i < herois.length; i++) {
            Heroi heroi = herois[i];
            if (heroi != null && heroi.podeVoar) {
                totalVoadores++;
            }
        }
        return totalVoadores;
    }
}

