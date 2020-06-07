/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.dbConnection;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos
 */
public class ProdutoDAO {
    
    public void create(Produto p){
        
        Connection con = dbConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement ("INSERT INTO produto (prod_id,prod_nome,prod_descricao,prod_qnt,prod_valor)VALUES(?,?,?,?,?)");
            stmt.setInt(1, p.getCodProduto());
            stmt.setString(2, p.getNomeProduto());
            stmt.setString(3, p.getDescricao());
            stmt.setInt(4, p.getQuantidade());
            stmt.setDouble(5, p.getValorUnitario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally {
            dbConnection.closeConnection(con, stmt);
        }
        
        
        
    }
    
    public List<Produto> read() {
        
        Connection con = dbConnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                
                Produto produto = new Produto();
                
                produto.setCodProduto(rs.getInt("prod_id"));
                produto.setNomeProduto(rs.getString("prod_nome"));
                produto.setDescricao(rs.getString("prod_descricao"));
                produto.setQuantidade(rs.getInt("prod_qnt"));
                produto.setValorUnitario(rs.getDouble("prod_valor"));
                produtos.add(produto);
            }
                    
                    
                    } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            dbConnection.closeConnection(con, stmt, rs);
        }
        
        return produtos;
        
        
    }
    
    public void update(Produto p){
        
        Connection con = dbConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement ("UPDATE produto SET prod_nome = ? ,prod_descricao = ? ,prod_qnt = ? ,prod_valor = ? Where prod_id = ?"); //Removi o prod_ID do comeco e coloquei no "Where"
            
            stmt.setString(1, p.getNomeProduto());
            stmt.setString(2, p.getDescricao());
            stmt.setInt(3, p.getQuantidade());
            stmt.setDouble(4, p.getValorUnitario());
            stmt.setInt(5, p.getCodProduto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }finally {
            dbConnection.closeConnection(con, stmt);
        }
        
        
        
    }
    public void delete(Produto p){
        
        Connection con = dbConnection.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement ("Delete FROM Produto Where prod_id = ?"); //Removi o prod_ID do comeco e coloquei no "Where"
            
//            stmt.setString(1, p.getNomeProduto());
//            stmt.setString(2, p.getDescricao());
//            stmt.setInt(3, p.getQuantidade());
//            stmt.setDouble(4, p.getValorUnitario());
            stmt.setInt(1, p.getCodProduto());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: "+ex);
        }finally {
            dbConnection.closeConnection(con, stmt);
        }
        
        
        
    }
    
    
    
}
