package org.example;

public class Plataforma {

    String nome;
    Serie[] series = new Serie[10];

    public Plataforma(String nome) {
        this.nome = nome;
    }

    public void mostraInfo(){

        System.out.println("Nome da plataforma: " +nome);
        System.out.printf("Series disponiveis: " +series);

        for (int i = 0; i < series.length; i++) {
            Serie serie = series[i];
            if (serie != null){
                serie.mostraInfo();
            }
        }

    }

    public void addSerie(Serie serie){
        for (int i = 0; i < series.length; i++) {
            if (series[i]==null){
                series[i] = serie;
                System.out.println("Série adicionada com sucesso!");
                break;
            }
        }
    }

    String serieMaisLongaFinalizada;

    public String serieMaisLongaFinalizada() {
        String serieMaisLonga = null;
        int maxTemporadas = 0;

        for (int i = 0; i < series.length; i++) {
            Serie serie = series[i];
            if (serie != null && serie.finalizada && serie.temporadas > maxTemporadas) {
                serieMaisLonga = serie.nome;
                maxTemporadas = serie.temporadas;
            }
        }

        return serieMaisLonga != null ? serieMaisLonga : "Nenhuma série finalizada encontrada.";
        //Se a serieMaisLonga for diferente de null, retorna serieMaisLonga ou o texto
    }

    public void mediaPorcentagem() {
        int totalSeries = 0;
        int totalSeriesTresMaisTemporadas = 0;
        double somaNotas = 0;

        for (int i = 0; i < series.length; i++) {
            Serie serie = series[i];
            if (serie != null) {
                totalSeries++;
                if (serie.temporadas >= 3) {
                    totalSeriesTresMaisTemporadas++;
                    somaNotas += serie.nota;
                }
            }
        }

        if (totalSeries == 0) {
            System.out.println("Nenhuma série cadastrada.");
        } else {
            double mediaNotas = totalSeriesTresMaisTemporadas > 0 ? somaNotas / totalSeriesTresMaisTemporadas : 0;
            double porcentagem = ((double) totalSeriesTresMaisTemporadas / totalSeries) * 100;

            System.out.println("Porcentagem de séries com 3 ou mais temporadas: " + porcentagem + "%");
            System.out.println("Média aritmética de notas das séries com 3 ou mais temporadas: " + mediaNotas);
        }
    }
}
