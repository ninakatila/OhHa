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
public class JasenTest {
    
    public JasenTest() {
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
     * Metodin asetaMotocrossJaostoon testaus
     */
    @Test
    public void testAsetaMotocrossJaostoon() {
        System.out.println("asetaMotocrossJaostoon");
        boolean motocross = true;
        Jasen instance = new Jasen();
        instance.asetaMotocrossJaostoon(motocross);
    }
    /**
     * Metodin asetaEnduroJaostoon testaus
     */
    @Test
    public void testAsetaEnduroJaostoon() {
        System.out.println("asetaEnduroJaostoon");
        boolean enduro = true;
        Jasen instance = new Jasen();
        instance.asetaEnduroJaostoon(enduro);
    }
    /**
     * Metodin asetaTrialJaostoon testaus
     */
    @Test
    public void testAsetaTrialJaostoon() {
        System.out.println("asetaTrialJaostoon");
        boolean trial = true;
        Jasen instance = new Jasen();
        instance.asetaTrialJaostoon(trial);
    }
    /**
     * Metodin asetaSupermotoJaostoon testaus
     */
    @Test
    public void testAsetaSupermotoJaostoon() {
        System.out.println("asetaSupermotoJaostoon");
        boolean supermoto = true;
        Jasen instance = new Jasen();
        instance.asetaSupermotoJaostoon(supermoto);
    }
    /**
     * Metodin asetaStuntJaostoon testaus
     */
    @Test
    public void testAsetaStuntJaostoon() {
        System.out.println("asetaStuntJaostoon");
        boolean stunt = true;
        Jasen instance = new Jasen();
        instance.asetaStuntJaostoon(stunt);
    }
    /**
     * Metodin asetaMxjJaostoon testaus
     */
    @Test
    public void testAsetaMxjJaostoon() {
        System.out.println("asetaMxjJaostoon");
        boolean mxj = true;
        Jasen instance = new Jasen();
        instance.asetaMxjJaostoon(mxj);
    }
    /**
     * Metodin asetaMx50Jaostoon testaus
     */
    @Test
    public void testAsetaMx50Jaostoon() {
        System.out.println("asetaMx50Jaostoon");
        boolean mx50 = true;
        Jasen instance = new Jasen();
        instance.asetaMx50Jaostoon(mx50);
    }
    /**
     * Metodin asetaMx65Jaostoon testaus
     */
    @Test
    public void testAsetaMx65Jaostoon() {
        System.out.println("asetaMx65Jaostoon");
        boolean mx65 = true;
        Jasen instance = new Jasen();
        instance.asetaMx65Jaostoon(mx65);
    }
    /**
     * Metodin asetaMx85Jaostoon testaus
     */
    @Test
    public void testAsetaMx85Jaostoon() {
        System.out.println("asetaMx85Jaostoon");
        boolean mx85 = true;
        Jasen instance = new Jasen();
        instance.asetaMx85Jaostoon(mx85);
    }
    /**
     * Metodin asetaAikuisetMaksuryhmaan testaus
     */
    @Test
    public void testAsetaAikuisetMaksuryhmaan() {
        System.out.println("asetaAikuisetMaksuryhmaan");
        boolean aikuiset = true;
        Jasen instance = new Jasen();
        instance.asetaAikuisetMaksuryhmaan(aikuiset);
    }
    /**
     * Metodin asetaJunioritMaksuryhmaan testaus
     */
    @Test
    public void testAsetaJunioritMaksuryhmaan() {
        System.out.println("asetaAikuisetMaksuryhmaan");
        boolean juniorit = true;
        Jasen instance = new Jasen();
        instance.asetaJunioritMaksuryhmaan(juniorit);
    }
    /**
     * Metodin asetaNaisetMaksuryhmaan testaus
     */
    @Test
    public void testAsetaNaisetMaksuryhmaan() {
        System.out.println("asetaNaisetMaksuryhmaan");
        boolean naiset = true;
        Jasen instance = new Jasen();
        instance.asetaNaisetMaksuryhmaan(naiset);
    } 
    /**
     * Metodin asetaAinaisjasenetMaksuryhmaan testaus
     */
    @Test
    public void testAsetaAinaisjasenetMaksuryhmaan() {
        System.out.println("asetaAinaisjasenetMaksuryhmaan");
        boolean ainaisjasenet = true;
        Jasen instance = new Jasen();
        instance.asetaAinaisjasenetMaksuryhmaan(ainaisjasenet);
    }
    /**
     * Metodin asetaJasenmaksu testaus
     */
    @Test
    public void testAsetaJasenamaksu() {
        System.out.println("asetaJasenmaksu");
        boolean jasenmaksu = true;
        Jasen instance = new Jasen();
        instance.asetaJasenmaksu(jasenmaksu);
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
    /**
     * Metodin haeMotocrossJaostosta testaus, luokassa Jasen.
     */
     @Test
    public void testHaeMotocrossJaostosta() {
        System.out.println("haeMotocrossJaostosta");
        boolean motocross = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeMotocrossJaostosta(motocross);
        assertEquals(expResult, result);
    }
     /**
      * Metodin haeEnduroJaostosta testaus, luokassa Jasen.
      */
    @Test
    public void testHaeEnduroJaostosta() {
        System.out.println("hae*EnduroJaostosta");
        boolean enduro = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeEnduroJaostosta(enduro);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeTrialJaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeTrialJaostosta() {
        System.out.println("haeTrialJaostosta");
        boolean trial = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeTrialJaostosta(trial);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeSupermotoJaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeSupermotoJaostosta() {
        System.out.println("haeSupermotoJaostosta");
        boolean supermoto = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeSupermotoJaostosta(supermoto);
        assertEquals(expResult, result);
    }    
    /**
     * Metodin haeStuntJaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeStuntJaostosta() {
        System.out.println("haeStuntJaostosta");
        boolean stunt = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeStuntJaostosta(stunt);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeMxjJaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeMxjJaostosta() {
        System.out.println("haeMxjJaostosta");
        boolean mxj = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeMxjJaostosta(mxj);
        assertEquals(expResult, result);
    }  
    /**
     * Metodin haeMx50Jaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeMx50Jaostosta() {
        System.out.println("haeMx50Jaostosta");
        boolean mx50 = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeMx50Jaostosta(mx50);
        assertEquals(expResult, result);
    } 
    /**
     * Metodin haeMx65Jaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeMx65Jaostosta() {
        System.out.println("haeMx65Jaostosta");
        boolean mx65 = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeMx65Jaostosta(mx65);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeMx85Jaostosta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeMx85Jaostosta() {
        System.out.println("haeMx85Jaostosta");
        boolean mx85 = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeMx85Jaostosta(mx85);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeAikuisetMaksuryhmasta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeAikuisetMaksuryhmasta() {
        System.out.println("haeAikuisetMaksuryhmasta");
        boolean aikuiset = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeAikuisetMaksuryhmasta(aikuiset);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeJunioritMaksuryhmasta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeJunioritMaksuryhmasta() {
        System.out.println("haejunioritMaksuryhmasta");
        boolean juniorit = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeJunioritMaksuryhmasta(juniorit);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeNaisetMaksuryhmasta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeNaisetMaksuryhmasta() {
        System.out.println("haeNaisetMaksuryhmasta");
        boolean naiset = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeNaisetMaksuryhmasta(naiset);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeAinaisjasenetMaksuryhmasta testaus, luokassa Jasen.
     */
    @Test
    public void testHaeAinaisjasenetMaksuryhmasta() {
        System.out.println("haeAinaisjasenetMaksuryhmasta");
        boolean ainaisjasenet = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeAinaisjasenetMaksuryhmasta(ainaisjasenet);
        assertEquals(expResult, result);
    }
    /**
     * Metodin haeJasenmaksu testaus, luokassa Jasen.
     */
    @Test
    public void testJasenmaksu() {
        System.out.println("haeJasenmaksu");
        boolean jasenmaksu = true;
        Jasen instance = new Jasen();
        boolean expResult = true;
        boolean result = instance.haeJasenmaksu(jasenmaksu);
        assertEquals(expResult, result);
    }
}
