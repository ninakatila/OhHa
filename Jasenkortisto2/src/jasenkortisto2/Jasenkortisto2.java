package jasenkortisto2;

import java.util.*;
/**
 * 
 * @author nina.katila
 */
public class Jasenkortisto2 {
 protected ArrayList<Jasen> jasenlista;
     protected int jasenlistassa;
    

    /** konstruktori */
    public Jasenkortisto2(){
        jasenlista = new ArrayList<Jasen>();
}
    public void asetaJasen(Jasen uusiJasen){
        jasenlista.add(uusiJasen);
    }
    public int haeJasenlistassa(int jasenlistassa){
         return this.jasenlistassa;
     }
    public Jasen haeJasen (int indeksi){
       return jasenlista.get(indeksi);
        }
   
public static void main(String[]args){
    ArrayList<Jasen> jasenlista=new ArrayList<Jasen>();
     
     jasenlista.add(new Jasen ("Teppo","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",19,12,1979,2012));
     jasenlista.add(new Jasen ("Taina","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",8,8,1979,2012));
     jasenlista.add(new Jasen ("Tatu","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",9,9,1999,2012));
     jasenlista.add(new Jasen ("Timi","Testaaja","Testikatu","00100",
                "Helsinki","testi@testi.com","045888999",9,9,1999,2012));
     
     for(Jasen alkio:jasenlista) 
            System.out.println(alkio);

}
}
      