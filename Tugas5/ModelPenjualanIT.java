/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan;

import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author N. Jeriano
 */
public class ModelPenjualanIT {
    
    public ModelPenjualanIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of countSubtotal method, of class ModelPenjualan.
     */
    @Test
    public void testCountSubtotal() {
        System.out.println("countSubtotal");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.countSubtotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of countPPN method, of class ModelPenjualan.
     */
    @Test
    public void testCountPPN() {
        System.out.println("countPPN");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.countPPN();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of countTotal method, of class ModelPenjualan.
     */
    @Test
    public void testCountTotal() {
        System.out.println("countTotal");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.countTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of getSubTotal method, of class ModelPenjualan.
     */
    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setSubTotal method, of class ModelPenjualan.
     */
    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double subTotal = 0.0;
        ModelPenjualan instance = new ModelPenjualan();
        instance.setSubTotal(subTotal);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPpn method, of class ModelPenjualan.
     */
    @Test
    public void testGetPpn() {
        System.out.println("getPpn");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.getPpn();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setPpn method, of class ModelPenjualan.
     */
    @Test
    public void testSetPpn() {
        System.out.println("setPpn");
        double ppn = 0.0;
        ModelPenjualan instance = new ModelPenjualan();
        instance.setPpn(ppn);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTotal method, of class ModelPenjualan.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        ModelPenjualan instance = new ModelPenjualan();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setTotal method, of class ModelPenjualan.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        ModelPenjualan instance = new ModelPenjualan();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTabel method, of class ModelPenjualan.
     */
    @Test
    public void testGetTabel() {
       
    }

    /**
     * Test of setTabel method, of class ModelPenjualan.
     */
    @Test
    public void testSetTabel() {
        System.out.println("setTabel");
        DefaultTableModel tabel = null;
        ModelPenjualan instance = new ModelPenjualan();
        instance.setTabel(tabel);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
