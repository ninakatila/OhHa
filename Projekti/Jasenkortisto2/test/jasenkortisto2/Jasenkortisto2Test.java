/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jasenkortisto2;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nina.katila
 */
public class Jasenkortisto2Test {
    
    public Jasenkortisto2Test() {
    }

    /**
     * Test of asetaJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testAsetaJasen() {
        System.out.println("asetaJasen");
        
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.asetaJasen(new Jasen (6,"Taina","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",8,8,1979,2012, true,
                true, false, false, false, false, true, false, false,true,false,
                false,false,true));
    }

}
