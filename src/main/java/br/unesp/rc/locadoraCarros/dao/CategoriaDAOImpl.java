/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Categoria;
import br.unesp.rc.locadoraCarros.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Marina
 */
public class CategoriaDAOImpl implements CategoriaDAO {
    
    public CategoriaDAOImpl(){
    }
    
    @Override
    public boolean save(Categoria categoria){
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        int idCategoria;
        
        con = FabricaConexao.getConexao();
        
        if(con != null){
            try{
                // Start da transação
                con.setAutoCommit(false);
                
                pstm = con.prepareStatement(INSERT_CATEGORIA, PreparedStatement.RETURN_GENERATED_KEYS);
                
                pstm.setInt(1, categoria.getIdCategoria());
                pstm.setString(2, categoria.getNome());
                pstm.setString(3, categoria.getDescricao());
                pstm.setDouble(4, categoria.getPrecoDiario());
                
                //Executar instrução SQL
                pstm.executeUpdate();
                
                //ResultSet com a chave gerada
                res = pstm.getGeneratedKeys();
                
                //Recuperação da chave gerada
                while (res.next()){
                    idCategoria = res.getInt(1);
                }
                
                con.commit();
                b = true;
                
                }catch(SQLException ex){
                    System.out.println("Message " + ex);
                }
            
        }
        
        return b;
    }
    
    @Override
    public Categoria findCat(int idCategoria){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Categoria categoria = null;
        
        con = FabricaConexao.getConexao();
        
        if(con != null){
            try{
                pstm = con.prepareStatement(FIND_CATEGORIA_ID);
                pstm.setInt(1, idCategoria);
                res = pstm.executeQuery();
                
                while(res.next()){
                    categoria = new Categoria();
                    categoria.setIdCategoria(res.getInt(1));
                    categoria.setNome(res.getString(2));
                    categoria.setDescricao(res.getString(3));
                    categoria.setPrecoDiario(res.getDouble(4));
                }
                
            }catch(SQLException ex){
                    System.out.println("Message " + ex);
            }
        }
        
        return categoria;
    }
        
}
    
    
