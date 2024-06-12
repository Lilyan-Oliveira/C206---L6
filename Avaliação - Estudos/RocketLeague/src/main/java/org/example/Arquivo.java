package org.example;
import org.example.Exceptions.CampoVazioException;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método para escrever carrinho no arquivo
    public void escrever(String nome, int velocidade, String chassi) throws CampoVazioException {
        if (nome.isEmpty() || chassi.isEmpty()) {
            throw new CampoVazioException("Nome do jogador e chassi não podem estar vazios!");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("carrinhos.txt", true))) {
            bw.write("++ Carrinho ++\n");
            bw.write("Nome do Jogador: " + nome + "\n");
            bw.write("Velocidade: " + velocidade + "\n");
            bw.write("Chassi: " + chassi + "\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler carrinhos do arquivo
    public ArrayList<String> ler() {
        ArrayList<String> carrinhos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("carrinhos.txt"))) {
            String linha;
            StringBuilder infoCarrinho = new StringBuilder();
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Carrinho ++")) {
                    if (infoCarrinho.length() > 0) {
                        carrinhos.add(infoCarrinho.toString());
                        infoCarrinho = new StringBuilder();
                    }
                }
                infoCarrinho.append(linha).append("\n");
            }
            // Adicionar último carrinho
            if (infoCarrinho.length() > 0) {
                carrinhos.add(infoCarrinho.toString());
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
        return carrinhos;
    }
}
