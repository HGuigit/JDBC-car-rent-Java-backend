/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Carro;
import br.unesp.rc.locadoraCarros.utils.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author guilh
 */
public class CarroDAOImpl implements CarroDAO {
    
    public CarroDaoImpl(){
    }
    
    @Override
    public boolean save(Carro carro){
        boolean b = false;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        String placa = "";
        
        con = FabricaConexao.getConexao();
        
        if(con != null){
            try{
                // Start da transação
                con.setAutoCommit(false);
                
                pstm = con.prepareStatement(INSERT_CARRO, PreparedStatement.RETURN_GENERATED_KEYS);
                
                pstm.setString(1, carro.getPlaca());
                pstm.setString(2, carro.getNome());
                pstm.setInt(3, carro.getAno());
                pstm.setDouble(4, carro.getQuilometragem());
                pstm.setInt(5, carro.getPatrimonio());
                pstm.setString(6, carro.getStatus());
                pstm.setInt(7, carro.getMaxDiasLocacao());
                pstm.setString(8, carro.getMarca());
                pstm.setString(9, carro.getQrCode());
                pstm.setInt(10, carro.getIdCategoria());
                
                //Executar instrução SQL
                pstm.executeUpdate();
                
                //ResultSet com a chave gerada
                res = pstm.getGeneratedKeys();
                
                //Recuperação da chave gerada
                while (res.next()){
                    placa = res.getString(1);
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
    public Carro findCar(String placa){
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet res = null;
        Carro carro = null;
        
        con = FabricaConexao.getConexao();
        
        if(con != null){
            try{
                pstm = con.prepareStatement(FIND_CARRO_PLACA);
                pstm.setString(1, placa);
                res = pstm.executeQuery();
                
                // Recuperação do objeto
                while(res.next()){
                    carro = new Carro();
                    carro.setPlaca(res.getString(1));
                    carro.setNome(res.getString(2));
                    carro.setAno(res.getInt(3));
                    carro.setQuilometragem(res.getDouble(4));
                    carro.setPatrimonio(res.getInt(5));
                    carro.setStatus(res.getString(6));
                    carro.setMaxDiasLocacao(res.getInt(7));
                    carro.setMarca(res.getString(8));
                    carro.setQrCode(res.getString(9));
                    carro.setIdCategoria(res.getInt(10));
                }
                
            }catch(SQLException ex){
                    System.out.println("Message " + ex);
            }
        }
        
        return carro;
    }
        
}
    
    
