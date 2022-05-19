/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo;

import br.unesp.rc.locadoraCarros.generator.InstanceGenerator;
import br.unesp.rc.locadoraCarros.model.Carro;
import br.unesp.rc.locadoraCarros.service.CarroService;
import br.unesp.rc.locadoraCarros.service.ServiceFactory;


/**
 *
 * @author guilh
 */
public class Demo {
    
    public static void main(String[] args) {
        
        final String placa = "AVW-034";
        
        CarroService cs = ServiceFactory.getCarroService();
        
        /*
        Consultar um carro pela placa
        */
        
        Carro c = cs.findCar(placa);
        
        if(c == null){
            /*
            Gerar uma instância persistida
            */
            
            Carro carro = InstanceGenerator.getCarro(placa);
            
            System.out.println(carro);
            
            /*
            Persistir objeto no banco de dados
            */
            
            
            
        } else{
            System.out.println("Carro não encontrado! Não faça nada!");
        }
        
        
        
    }
    
}
