/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telalogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaLogin extends JFrame implements ActionListener {

    private JLabel labelNome, labelIdade, labelGenero, labelEndereco, labelExperiencia, labelGraduacao, labelCPF, labelTelefone, labelSenha,
            labelConfirmarSenha;
    private JTextField campoNome, campoCPF, campoGraduacao, campoTelefone, campoIdade, campoGenero, campoEndereco, campoExperiencia;
    private JPasswordField campoConfirmarSenha, campoSenha;
    private JButton botaoLogin;

    public TelaLogin() {
        setTitle("Tela Cadastro Instrutor");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        labelNome = new JLabel("Nome completo:");
        labelCPF = new JLabel("CPF:");
        labelGenero = new JLabel("Genere: ");
        labelIdade = new JLabel("Idade: ");
        labelEndereco = new JLabel("Endereço: ");
        labelExperiencia = new JLabel("Experiencia: ");
        labelGraduacao = new JLabel("Graduação: ");
        labelTelefone = new JLabel("Telefone: ");
        labelSenha = new JLabel("Senha: ");
        labelConfirmarSenha = new JLabel("Confirmar Senha:");
        campoEndereco = new JTextField(10);
        campoNome = new JTextField(10);
        campoCPF = new JTextField(10);
        campoIdade = new JTextField(10);
        campoExperiencia = new JTextField(10);
        campoGraduacao = new JTextField(10);
        campoGenero = new JTextField(10); 
        campoTelefone = new JTextField(10);
        campoSenha = new JPasswordField(10);
        campoConfirmarSenha = new JPasswordField(10);
        botaoLogin = new JButton("Login");
        botaoLogin.addActionListener(this);
        JPanel painel = new JPanel(new GridLayout(12, 2));
        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(labelCPF);
        painel.add(campoCPF);
        painel.add(labelIdade);
        painel.add(campoIdade);
        painel.add(labelGenero);
        painel.add(campoGenero);
        painel.add(labelEndereco);
        painel.add(campoEndereco);
        painel.add(labelGraduacao);
        painel.add(campoGraduacao);
        painel.add(labelExperiencia);
        painel.add(campoExperiencia);
        painel.add(labelTelefone);
        painel.add(campoTelefone);
        painel.add(labelSenha);
        painel.add(campoSenha);
        painel.add(labelConfirmarSenha);
        painel.add(campoConfirmarSenha);
        painel.add(new JLabel());
        painel.add(botaoLogin);
        add(painel);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoLogin) {
            String nome = campoNome.getText();
            String genero = campoGenero.getText(); 
            String cpf = campoCPF.getText();
            int idade = Integer.parseInt (campoIdade.getText());
            String endereco = campoEndereco.getText();
            String telefone = campoTelefone.getText();
            String graduacao = campoGraduacao.getText();
            int experiencia = Integer.parseInt(campoExperiencia.getText());
            String senha = new String(campoSenha.getPassword());
            String confirmarSenha = new String(campoConfirmarSenha.getPassword());
            if (nome.isEmpty() || cpf.isEmpty() || endereco.isEmpty() || telefone.isEmpty()
                    || senha.isEmpty() || confirmarSenha.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!");
            } else if (!senha.equals(confirmarSenha)) {
                JOptionPane.showMessageDialog(this, "As senhas não correspondem!");
            } else {
                JOptionPane.showMessageDialog(this, "Login bem-sucedido ou registro concluído!");
             Usuario instrutor = new Usuario(nome, senha, cpf, idade,  genero, endereco, telefone, experiencia, graduacao); 
             UsuarioDAO dao = new UsuarioDAO();
             dao.adiciona(instrutor);
            }  
        }
    }

           
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaLogin();
            }
        });
    }
}
