/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class dbConnection {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/dbfloricultura";
    private static final String USER = "root";
    private static final String PASS = "";

    public static java.sql.Connection getConnection() {
        try {
            Class.forName(DRIVER);

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao", ex);

        }

    }
    
    public static void closeConnection(Connection con) {
        
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro: "+ex);
                
            }
        }
        
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt) {
        
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException ex) {
                System.out.println("Erro: "+ex);
                
            }
        }
        
        closeConnection(con);
        
    }
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException ex) {
                System.out.println("Erro: "+ex);
                
            }
        }
        
        closeConnection(con, stmt  );
        
    }

}
