package org.example.Jogo;

import org.example.Exceptions.PrecoNegativoException;
import java.util.ArrayList;
import java.io.*;



public class Arquivo {
    // Método para escrever jogos no arquivo
    public void escrever(Jogo jogo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("jogos.txt", true))) {
            bw.write("++ Jogo ++\n");
            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getPreco() + "\n");
            bw.write(jogo.getGenero() + "\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler produtos do arquivo
    public ArrayList<Jogo> ler() {
        ArrayList<Jogo> jogos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("jogos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Jogo ++")) {
                    String nome = br.readLine();
                    double preco = Double.parseDouble(br.readLine());
                    String genero = br.readLine();
                    jogos.add(new Jogo(nome, preco, genero));
                }
            }
        } catch (IOException | PrecoNegativoException e) {
            System.out.println("ERRO: " + e);
        }
        return jogos;
    }
}
