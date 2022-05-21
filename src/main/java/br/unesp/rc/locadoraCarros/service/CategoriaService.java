/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unesp.rc.locadoraCarros.service;

import br.unesp.rc.locadoraCarros.model.Categoria;

/**
 *
 * @author guilh
 */
public interface CategoriaService {
    
    boolean save(Categoria entity);
    
    Categoria findcat(int idCategoria);
    
}
