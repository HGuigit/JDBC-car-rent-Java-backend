/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.rc.locadoraCarros.generator;

import br.unesp.rc.locadoraCarros.model.Carro;
import br.unesp.rc.locadoraCarros.model.Categoria;

/**
 *
 * @author guilh
 */
public class InstanceGenerator {
    
    private InstanceGenerator(){
    }
    
    public static Carro getCarro(String placa){
        
        Carro c = new Carro();
        
        c.setPlaca(placa);
        c.setAno(2020);
        c.setMarca("BMW");
        c.setQrCode("23124523523423");
        c.setPatrimonio(100);
        c.setMaxDiasLocacao(12);
        c.setQuilometragem(2000);
        c.setStatus("Alugado");
        c.setNome("Lamborguini");
        c.setIdCategoria(1);
        
        return c;
    }
    
    public static Categoria getCategoria(){
        
        Categoria cat = new Categoria();
        
        cat.setDescricao("Conversível esportivo com teto retrátil.");
        cat.setNome("Tunado");
        cat.setPrecoDiario(2000);
        
        return cat;
    }
    
        
}
