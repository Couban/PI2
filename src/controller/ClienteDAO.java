/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import Model.Cliente;
import DAO.dbConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Edu Franco
 */
public class ClienteDAO {
    
    
    public void create (Cliente c) {
        java.sql.Connection con = dbConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into cliente (cli_id, cli_nome, cli_cpf, cli_email, cli_celular, cli_cep, cli_uf, cli_sexo, cli_nascimento, cli_endereco, cli_numerocasa,"
                    + "cli_complemento, cli_cidade, cli_bairro, cli_estadocivil) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setInt(1, c.getCodCliente());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getCelular());
            stmt.setString(6, c.getCep());
            stmt.setString(7, c.getUf());
            stmt.setString(8, c.getSexo());
            stmt.setString(9, c.getNascimento());
            stmt.setString(10, c.getEndereco());
            stmt.setString(11, c.getNumero());
            stmt.setString(12, c.getComplemento());
            stmt.setString(13, c.getCidade());
            stmt.setString(14, c.getBairro());
            stmt.setString(15, c.getCivil());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salver cliente." +ex);
            
        } finally {
            dbConnection.closeConnection(con, stmt);
        }
            
           
                    
        }
    }


