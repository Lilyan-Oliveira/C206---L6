package org.example;

import org.example.Exceptions.CampoVazioException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Livros");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JPanel panelCadastro = new JPanel(new GridLayout(4, 2));
        JPanel panelListagem = new JPanel(new BorderLayout());

        JTextField textFieldTitulo = new JTextField();
        JTextField textFieldPaginas = new JTextField();

        JComboBox<String> comboBoxEditora = new JComboBox<>();
        comboBoxEditora.addItem("Leya");
        comboBoxEditora.addItem("Arqueiro");
        comboBoxEditora.addItem("Intrinseca");

        JButton buttonCadastrar = new JButton("Cadastrar");
        JButton buttonListar = new JButton("Listar");
        JButton buttonLimpar = new JButton("Limpar");

        panelCadastro.add(new JLabel("Título:"));
        panelCadastro.add(textFieldTitulo);
        panelCadastro.add(new JLabel("Quantidade de Páginas:"));
        panelCadastro.add(textFieldPaginas);
        panelCadastro.add(new JLabel("Editora:"));
        panelCadastro.add(comboBoxEditora);
        panelCadastro.add(buttonCadastrar);
        panelCadastro.add(buttonLimpar);

        JTextArea textAreaListagem = new JTextArea();
        textAreaListagem.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaListagem);

        panelListagem.add(scrollPane, BorderLayout.CENTER);
        panelListagem.add(buttonListar, BorderLayout.SOUTH);

        frame.add(panelCadastro, BorderLayout.NORTH);
        frame.add(panelListagem, BorderLayout.CENTER);

        Arquivo arq = new Arquivo();

        buttonCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String titulo = textFieldTitulo.getText();
                String paginasStr = textFieldPaginas.getText();
                String editora = (String) comboBoxEditora.getSelectedItem();

                if (titulo.isEmpty() || paginasStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Preencha os campos corretamente!");
                    return;
                }

                int paginas = Integer.parseInt(paginasStr);

                try {
                    arq.escrever(titulo, paginas, editora);
                    JOptionPane.showMessageDialog(frame, "Livro cadastrado com sucesso!");
                } catch (CampoVazioException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                }
            }
        });

        buttonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> livros = arq.ler();
                textAreaListagem.setText("");
                for (String livro : livros) {
                    textAreaListagem.append(livro + "\n");
                }
            }
        });

        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldTitulo.setText("");
                textFieldPaginas.setText("");
            }
        });

        frame.setVisible(true);
    }
}
