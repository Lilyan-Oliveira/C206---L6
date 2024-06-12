package org.example;

import org.example.Exceptions.CampoVazioException;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método para escrever livro no arquivo
    public void escrever(String titulo, int paginas, String editora) throws CampoVazioException {
        if (titulo.isEmpty() || editora.isEmpty()) {
            throw new CampoVazioException("Título do livro e editora não podem estar vazios!");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("livros.txt", true))) {
            bw.write("++ Livro ++\n");
            bw.write("Título: " + titulo + "\n");
            bw.write("Quantidade de Páginas: " + paginas + "\n");
            bw.write("Editora: " + editora + "\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler livros do arquivo
    public ArrayList<String> ler() {
        ArrayList<String> livros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("livros.txt"))) {
            String linha;
            StringBuilder infoLivro = new StringBuilder();
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Livro ++")) {
                    if (infoLivro.length() > 0) {
                        livros.add(infoLivro.toString());
                        infoLivro = new StringBuilder();
                    }
                }
                infoLivro.append(linha).append("\n");
            }
            // Adicionar último livro
            if (infoLivro.length() > 0) {
                livros.add(infoLivro.toString());
            }
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
        return livros;
    }
}
