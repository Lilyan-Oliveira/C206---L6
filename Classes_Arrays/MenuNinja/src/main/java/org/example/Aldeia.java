package org.example;

class Aldeia {
    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] ninjas = new Ninja[300];

    public Aldeia(String nome, int qtdMoradores, String regiao) {
        this.nome = nome;
        this.qtdMoradores = qtdMoradores;
        this.regiao = regiao;
    }

    public void adicionaNinja(Ninja ninja) {
        for (int i = 0; i < ninjas.length; i++) {
            if (ninjas[i] == null) {
                ninjas[i] = ninja;
                System.out.println("Ninja adicionado à aldeia com sucesso!");
                break;
            }
        }
    }

    public void mostraInfo() {
        System.out.println("Nome da aldeia: " + nome);
        System.out.println("Quantidade de moradores: " + qtdMoradores);
        System.out.println("Região: " + regiao);
        System.out.println("Ninjas na aldeia:");
        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                ninja.mostraInfo();
            }
        }
    }

    public void rankingS() {
        System.out.println("Ninjas classificados no ranking S:");
        for (Ninja ninja : ninjas) {
            if (ninja != null && ninja.ranking.equals("S")) {
                System.out.println(ninja.nome);
            }
        }
    }

    public void qtdTitulos() {
        int gennin = 0;
        int chunnin = 0;
        int anbu = 0;

        for (Ninja ninja : ninjas) {
            if (ninja != null) {
                switch (ninja.titulo) {
                    case "Gennin":
                        gennin++;
                        break;
                    case "Chunnin":
                        chunnin++;
                        break;
                    case "ANBU":
                        anbu++;
                        break;
                }
            }
        }

        System.out.println("Quantidade de ninjas Gennin: " + gennin);
        System.out.println("Quantidade de ninjas Chunnin: " + chunnin);
        System.out.println("Quantidade de ninjas ANBU: " + anbu);
    }
}
