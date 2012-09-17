
package jasenkortisto2;


/**
 *
 * @author nina.katila
 */
public class Jasen{
    /**
     * --- piilotettu tietorakenteen toteutus: ---
     */   
    protected int jasennumero, liittymisvuosi, syntymapv, syntymakk, syntymavuosi;
    protected String etunimi, sukunimi, osoite, postinumero, kaupunki, sposti, 
            puhelin;
    protected boolean jaos, maksuryhma,motocross,enduro,trial,supermoto,stunt,mxj,mx50,mx65,mx85,
            aikuiset,juniorit,naiset,ainaisjasenet, jasenmaksu;
    
    /**
     * Jasen -luokan konstruktorin parametrit
     *
     * @param jasennumero
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
     * @param motocross 
     * @param enduro
     * @param trial
     * @param supermoto
     * @param stunt
     * @param mxj
     * @param mx50
     * @param mx65
     * @param mx85
     * @param aikuiset
     * @param juniorit
     * @param naiset
     * @param ainaisjasenet
     * @param jasenmaksu
     */
   
    
    public Jasen(int jasennumero, String etunimi, String sukunimi,
            String osoite, String postinumero, String kaupunki, String sposti,
            String puhelin,int syntymapv, int syntymakk, int syntymavuosi,
            int liittymisvuosi, boolean motocross, boolean enduro, boolean trial,
            boolean superomoto, boolean stunt, boolean mxj, boolean mx50,
            boolean mx65, boolean mx85, boolean aikuiset, boolean juniorit,
            boolean naiset, boolean ainaisjasenet, boolean jasenmaksu){
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
        this.motocross=motocross;
        this.enduro=enduro;
        this.trial=trial;
        this.supermoto=supermoto;
        this.mxj=mxj;
        this.mx50=mx50;
        this.mx65=mx65;
        this.mx85=mx85;
        this.aikuiset=aikuiset;
        this.juniorit=juniorit;
        this.naiset=naiset;
        this.ainaisjasenet=ainaisjasenet;
        this.jasenmaksu=jasenmaksu;
        
    }
    /**
     * parametriton konstruktori 
     * 
     */
     public Jasen(){
    
    }
   
     /**
      * asetaJasennumero metodi asettaa jäsenelle jäsennumeron
      * @param jasennumero 
      */
    public void asetaJasennumero(int jasennumero){
        this.jasennumero=jasennumero;
    }
    /**
     * asetaEtunimi metodi asettaa jäsenelle etunimen
     * @param etunimi 
     */
    public void asetaEtunimi (String etunimi){
        this.etunimi=etunimi;
    } 
    
    /**
     * asetaSukunimi metodi asettaa jäsenelle sukunimen
     * @param sukunimi 
     */
    public void asetaSukunimi (String sukunimi){
        this.sukunimi=sukunimi;
    }
    
    /**
     * asetaOsoite metodi asettaa osoitteen, missä jäsen asuu
     * @param osoite 
     */
    public void asetaOsoite (String osoite){
        this.osoite=osoite;
    }
    
    /**
     * asetaPostinumero metodi asettaa postinumeron, missä jäsen asuu
     * @param postinumero 
     */
    public void asetaPostinumero (String postinumero){
        this.postinumero=postinumero;
    }
    
    /**
     * asetaKaupunki metodi asettaa kaupungin, missä jäsen asuu
     * @param kaupunki 
     */
    public void asetaKaupunki (String kaupunki){
        this.kaupunki=kaupunki;
    }
    
    /**
     * asetaSposti metodi asettaa jäsenelle sähköpostiosoitteen
     * @param sposti 
     */
    public void asetaSposti (String sposti){
        this.sposti=sposti;
    }
    
    /**
     * asetaPuhelin metodi asettaa jäsenelle puhelinnumeron
     * @param puhelin 
     */
    public void asetaPuhelin (String puhelin){
        this.puhelin=puhelin;
    }
    
    /**
     * asetaSyntymapv metodi asettaa jäsenelle syntymapäivän, arvo välillä 1-31
     * @param syntymapv 
     */
    public void asetaSyntymapv(int syntymapv){
        if (syntymapv>=1 && syntymapv<=31){
            this.syntymapv=syntymapv;   
        }
        else System.out.println("virheellinen arvo");
    }
    
    /**
     * asetaSyntymakk metodi asettaa jäsenelle syntymakuukauden, arvo välillä 1-12
     * @param syntymakk 
     */
    public void asetaSyntymakk (int syntymakk){
        if (syntymakk>=1 && syntymakk<=12){
            this.syntymakk=syntymakk;
        }
        else System.out.println("virheellinen arvo");
    }
    
    /**
     * asetaSyntymavuosi metodi asettaa jäsenelle syntymapäivän, arvo välillä 1900-2025
     * @param syntymavuosi 
     */
    public void asetaSyntymavuosi (int syntymavuosi){
        if (syntymavuosi>=1900 && syntymavuosi<=2025){
            this.syntymavuosi=syntymavuosi;
        }
        else System.out.println("virheellinen arvo");
    }
    
    /**
     * asetaLiittymisvuosi metodi asettaa vuoden, jolloin jäsen on liittynyt kerhoon
     * arvo välillä 1965-2025
     * @param liittymisvuosi 
     */
    public void asetaLiittymisvuosi (int liittymisvuosi){
        if (liittymisvuosi>=1965 && liittymisvuosi<=2025){
            this.liittymisvuosi=liittymisvuosi;
        }
        else System.out.println("virheellinen arvo");
    }
    
    /**
     * asetaMotocrossJaostoon metodi asettaa jäsenen motocrossjaostoon
     * @param motocross 
     */
    public void asetaMotocrossJaostoon(boolean motocross){
       motocross=true;
    }
    
    /**
     * asetaEnduroJaostoon metodi asettaa jäsenen endurojaostoon
     * @param enduro 
     */
    public void asetaEnduroJaostoon(boolean enduro){
       jaos=enduro;
        }
    
    /**
     *asetaTrialJaostoon metodi asettaa jäsenen trialjaostoon 
     * @param trial 
     */
    public void asetaTrialJaostoon(boolean trial){
       jaos=trial;
        }

    /**
     * asetaSupermotoJaostoon metodi asettaa jäsenen supermotojaostoon
     * @param supermoto 
     */
    public void asetaSupermotoJaostoon(boolean supermoto){
       jaos=supermoto;
        }
    
    /**
     * asetaStuntJaostoon metodi asettaa jäsenen stuntjaostoon
     * @param stunt 
     */
    public void asetaStuntJaostoon(boolean stunt){
       jaos=stunt;
        }
    
    /**
     * asetaMxjJaostoon metodi asettaa jäsenen mxj-jaostoon
     * @param mxj 
     */
    public void asetaMxjJaostoon(boolean mxj){
       jaos=mxj;
        }
    
    /**
     * asetaMx50Jaostoon metodi asettaa jäsenen mx50-jaostoon
     * @param mx50 
     */
    public void asetaMx50Jaostoon(boolean mx50){
       jaos=mx50;
        }
    
    /**
     * asetaMx65Jaostoon metodi asettaa jäsenen mx65jaostoon
     * @param mx65 
     */
    public void asetaMx65Jaostoon(boolean mx65){
       jaos=mx65;
        }
    
    /**
     * asetaMx85Jaostoon metodi asettaa jäsenen mx85jaostoon
     * @param mx85 
     */
    public void asetaMx85Jaostoon(boolean mx85){
       jaos=mx85;
        }
    
    /**
     * asetaAikuisetMaksuryhmaan metodi asettaa jäsenen maksuryhmäksi aikuiset
     * @param aikuiset 
     */
    public void asetaAikuisetMaksuryhmaan(boolean aikuiset){
       if (maksuryhma=aikuiset){
            aikuiset=true;
        }
        else aikuiset=false; 
    }
    
            
    /**
     * asetaJunioritMaksuryhmaan metodi asettaa jäsenen maksuryhmäksi juniorit
     * @param juniorit 
     */
    public void asetaJunioritMaksuryhmaan(boolean juniorit){
       maksuryhma=juniorit;
        }
    
    /**
     * asetaNaisetMaksuryhmaan metodi asettaa jäsenen maksuryhmäksi naiset
     * @param naiset 
     */
    public void asetaNaisetMaksuryhmaan(boolean naiset){
       maksuryhma=naiset;
        }
    
    /**
     * asetaAinaisjasenetMaksuryhmaan metodi asettaa jäsenen maksuryhmäksi ainaisjasenet
     * @param ainaisjasenet 
     */
    public void asetaAinaisjasenetMaksuryhmaan(boolean ainaisjasenet){
       maksuryhma=ainaisjasenet;
        }
    
    /**
     * asetaJasenmaksu metodi asettaa jäsenen jasenmaksun maksetuksi
     * @param jasenmaksu 
     */
    public void asetaJasenmaksu(boolean jasenmaksu){
       jasenmaksu=true;
        }
   
    /**
     * haeJasennumero  metodi hakee ja palauttaa jäsenen jäsennumeron
     * @param jasennumero
     * @return jasennumero
     */
    public int haeJasennumero(int jasennumero){
       return jasennumero;
   } 
    /**
     * haeEtunimi metodi hakee ja palauttaa syötetyn etunimen jäsenelle 
     * @return etunimi
     */
   public String haeEtunimi (){
        return etunimi;
    }
   
    /**
     * haeSukunimi metodi hakee ja palauttaa syötetyn sukunimen jäsenelle  
     * @return sukunimi
     */
    public String haeSukunimi (){
        return sukunimi;
    }
    
    /**
     * haeOsoite metodi hakee ja palauttaa syötetyn osoitteen jäsenelle 
     * @return osoite
     */
    public String haeOsoite (){
        return osoite;
    }
    
    /**
     * haePostinumero metodi hakee ja palauttaa syötetyn postinumeron jäsenelle 
     * @return postinumero
     */
    public String haePostinumero (){
        return postinumero;
    }
    
    /**
     * haeKaupunki metodi hakee ja palauttaa syötetyn kaupungin jäsenelle 
     * @return kaupunki
     */
    public String haeKaupunki (){
        return kaupunki;
    }
    
    /**
     * haeSposti metodi hakee ja palauttaa syötetyn sähköpostiosoitten jäsenelle 
     * @return sposti
     */
    public String haeSposti (){
        return sposti;
    }
    
    /**
     * haePuhelin metodi hakee ja palauttaa syötetyn puhelinnumeron jäsenelle  
     * @return puhelin
     */
    public String haePuhelin (){
        return puhelin;
    }
    
    /**
     * haeSyntymapv metodi hakee ja palauttaa valitun syntymäpäivän jäsenelle 
     * @return syntymapv
     */
    public int haeSyntymapv (){
        return syntymapv;
    }
    
    /**
     * haeSyntymakk metodi hakee ja palauttaa valitun syntymäkuukauden jäsenelle 
     * @return syntymakk
     */
    public int haeSyntymakk (){
        return syntymakk;
    }
    
    /**
     * haeSyntymavuosi metodi hakee ja palauttaa valitun syntymävuoden jäsenelle 
     * @return syntymavuosi
     */
    public int haeSyntymavuosi (){
        return syntymavuosi;
    }
    
    /**
     * haeLiittymisvuosi metodi hakee ja palauttaa valitun liittymisvuoden jäsenelle 
     * @return liittymisvuosi
     */
   public int haeLiittymisvuosi (){
       return liittymisvuosi;
   }
   
   /**
    * haeMotocrossjaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
    * asetettu motocrossjaostoon, true=kyllä on ja false=ei ole
    * @param motocross
    * @return this.motocross=true
    */
    public boolean haeMotocrossJaostosta (boolean motocross){
        if (jaos=motocross){
            return this.motocross=true;
        }else return this.motocross=false;
    }
    
    /**
     * haeEndurojaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu endurojaostoon, true=kyllä on ja false=ei ole
     * @param enduro
     * @return this.enduro=true
     */
    public boolean haeEnduroJaostosta (boolean enduro){
        if (jaos=enduro){
            return this.enduro=true;
        }else return this.enduro=false;
    }
    
    /**
     * haeTrialjaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu trialjaostoon, true=kyllä on ja false=ei ole
     * @param trial
     * @return this.trial=true
     */
    public boolean haeTrialJaostosta (boolean trial){
        if (jaos=trial){
            return this.trial=true;
        }else return this.trial=false;
    }
    
    /**
     * haeSupermotojaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu supermotojaostoon, true=kyllä on ja false=ei ole
     * @param supermoto
     * @return this.supermoto=true
     */
    public boolean haeSupermotoJaostosta (boolean supermoto){
        if (jaos=supermoto){
            return this.supermoto=true;
        }else return this.supermoto=false;
    }
    
    /**
     * haeStuntjaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu stuntjaostoon, true=kyllä on ja false=ei ole
     * @param stunt
     * @return this.stunt=true
     */
    public boolean haeStuntJaostosta (boolean stunt){
        if (jaos=stunt){
            return this.stunt=true;
        }else return this.stunt=false;
    }
    
    /**
     * haeMxjjaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu mxjjaostoon, true=kyllä on ja false=ei ole
     * @param mxj
     * @return this.mxj=true
     */
    public boolean haeMxjJaostosta (boolean mxj){
        if (jaos=mxj){
            return this.mxj=true;
        }else return this.mxj=false;
    }
    
    /**
     * haeMx50jaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu mx50jaostoon, true=kyllä on ja false=ei ole
     * @param mx50
     * @return this.mx50=true
     */
    public boolean haeMx50Jaostosta (boolean mx50){
        if (jaos=mx50){
            return this.mx50=true;
        }else return this.mx50=false;
    }
    
    /**
     * haeMx65jaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu mx65jaostoon, true=kyllä on ja false=ei ole
     * @param mx65
     * @return this.mx65=true
     */
    public boolean haeMx65Jaostosta (boolean mx65){
        if (jaos=mx65){
            return this.mx65=true;
        }else return this.mx65=false;
    }
    
    /**
     * haeMx85jaostosta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu mx85jaostoon, true=kyllä on ja false=ei ole
     * @param mx85
     * @return this.mx85=true
     */
    public boolean haeMx85Jaostosta (boolean mx85){
        if (jaos=mx85){
            return this.mx85=true;
        }else return this.mx85=false;
    }
    
    /**
     * haeAikuisetMaksuryhmasta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu maksuryhmään aikuiset, true=kyllä on ja false=ei ole
     * @param aikuiset
     * @return this.aikuiset=true
     */
    public boolean haeAikuisetMaksuryhmasta (boolean aikuiset){
        if (maksuryhma=aikuiset){
            return this.aikuiset=true;
        }else return this.aikuiset=false;
    }
    
    /**
     * haeJunioritMaksuryhmasta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu maksuryhmään juniorit, true=kyllä on ja false=ei ole
     * @param juniorit
     * @return this.juniorit=true
     */
     public boolean haeJunioritMaksuryhmasta (boolean juniorit){
        if (maksuryhma=juniorit){
            return this.juniorit=true;
        }else return this.juniorit=false;
    }
     
    /**
     * haeNaisetMaksuryhmasta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu maksuryhmään naiset, true=kyllä on ja false=ei ole
     * @param naiset
     * @return this.naiset=true
     */
      public boolean haeNaisetMaksuryhmasta (boolean naiset){
        if (maksuryhma=naiset){
            return this.naiset=true;
        }else return this.naiset=false;
    }
      
    /**
     * haeAinaisjasenetMaksuryhmasta metodi hakee ja palauttaa totuusarvon siitä onko jäsen
     * asetettu maksuryhmään ainaisjasenet, true=kyllä on ja false=ei ole
     * @param ainaisjasenet
     * @return this.ainaisjasenet=true
     */
       public boolean haeAinaisjasenetMaksuryhmasta (boolean ainaisjasenet){
        if (maksuryhma=ainaisjasenet){
            return this.ainaisjasenet=true;
        }else return this.ainaisjasenet=false;
    }
       
    /**
     * haeJasenmaksu metodi hakee ja palauttaa totuusarvon siitä onko jäsenen
     * jasenmaksu asetettu maksetuksi, true=kyllä on ja false=ei ole
     * @param jasenmaksu
     * @return this.jasenmaksu=true
     */
    public boolean haeJasenmaksu (boolean jasenmaksu){
        if (jasenmaksu=true){
            return this.jasenmaksu=true;
        }else return this.jasenmaksu=false;
    
    }  
    
    /**
     * toString metodi palauttaa jasenelle syötetyt ja asetetut tiedot
     * 
     */
    public String toString(){
        return jasennumero+"|"+etunimi+"|"+sukunimi+"|"+osoite+"|"+postinumero
                +"|"+kaupunki+"|"+sposti+"|"+puhelin+"|"+syntymapv+"|"+syntymakk
                +"|"+syntymavuosi+"|"+liittymisvuosi+"|"+motocross+"|"+enduro+
                "|"+trial+"|"+supermoto+"|"+stunt+"|"+mxj+"|"+mx50+"|"+mx65+
                "|"+mx85+"|"+aikuiset+"|"+juniorit+"|"+naiset+"|"+ainaisjasenet+
                "|"+jasenmaksu;
    }
    
}