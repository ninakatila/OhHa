
package jasenkortisto2;

/**
 *
 * @author nina.katila
 */
public class Jasen {
    /** kentät  */    
    private int liittymisvuosi, syntymapv, syntymakk, syntymavuosi;
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
   
    public Jasen(String etunimi, String sukunimi,
            String osoite, String postinumero, String kaupunki, String sposti,
            String puhelin,int syntymapv, int syntymakk, int syntymavuosi,
            int liittymisvuosi){
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
     /**setterit, lisätään myöhemmin lisää*/
       
    public void asetaEtunimi (String etunimi){
        this.etunimi=etunimi;
    }
    public void asetaSukunimi (String sukunimi){
        this.sukunimi=sukunimi;
    }
    public void asetaOsoite (String osoite){
        this.osoite=osoite;
    }
    public void asetaPostinumero (String postinumero){
        this.postinumero=postinumero;
    }
    public void asetaKaupunki (String kaupunki){
        this.kaupunki=kaupunki;
    }
    public void asetaSposti (String sposti){
        this.sposti=sposti;
    }
    public void asetaPuhelin (String puhelin){
        this.puhelin=puhelin;
    }
    public void asetaSyntymapv(int syntymapv){
        if (syntymapv>=1 && syntymapv<=31){
            this.syntymapv=syntymapv;   
        }
        else System.out.println("virheellinen arvo");
    }
    public void asetaSyntymakk (int syntymakk){
        if (syntymakk>=1 && syntymakk<=12){
            this.syntymakk=syntymakk;
        }
        else System.out.println("virheellinen arvo");
    }
    public void asetaSyntymavuosi (int syntymavuosi){
        if (syntymavuosi>=1900 && syntymavuosi<=2100){
            this.syntymavuosi=syntymavuosi;
        }
        else System.out.println("virheellinen arvo");
    }
    public void asetaLiittymisvuosi (int liittymisvuosi){
        if (liittymisvuosi>=1965 && liittymisvuosi<=2100){
            this.liittymisvuosi=liittymisvuosi;
        }
        else System.out.println("virheellinen arvo");
    }
    
    /**getterit, lisätään myöhemmin lisää*/
   
    public String haeEtunimi (String etunimi){
        return etunimi;
    }
    public String haeSukunimi (String sukunimi){
        return sukunimi;
    }
    public String haeOsoite (String osoite){
        return osoite;
    }
    public String haePostinumero (String postinumero){
        return postinumero;
    }
    public String haeKaupunki (String kaupunki){
        return kaupunki;
    }
    public String haeSposti (String sposti){
        return sposti;
    }
    public String haePuhelin (String puhelin){
        return puhelin;
    }
    public int haeSyntymapv (int syntymapv){
        return syntymapv;
    }
    public int haeSyntymakk (int syntymakk){
        return syntymakk;
    }
    public int haeSyntymavuosi (int syntymavuosi){
        return syntymavuosi;
    }
   public int haeLiittymisvuosi (int liittymisvuosi){
       return liittymisvuosi;
   }
    
   
    public String toString(){
        return (this.etunimi+ ", "+this.sukunimi+", "+
                this.osoite+", "+this.postinumero+", "+this.kaupunki+", "+
                this.sposti+", "+this.puhelin+", "+this.syntymapv+", "
                +this.syntymakk+", "+this.syntymavuosi+", "+this.liittymisvuosi);
    }
    public static void main(String[]args){//testausta varten main-metodi
        Jasen jasen1=new Jasen ("Teppo","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",31,12,1999,2012);
        System.out.println(jasen1);
    }
}

    