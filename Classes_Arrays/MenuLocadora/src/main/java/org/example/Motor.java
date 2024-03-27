package org.example;

class Motor {
    float velocidadeMaxima;

    public Motor(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void mostraInfo() {
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
    }
}
