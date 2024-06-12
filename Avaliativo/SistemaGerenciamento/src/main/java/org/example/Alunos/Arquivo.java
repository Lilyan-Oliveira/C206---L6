package org.example.Alunos;

import org.example.Exceptions.InfoInvalidaException;
import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    // Método para escrever alunos no arquivo
    public void escrever(Aluno a) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("alunos.txt", true))) {
            bw.write("++ Alunos ++\n");
            bw.write(a.getNome() + "\n");
            bw.write(a.getMatricula() + "\n");
            bw.write(a.getCurso() + "\n");
            bw.write(a.getMedia() + "\n");
            bw.write("\n");
        } catch (IOException e) {
            System.out.println("ERRO: " + e);
        }
    }

    // Método para ler alunos do arquivo
    public ArrayList<Aluno> ler() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.equals("++ Alunos ++")) {
                    String nome = br.readLine();
                    int matricula = Integer.parseInt(br.readLine());
                    String curso = br.readLine();
                    float media = Float.parseFloat(br.readLine());
                    alunos.add(new Aluno(nome, matricula, curso, media));
                }
            }
        } catch (IOException | InfoInvalidaException e) {
            System.out.println("ERRO: " + e);
        }
        return alunos;
    }
}