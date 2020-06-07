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
import java.sql.SQLException;
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
            stmt = con.prepareStatement ("INSERT INTO produtos (prod_id,prod_nome,prod_descricao,prod_qnt,prod_valor)VALUES(?,?,?,?,?)");
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
    
}
