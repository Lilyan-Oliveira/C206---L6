package org.example;

class Arena {
    String nome;
    String lugar;
    Rapper[] rappers = new Rapper[10];
    int totalRappers;

    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    public void addRapper(Rapper rapper) {
        if (totalRappers < rappers.length) {
            rappers[totalRappers++] = rapper;
            System.out.println("Rapper adicionado à arena com sucesso!");
        } else {
            System.out.println("A arena está lotada. Não é possível adicionar mais rappers.");
        }
    }

    public void mostraInfo() {
        System.out.println("Nome da Arena: " + nome);
        System.out.println("Localização: " + lugar);
        System.out.println("Total de Rappers: " + totalRappers);
        System.out.println("Lista de Rappers:");
        for (int i = 0; i < totalRappers; i++) {
            System.out.println("Rapper " + (i + 1) + ":");
            rappers[i].mostraInfo();
            System.out.println();
        }
    }

    public void microfoneDou() {
        System.out.println("Rappers com microfone dourado:");
        for (int i = 0; i < totalRappers; i++) {
            if (rappers[i].microfone.material.equals("Dourado")) {
                System.out.println("Rapper: " +rappers[i].nome);
            }
        }
    }

    public void ranking() {
        float maxNota = Float.MIN_VALUE;
        float minNota = Float.MAX_VALUE;
        String melhorRapper = "";
        String piorRapper = "";

        for (int i = 0; i < totalRappers; i++) {
            if (rappers[i].nota > maxNota) {
                maxNota = rappers[i].nota;
                melhorRapper = rappers[i].nome;
            }
            if (rappers[i].nota < minNota) {
                minNota = rappers[i].nota;
                piorRapper = rappers[i].nome;
            }
        }

        System.out.println("Melhor Rapper: " + melhorRapper);
        System.out.println("Pior Rapper: " + piorRapper);
    }
}
