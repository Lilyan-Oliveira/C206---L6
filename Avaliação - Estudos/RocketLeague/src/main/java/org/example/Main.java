package org.example;

import org.example.Exceptions.CampoVazioException;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Carrinhos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JPanel panelCadastro = new JPanel(new GridLayout(4, 2));
        JPanel panelListagem = new JPanel(new BorderLayout());

        JTextField textFieldNome = new JTextField();
        JTextField textFieldVelocidade = new JTextField();

        JComboBox<String> comboBoxChassi = new JComboBox<>();
        comboBoxChassi.addItem("Octane");
        comboBoxChassi.addItem("Breakout");
        comboBoxChassi.addItem("Merc");

        JButton buttonCadastrar = new JButton("Cadastrar");
        JButton buttonListar = new JButton("Listar");
        JButton buttonLimpar = new JButton("Limpar");

        panelCadastro.add(new JLabel("Nome do Jogador:"));
        panelCadastro.add(textFieldNome);
        panelCadastro.add(new JLabel("Velocidade:"));
        panelCadastro.add(textFieldVelocidade);
        panelCadastro.add(new JLabel("Chassi:"));
        panelCadastro.add(comboBoxChassi);
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
                String nome = textFieldNome.getText();
                String velocidadeStr = textFieldVelocidade.getText();
                String chassi = (String) comboBoxChassi.getSelectedItem();

                if (nome.isEmpty() || velocidadeStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Preencha os campos corretamente!");
                    return;
                }

                int velocidade = Integer.parseInt(velocidadeStr);

                try {
                    arq.escrever(nome, velocidade, chassi);
                    JOptionPane.showMessageDialog(frame, "Carrinho cadastrado com sucesso!");
                } catch (CampoVazioException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage());
                }
            }
        });

        buttonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> carrinhos = arq.ler();
                textAreaListagem.setText("");
                for (String carrinho : carrinhos) {
                    textAreaListagem.append(carrinho + "\n");
                }
            }
        });

        buttonLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNome.setText("");
                textFieldVelocidade.setText("");
            }
        });

        frame.setVisible(true);
    }
}
