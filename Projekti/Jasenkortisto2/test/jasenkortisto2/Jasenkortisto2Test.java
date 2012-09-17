/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jasenkortisto2;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
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
     * Test of etsiJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testEtsiJasen() {
        System.out.println("etsiJasen");
        String sukunimi="Katila";
        Jasen[] expResult = null;
        Jasen[] result = Jasenkortisto2.etsiJasen();
        assertEquals(expResult,result);
        
    }

    /**
     * Test of lueKortistosta method, of class Jasenkortisto2.
     */
    @Test
    public void testLueKortistosta() {
        System.out.println("lueKortistosta");
        Jasenkortisto2.lueKortistosta();
       
    }

    /**
     * Test of kirjoitaKortistoon method, of class Jasenkortisto2.
     */
    @Test
    public void testKirjoitaKortistoon() throws Exception {
        System.out.println("kirjoitaKortistoon");
        Jasenkortisto2.kirjoitaKortistoon();
        
    }

    /**
     * Test of actionListener method, of class Jasenkortisto2.
     */
    @Test
    public void testActionListener() {
        System.out.println("actionListener");
        ActionListener kuuntelija = null;
        ActionListener expResult = null;
        ActionListener result = Jasenkortisto2.actionListener(kuuntelija);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of listListener method, of class Jasenkortisto2.
     */
    @Test
    public void testListListener() {
        System.out.println("listListener");
        ListSelectionListener listakuuntelija = null;
        ListSelectionListener expResult = null;
        ListSelectionListener result = Jasenkortisto2.listListener(listakuuntelija);
        
    }

    /**
     * Test of actionPerformed method, of class Jasenkortisto2.
     */
    @Test
    public void testActionPerformed() {
        System.out.println("actionPerformed");
        ActionEvent e = null;
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.actionPerformed(e);
      
    }

    /**
     * Test of lisaaJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testLisaaJasen() {
        System.out.println("lisaaJasen");
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.lisaaJasen();
       
    }


    /**
     * Test of main method, of class Jasenkortisto2.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Jasenkortisto2.main(args);
        
    }

    /**
     * Test of tulostaJaosvetajalle method, of class Jasenkortisto2.
     */
    @Test
    public void testTulostaJaosvetajalle() throws Exception {
        System.out.println("tulostaJaosvetajalle");
        Jasenkortisto2.tulostaJaosvetajalle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tulostaMaksuryhmanJasenet method, of class Jasenkortisto2.
     */
    @Test
    public void testTulostaMaksuryhmanJasenet() throws Exception {
        System.out.println("tulostaMaksuryhmanJasenet");
        Jasenkortisto2.tulostaMaksuryhmanJasenet();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listaValinta method, of class Jasenkortisto2.
     */
    @Test
    public void testListaValinta() {
        System.out.println("listaValinta");
        ListSelectionEvent event = null;
        Jasenkortisto2 instance = new Jasenkortisto2();
        instance.listaValinta(event);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of muutaJasen method, of class Jasenkortisto2.
     */
    @Test
    public void testMuutaJasen() {
        System.out.println("muutaJasen");
        Jasenkortisto2.muutaJasen();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
