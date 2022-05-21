/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import br.unesp.rc.locadoraCarros.generator.InstanceGenerator;

import br.unesp.rc.locadoraCarros.model.Carro;
import br.unesp.rc.locadoraCarros.model.Categoria;

import br.unesp.rc.locadoraCarros.service.CarroService;
import br.unesp.rc.locadoraCarros.service.ServiceFactory;
import br.unesp.rc.locadoraCarros.service.CategoriaService;

import com.mifmif.common.regex.Generex;


/**
 *
 * @author guilh
 */
public class InsertMethods {
    
    
    public static void insertExampleCar(){
        
        CarroService cs = ServiceFactory.getCarroService();
        
        // Definir a placa
               
        
        Generex generex = new Generex("[A-Z][A-Z][A-Z]-[0-9][0-9][0-9]");
        final String placa = generex.random();

     /*
        Gerar uma instância persistida
        */
            
        Carro carro = InstanceGenerator.getCarro(placa);
            
        System.out.println(carro);
            
        /*
        Persistir objeto no banco de dados
        */
            
        boolean result = cs.save(carro);
        System.out.println("Result: " + result);
            
    }
    
    
    public static void insertExampleCategory(){
        
        CategoriaService cs = ServiceFactory.getCategoriaService();
        
        
        /* Gerar instancia */
        Categoria category = InstanceGenerator.getCategoria();
        
        System.out.println(category);
        
        /*Persistir no banco*/
        
        boolean result = cs.save(category);
        System.out.println("Result " + result);
        
        
        
    }
    
    
    
    
    
}
