/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.service;

/**
 *
 * @author guilh
 */
public class ServiceFactory {
    
    private ServiceFactory(){
    }
    
    public static CarroService getCarroService(){
        return new CarroServiceImpl();
    }
        
}
