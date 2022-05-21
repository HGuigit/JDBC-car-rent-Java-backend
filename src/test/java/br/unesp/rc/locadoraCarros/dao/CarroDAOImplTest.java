/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Carro;
import com.mifmif.common.regex.Generex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import br.unesp.rc.locadoraCarros.generator.InstanceGenerator;

/**
 *
 * @author Marina
 */
public class CarroDAOImplTest {
    
    public CarroDAOImplTest() {
    }

    /**
     * Test of save method, of class CarroDAOImpl.
     */
    @Test
    public void testSave() {
        Generex generex = new Generex("[A-Z][A-Z][A-Z]-[0-9][0-9][0-9]");
        String randomStr = generex.random();
        System.out.println("save");
        Carro carro = InstanceGenerator.getCarro(randomStr); //("12", "nnn", 1615, 12.345, 123456, "abcdefg", 12345678, "jujuba", "quadrado" , 1234);
        CarroDAOImpl instance = new CarroDAOImpl();
        boolean expResult = true;
        boolean result = instance.save(carro);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCar method, of class CarroDAOImpl.
     */
    @Test
    public void testFindCar() {
        Generex generex = new Generex("[A-Z][A-Z][A-Z]-[0-9][0-9][0-9]");
        System.out.println("findCar");
        String placa = generex.random();
        CarroDAOImpl instance = new CarroDAOImpl();
        boolean expResult = false;
        Carro result = instance.findCar(placa);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
