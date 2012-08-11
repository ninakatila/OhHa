package jasenkortisto2;

import java.util.*;
/**
 * 
 * @author nina.katila
 */
public class Jasenkortisto2 {
    /**
     * kentät
     */
 protected ArrayList<Jasen> jasenlista;
     protected int jasenlistassa;
    

    /**
      * konstruktori, ei parametrejä
      */
    public Jasenkortisto2(){
        jasenlista = new ArrayList<Jasen>();
}
    /**
     * 
     * @param uusiJasen 
     */
    public void asetaJasen(Jasen uusiJasen){
        jasenlista.add(uusiJasen);
    }
    /**
     * 
     * @param jasenlistassa
     * @return 
     */
    public int haeJasenlistassa(int jasenlistassa){
         return this.jasenlistassa;
     }
    /**
     * 
     * @param indeksi
     * @return 
     */
    public Jasen haeJasen (int indeksi){
       return jasenlista.get(indeksi);
        }
}
      