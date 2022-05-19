/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

/**
 *
 * @author guilh
 */
public class DaoFactory {
    
    private DaoFactory(){
    }
    
    public static CarroDAO getCarroDao(){
        return new CarroDAOImpl();
    }
    
    public static CategoriaDAO getCategoriaDao(){
        return new CategoriaDAOImpl();
    }
    
}
