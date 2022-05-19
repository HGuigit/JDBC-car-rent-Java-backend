/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.service;

import br.unesp.rc.locadoraCarros.dao.DaoFactory;
import br.unesp.rc.locadoraCarros.dao.CarroDAO;
import br.unesp.rc.locadoraCarros.dao.CarroDAOImpl;
import br.unesp.rc.locadoraCarros.model.Carro;


/**
 *
 * @author guilh
 */
public class CarroServiceImpl implements CarroService {
    
    private CarroDAO carroDao;
    
    public CarroServiceImpl(){
        this.carroDao = DaoFactory.getCarroDao();
    }
    
    @Override
    public boolean save(Carro entity){
        boolean b = false;
        
        if(entity != null){
            b = this.carroDao.save(entity);
        }
        return b;
    }
    
    @Override
    public Carro findCar(String placa){
        return this.carroDao.findCar(placa);
    }
}
