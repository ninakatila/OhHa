
package jasenkortisto2;

/**
 *
 * @author nina.katila
 */
public class Jasen {
    /**
     * --- piilotettu tietorakenteen toteutus: ---
     */   
    private int jasennumero, liittymisvuosi, syntymapv, syntymakk, syntymavuosi;
    private String etunimi, sukunimi, osoite, postinumero, kaupunki, sposti, puhelin;
           
    /**
     * konstruktori näin aluksi näillä parametreilla
     *
     * @param etunimi
     * @param sukunimi
     * @param osoite
     * @param kaupunki
     * @param postinumero
     * @param sposti
     * @param puhelin
     * @param syntymapv
     * @param syntymakk
     * @param syntymavuosi
     * @param liittymisvuosi
     */
   
    public Jasen(int jasennumero, String etunimi, String sukunimi,
            String osoite, String postinumero, String kaupunki, String sposti,
            String puhelin,int syntymapv, int syntymakk, int syntymavuosi,
            int liittymisvuosi){
        this.jasennumero=jasennumero;
        this.etunimi=etunimi;
        this.sukunimi=sukunimi;
        this.osoite=osoite;
        this.postinumero=postinumero;
        this.kaupunki=kaupunki;
        this.sposti=sposti;
        this.puhelin=puhelin;
        this.syntymapv=syntymapv;
        this.syntymakk=syntymakk;
        this.syntymavuosi=syntymavuosi;
        this.liittymisvuosi=liittymisvuosi;
        
    }
    /**
     * parametriton konstruktori jasenikkuna-luokkaa varten
     */
     public Jasen(){
    
    }
     /**
      * 
      * @param jasennumero 
      */
  public void asetaJasennumero (int jasennumero){
      this.jasennumero=jasennumero;
  }
    /**
     * 
     * @param etunimi 
     */
    public void asetaEtunimi (String etunimi){
        this.etunimi=etunimi;
    }    
    /**
     * 
     * @param sukunimi 
     */
    public void asetaSukunimi (String sukunimi){
        this.sukunimi=sukunimi;
    }    
    /**
     * 
     * @param osoite 
     */
    public void asetaOsoite (String osoite){
        this.osoite=osoite;
    }
    /**
     * 
     * @param postinumero 
     */
    public void asetaPostinumero (String postinumero){
        this.postinumero=postinumero;
    }
    /**
     * 
     * @param kaupunki 
     */
    public void asetaKaupunki (String kaupunki){
        this.kaupunki=kaupunki;
    }
    /**
     * 
     * @param sposti 
     */
    public void asetaSposti (String sposti){
        this.sposti=sposti;
    }
    /**
     * 
     * @param puhelin 
     */
    public void asetaPuhelin (String puhelin){
        this.puhelin=puhelin;
    }
    /**
     * 
     * @param syntymapv 
     */
    public void asetaSyntymapv(int syntymapv){
        if (syntymapv>=1 && syntymapv<=31){
            this.syntymapv=syntymapv;   
        }
        else System.out.println("virheellinen arvo");
    }
    /**
     * 
     * @param syntymakk 
     */
    public void asetaSyntymakk (int syntymakk){
        if (syntymakk>=1 && syntymakk<=12){
            this.syntymakk=syntymakk;
        }
        else System.out.println("virheellinen arvo");
    }
    /**
     * 
     * @param syntymavuosi 
     */
    public void asetaSyntymavuosi (int syntymavuosi){
        if (syntymavuosi>=1900 && syntymavuosi<=2100){
            this.syntymavuosi=syntymavuosi;
        }
        else System.out.println("virheellinen arvo");
    }
    /**
     * 
     * @param liittymisvuosi 
     */
    public void asetaLiittymisvuosi (int liittymisvuosi){
        if (liittymisvuosi>=1965 && liittymisvuosi<=2100){
            this.liittymisvuosi=liittymisvuosi;
        }
        else System.out.println("virheellinen arvo");
    
    }
    /**
     * 
     * @param jasennumero
     * @return 
     */
    public int haeJasennumero (int jasennumero){
        return jasennumero;
    }
    /**
     * 
     * @param etunimi
     * @return 
     */
   
    public String haeEtunimi (String etunimi){
        return etunimi;
    }
    /**
     * 
     * @param sukunimi
     * @return 
     */
    public String haeSukunimi (String sukunimi){
        return sukunimi;
    }
    /**
     * 
     * @param osoite
     * @return 
     */
    public String haeOsoite (String osoite){
        return osoite;
    }
    /**
     * 
     * @param postinumero
     * @return 
     */
    public String haePostinumero (String postinumero){
        return postinumero;
    }
    /**
     * 
     * @param kaupunki
     * @return 
     */
    public String haeKaupunki (String kaupunki){
        return kaupunki;
    }
    /**
     * 
     * @param sposti
     * @return 
     */
    public String haeSposti (String sposti){
        return sposti;
    }
    /**
     * 
     * @param puhelin
     * @return 
     */
    public String haePuhelin (String puhelin){
        return puhelin;
    }
    /**
     * 
     * @param syntymapv
     * @return 
     */
    public int haeSyntymapv (int syntymapv){
        return syntymapv;
    }
    /**
     * 
     * @param syntymakk
     * @return 
     */
    public int haeSyntymakk (int syntymakk){
        return syntymakk;
    }
    /**
     * 
     * @param syntymavuosi
     * @return 
     */
    public int haeSyntymavuosi (int syntymavuosi){
        return syntymavuosi;
    }
    /**
     * 
     * @param liittymisvuosi
     * @return 
     */
   public int haeLiittymisvuosi (int liittymisvuosi){
       return liittymisvuosi;
   }
    
   /**
    * 
    * @return 
    */
    public String toString(){
        return (this.jasennumero+ "," +this.etunimi+ ", "+this.sukunimi+", "+
                this.osoite+", "+this.postinumero+", "+this.kaupunki+", "+
                this.sposti+", "+this.puhelin+", "+this.syntymapv+", "
                +this.syntymakk+", "+this.syntymavuosi+", "+this.liittymisvuosi);
    }
}