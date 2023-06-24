/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telalogin;

/**
 *
 * @author 123119525
 */
public class Usuario {
    private String nome;
    private String senha;
    private String cpf;
    private int idade; 
    private String genero; 
    private String endereco;
    private String telefone; 
    private int experiencia; 
    private String graduacao; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public Usuario(String nome, String senha, String cpf, int idade, String genero, String endereco, String telefone, int experiencia, String graduacao) {
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.endereco = endereco;
        this.telefone = telefone;
        this.experiencia = experiencia;
        this.graduacao = graduacao;
    }
    
}
