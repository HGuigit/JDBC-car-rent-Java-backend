/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.service;

import br.unesp.rc.locadoraCarros.dao.DaoFactory;
import br.unesp.rc.locadoraCarros.dao.CategoriaDAO;
import br.unesp.rc.locadoraCarros.dao.CategoriaDAOImpl;
import br.unesp.rc.locadoraCarros.model.Categoria;

/**
 *
 * @author guilh
 */
public class CategoriaServiceImpl implements CategoriaService{
    
    private CategoriaDAO categoriaDao;
    
    public CategoriaServiceImpl(){
        this.categoriaDao = DaoFactory.getCategoriaDao();
    }
    
    @Override
    public boolean save(Categoria entity){
        boolean b = false;
        if(entity != null){
           b = this.categoriaDao.save(entity);
        }
        return b;
    }
    
    @Override
    public Categoria findcat(int idCategoria){
        return this.categoriaDao.findCat(idCategoria);
    }
}
