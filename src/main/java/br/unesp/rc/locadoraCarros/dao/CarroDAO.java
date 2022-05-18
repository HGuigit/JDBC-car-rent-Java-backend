/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Carro;

/**
 *
 * @author guilh
 */
public interface CarroDAO {
    
    final String INSERT_CARRO = "INSERT INTO carro VALUES (?, ?, ?, ?, ?, ?, ?, ?, ? ,?)";
    
    final String DELETE_CARRO = "DELETE FROM carro WHERE placa='?'";
    
    final String FIND_CARRO_PLACA = "SELECT * FROM carro WHERE placa='?'";
    
    final String FIND_CARRO_ANO = "SELECT * FROM carro WHERE ano = '?'";
    
    public boolean save(Carro carro);
    
    public Carro findCar(String placa);
    
    public Carro findCarAno(String ano);
}
