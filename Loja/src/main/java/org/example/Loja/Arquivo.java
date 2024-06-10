package org.example.Loja;

import org.example.Exceptions.InfoInvalidaException;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método para escrever produtos no arquivo
    public void escrever(Produto produto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("produtos.txt", true))) {
            bw.write("++ Produto ++\n");
            bw.write(produto.getNome() + "\n");
            bw.write(produto.getPreco() + "\n");
            bw.write(produto.getTipo() + "\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler produtos do arquivo
    public ArrayList<Produto> ler() {
        ArrayList<Produto> produtos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("produtos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Produto ++")) {
                    String nome = br.readLine();
                    double preco = Double.parseDouble(br.readLine());
                    String tipo = br.readLine();
                    produtos.add(new Produto(nome, preco, tipo));
                }
            }
        } catch (IOException | InfoInvalidaException e) {
            System.out.println("ERRO: " + e);
        }
        return produtos;
    }
}
