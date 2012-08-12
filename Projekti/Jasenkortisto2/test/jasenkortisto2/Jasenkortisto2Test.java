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
        
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.asetaJasen(new Jasen ("Taina","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",8,8,1979,2012));
    }

}
