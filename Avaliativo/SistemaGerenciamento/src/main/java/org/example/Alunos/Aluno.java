package org.example.Alunos;

import org.example.Exceptions.InfoInvalidaException;

public class Aluno {

    private String nome;
    private int matricula;
    private String curso;
    private float media;

    // Construtor
    public Aluno(String nome, int matricula, String curso, float media) throws InfoInvalidaException {
        if (matricula <= 0 || (!curso.equals("Computação") && !curso.equals("Software") && !curso.equals("Telecomunicações"))) {
            throw new InfoInvalidaException("Informações inválidas para o cadastro.");
        }
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.media = media;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                " \n" +
                "Matícula: " + matricula +
                " \n" +
                "Curso: " + curso +
                " \n" +
                "Média: " + media;
    }
}
