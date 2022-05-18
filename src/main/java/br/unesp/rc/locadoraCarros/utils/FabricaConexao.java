/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilh
 */
public class FabricaConexao implements IMySql {
    
    /*
    Retornando a conexão com o banco
    */
    
    public static Connection getConexao(){
        Connection con = null;
        
        try{
            /*
            Carregar driver
            */
            Class.forName(DRIVER_NAME);
            
            /*
            Criando conexão com o banco de dados
            */
            
            con = DriverManager.getConnection(URL, USUARIO, SENHA);
        }catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Message:" + ex.getMessage());
        }
        
        return con;
    }
    
    public boolean fechar(Connection con) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm) {
        return false;
    }

    public boolean fechar(Connection con, PreparedStatement pstm, ResultSet res) {
        return false;
    }
    
}
