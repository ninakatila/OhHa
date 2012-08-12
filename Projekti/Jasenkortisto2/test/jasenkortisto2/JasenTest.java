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
public class JasenTest {
    
    public JasenTest() {
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
     * Metodin asetaEtunimi testaus.
     */
    @Test
    public void testAsetaEtunimi() {
        System.out.println("asetaEtunimi");
        String etunimi = "Tauno";
        Jasen instance = new Jasen();
        instance.asetaEtunimi(etunimi);
    }

    /**
     * Metodin asetaSukunimi testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaSukunimi() {
        System.out.println("asetaSukunimi");
        String sukunimi = "Testaaja";
        Jasen instance = new Jasen();
        instance.asetaSukunimi(sukunimi);
    }

    /**
     * Metodin asetaOsoite testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaOsoite() {
        System.out.println("asetaOsoite");
        String osoite = "jokukatu";
        Jasen instance = new Jasen();
        instance.asetaOsoite(osoite);
    }

    /**
     * Metodin asetaPostinumero testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaPostinumero() {
        System.out.println("asetaPostinumero");
        String postinumero = "00100";
        Jasen instance = new Jasen();
        instance.asetaPostinumero(postinumero);
    }

    /**
     * Metodin asetaKaupunki testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaKaupunki() {
        System.out.println("asetaKaupunki");
        String kaupunki = "Helsinki";
        Jasen instance = new Jasen();
        instance.asetaKaupunki(kaupunki);
    }

    /**
     * Metodin asetaSposti testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaSposti() {
        System.out.println("asetaSposti");
        String sposti = "tauno.testaaja@testi.fi";
        Jasen instance = new Jasen();
        instance.asetaSposti(sposti);
    }

    /**
     * Metodin asetaPuhelin testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaPuhelin() {
        System.out.println("asetaPuhelin");
        String puhelin = "050123456";
        Jasen instance = new Jasen();
        instance.asetaPuhelin(puhelin);
    }

    /**
     * Metodin asetaSyntymapv testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaSyntymapv() {
        System.out.println("asetaSyntymapv");
        int syntymapv = 15;
        Jasen instance = new Jasen();
        instance.asetaSyntymapv(syntymapv);
    }

    /**
     * Metodin asetaSyntymakk testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaSyntymakk() {
        System.out.println("asetaSyntymakk");
        int syntymakk = 11;
        Jasen instance = new Jasen();
        instance.asetaSyntymakk(syntymakk);
    }

    /**
     * Metodin asetaSyntymavuosi testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaSyntymavuosi() {
        System.out.println("asetaSyntymavuosi");
        int syntymavuosi = 1980;
        Jasen instance = new Jasen();
        instance.asetaSyntymavuosi(syntymavuosi);
    }

    /**
     * Metodin asetaLiittymisvuosi testaus, luokassa Jasen.
     */
    @Test
    public void testAsetaLiittymisvuosi() {
        System.out.println("asetaLiittymisvuosi");
        int liittymisvuosi = 2012;
        Jasen instance = new Jasen();
        instance.asetaLiittymisvuosi(liittymisvuosi);
    }

    /**
     * Metodin haeEtunimi testaus, luokassa Jasen.
     */
    @Test
    public void testHaeEtunimi() {
        System.out.println("haeEtunimi");
        String etunimi = "Teppo";
        Jasen instance = new Jasen();
        String expResult = "Teppo";
        String result = instance.haeEtunimi(etunimi);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeSukunimi testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSukunimi() {
        System.out.println("haeSukunimi");
        String sukunimi = "Testaaja";
        Jasen instance = new Jasen();
        String expResult = "Testaaja";
        String result = instance.haeSukunimi(sukunimi);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeOsoite testaus, luokassa Jasen.
     */
    @Test
    public void testHaeOsoite() {
        System.out.println("haeOsoite");
        String osoite = "jokutoinenkatu";
        Jasen instance = new Jasen();
        String expResult = "jokutoinenkatu";
        String result = instance.haeOsoite(osoite);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haePostinumero testaus, luokassa Jasen.
     */
    @Test
    public void testHaePostinumero() {
        System.out.println("haePostinumero");
        String postinumero = "00200";
        Jasen instance = new Jasen();
        String expResult = "00200";
        String result = instance.haePostinumero(postinumero);
   }

    /**
     * Metodin haeKaupunki testaus, luokassa Jasen. 
     */
    @Test
    public void testHaeKaupunki() {
        System.out.println("haeKaupunki");
        String kaupunki = "Helsinki";
        Jasen instance = new Jasen();
        String expResult = "Helsinki";
        String result = instance.haeKaupunki(kaupunki);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeSposti testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSposti() {
        System.out.println("haeSposti");
        String sposti = "teppo.testaaja@testi.fi";
        Jasen instance = new Jasen();
        String expResult = "teppo.testaaja@testi.fi";
        String result = instance.haeSposti(sposti);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haePuhelin testaus, luokassa Jasen.
     */
    @Test
    public void testHaePuhelin() {
        System.out.println("haePuhelin");
        String puhelin = "050654321";
        Jasen instance = new Jasen();
        String expResult = "050654321";
        String result = instance.haePuhelin(puhelin);
    }

    /**
     * Metodin haeSyntymapv testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSyntymapv() {
        System.out.println("haeSyntymapv");
        int syntymapv = 3;
        Jasen instance = new Jasen();
        int expResult = 3;
        int result = instance.haeSyntymapv(syntymapv);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeSyntymakk testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSyntymakk() {
        System.out.println("haeSyntymakk");
        int syntymakk = 3;
        Jasen instance = new Jasen();
        int expResult = 3;
        int result = instance.haeSyntymakk(syntymakk);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeSyntymavuosi testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSyntymavuosi() {
        System.out.println("haeSyntymavuosi");
        int syntymavuosi = 2003;
        Jasen instance = new Jasen();
        int expResult = 2003;
        int result = instance.haeSyntymavuosi(syntymavuosi);
        assertEquals(expResult, result);
    }

    /**
     * Metodin haeLiittymisvuosi testaus, luokassa Jasen. 
     */
    @Test
    public void testHaeLiittymisvuosi() {
        System.out.println("haeLiittymisvuosi");
        int liittymisvuosi = 2012;
        Jasen instance = new Jasen();
        int expResult = 2012;
        int result = instance.haeLiittymisvuosi(liittymisvuosi);
        assertEquals(expResult, result);
    }

}
