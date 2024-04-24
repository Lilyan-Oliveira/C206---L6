package org.example.Soldado;

import org.example.ItemEspecial;

public abstract class Soldado {

    public static int qtdSoldado = 0;
    private String nome;
    private long cpf;
    public ItemEspecial itemEspecial;

    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        qtdSoldado++;
    }

    public String getNome() {
        return nome;
    }

    public void setItemEspecial(ItemEspecial itemEspecial) {
        this.itemEspecial = itemEspecial;
    }

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
    }

    public abstract void usandoItem();
}
