package org.example.Livros;


import org.example.Exceptions.InfoInvalidaException;

import java.io.*;
import java.util.ArrayList;
public class Arquivo {
    // Método para escrever livros no arquivo
    public void escrever(Livro livro) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("livros.txt", true))) {
            bw.write("++ Livro ++\n");
            bw.write(livro.getNome() + "\n");
            bw.write(livro.getAutor() + "\n");
            bw.write(livro.getEditora() + "\n");
            bw.write(livro.getQtdPaginas() + "\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler livros do arquivo
    public ArrayList<Livro> ler() {
        ArrayList<Livro> livros = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("livros.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Livro ++")) {
                    String nome = br.readLine();
                    String autor = br.readLine();
                    String editora = br.readLine();
                    int qtdPaginas = Integer.parseInt(br.readLine());
                    livros.add(new Livro(nome, autor, editora, qtdPaginas));
                }
            }
        } catch (IOException | InfoInvalidaException e) {
            System.out.println("ERRO: " + e);
        }
        return livros;
    }
}
