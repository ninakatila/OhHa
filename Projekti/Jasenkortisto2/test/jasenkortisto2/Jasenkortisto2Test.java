/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jasenkortisto2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nina.katila
 */
public class Jasenkortisto2Test {
    
    public Jasenkortisto2Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of asetaJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testAsetaJasen() {
        System.out.println("asetaJasen");
        Jasen uusiJasen = null;
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.asetaJasen(uusiJasen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haeJasenlistassa method, of class Jasenkortisto2.
     */
    @Test
    public void testHaeJasenlistassa() {
        System.out.println("haeJasenlistassa");
        int jasenlistassa = 0;
        Jasenkortisto2 instance = new Jasenkortisto2();
        int expResult = 0;
        int result = instance.haeJasenlistassa(jasenlistassa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of haeJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testHaeJasen() {
        System.out.println("haeJasen");
        int indeksi = 0;
        Jasenkortisto2 instance = new Jasenkortisto2();
        Jasen expResult = null;
        Jasen result = instance.haeJasen(indeksi);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
