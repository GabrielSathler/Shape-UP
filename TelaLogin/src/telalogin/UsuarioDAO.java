/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telalogin;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
        

public class UsuarioDAO { 
    private Connection connection;
    String login;
    String senha;
    public UsuarioDAO(){ 
        this.connection = new ConnectionDB().getConnection();
       
    } 
    public void adiciona(Usuario usuario){ 
        String sql = "INSERT INTO sys_instrutor(nome,senha, cpf, idade, genero, endereco, telefone, experiencia, graduacao) VALUES(?,?,?,?,?,?,?,?,?)";
        try { 
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
             stmt.setString(3, usuario.getCpf());
            stmt.setInt(4, usuario.getIdade());
             stmt.setString(5, usuario.getGenero());
            stmt.setString(6, usuario.getEndereco());
             stmt.setString(7, usuario.getTelefone());
            stmt.setInt(8, usuario.getExperiencia());
             stmt.setString(9, usuario.getGraduacao());
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
        } 
        
    } 
    }