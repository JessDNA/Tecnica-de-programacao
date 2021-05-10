/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jogan
 */
public class cadastroTest {
    
    public cadastroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getId method, of class cadastro.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        cadastro instance = new cadastro();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class cadastro.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        cadastro instance = new cadastro();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class cadastro.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        cadastro instance = new cadastro();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class cadastro.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        cadastro instance = new cadastro();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSenha method, of class cadastro.
     */
    @Test
    public void testGetSenha() {
        System.out.println("getSenha");
        cadastro instance = new cadastro();
        String expResult = "";
        String result = instance.getSenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSenha method, of class cadastro.
     */
    @Test
    public void testSetSenha() {
        System.out.println("setSenha");
        String senha = "";
        cadastro instance = new cadastro();
        instance.setSenha(senha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfirmacaosenha method, of class cadastro.
     */
    @Test
    public void testGetConfirmacaosenha() {
        System.out.println("getConfirmacaosenha");
        cadastro instance = new cadastro();
        String expResult = "";
        String result = instance.getConfirmacaosenha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfirmacaosenha method, of class cadastro.
     */
    @Test
    public void testSetConfirmacaosenha() {
        System.out.println("setConfirmacaosenha");
        String confirmacaosenha = "";
        cadastro instance = new cadastro();
        instance.setConfirmacaosenha(confirmacaosenha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
