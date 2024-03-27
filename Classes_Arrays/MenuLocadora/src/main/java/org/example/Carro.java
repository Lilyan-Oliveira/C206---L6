package org.example;

class Carro {
    String modelo;
    String cor;
    boolean alugado;
    Motor motor;

    public Carro(String modelo, String cor, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = false;
        this.motor = motor;
    }

    public void mostraInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        motor.mostraInfo();
        System.out.println("Disponível para aluguel: " + (!alugado ? "Sim" : "Não"));
    }
}