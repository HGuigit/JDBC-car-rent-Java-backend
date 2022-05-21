/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package br.unesp.rc.locadoraCarros.dao;

import br.unesp.rc.locadoraCarros.model.Categoria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Marina
 */
public class CategoriaDAOImplTest {
    
    public CategoriaDAOImplTest() {
    }

    /**
     * Test of save method, of class CategoriaDAOImpl.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Categoria categoria = new Categoria();
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        boolean expResult = true;
        boolean result = instance.save(categoria);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of findCat method, of class CategoriaDAOImpl.
     */
    @Test
    public void testFindCat() {
        System.out.println("findCat");
        int idCategoria = 0;
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        Categoria expResult = null;
        Categoria result = instance.findCat(idCategoria);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
