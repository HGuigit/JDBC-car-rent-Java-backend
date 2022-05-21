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


/**
 *
 * @author guilh
 */
public class Demo {
    
    public static void main(String[] args) {
        
        
        String OPTION1 = "INSERIR CARRO";
        String OPTION2 = "INSERIR CATEGORIA";
        
        String OPTION = OPTION2;
        
        if(OPTION == OPTION1){
        
            final String placa = "XPV-097";

            CarroService cs = ServiceFactory.getCarroService();

            /*
            Consultar um carro pela placa
            */

            Carro c = cs.findCar(placa);
            
           System.out.println(c);
            if(c == null){
               InsertMethods.insertExampleCar();
            }
        }
        
        if(OPTION == OPTION2){
            
            final int idCategoria = 1;
            
            CategoriaService cs = ServiceFactory.getCategoriaService();
            
            /*
            Consultar uma categoria pelo id
            */
            
            Categoria cat = cs.findcat(1);
            
            
            
            if(cat == null){
                InsertMethods.insertExampleCategory();
            }
            
        }
        
        
        
    }
    
    
    
}
