/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Categoria;

/**
 *
 * @author Marina
 */
public interface CategoriaDAO {
    
    final String INSERT_CATEGORIA = "INSERT INTO categoria VALUES (?, ?, ?, ?)";
    
    final String FIND_CATEGORIA_ID = "SELECT * FROM carro WHERE idCategoria='?'";
    
    public boolean save(Categoria categoria);
    
    public Categoria findCat(int idCategoria);
}
