package jasenkortisto2;


import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author nina.katila
 */
public class Jasenkortisto2 implements ActionListener {

    /**
     * kentät
     */
    private static ArrayList<Jasen> jasenlista;
    private static Jasenikkuna2 ikkuna;
    private static String kortistonNimi = "c:\\importTesti.csv";
    
   
    

    /**
     * konstruktori, ei parametrejä
     */
    public Jasenkortisto2() {
        jasenlista = new ArrayList<Jasen>();
    }

    /**
     * etsiJasen metodi etsii hakuehdon mukaisesti jäsenen kortistosta.
     * Hakuehton on jäsenen etunimi tai sukunimi.
     * 
     * @return etsityt.toArray(new Jasen[etsityt.size()])
     */
    public static Jasen[] etsiJasen() {

        ArrayList<Jasen> etsityt = new ArrayList<Jasen>();
        
        for (Jasen jasen : jasenlista) {

            if (jasen.haeSukunimi().toLowerCase(Locale.GERMAN).indexOf(ikkuna.jTextField8.getText()) >= 0) {
                etsityt.add(jasen);
                ikkuna.listModel.addElement(jasen);               
            }
            if (jasen.haeEtunimi().toLowerCase(Locale.GERMAN).indexOf(ikkuna.jTextField8.getText()) >= 0) {
                etsityt.add(jasen);
                ikkuna.listModel.addElement(jasen);
            }
               
        }
        for(Jasen etsitty:etsityt){
        System.out.println(etsitty);
        }
        return etsityt.toArray(new Jasen[etsityt.size()]);
        
        }    
    /**
     * tulostaJaosvetajalle metodilla tulostetaan hakuehtona määritetyn jaoksen
     * jäsenet tekstitiedostoon, jonka voi lähettää helposti esim. sähköpostin
     * liitteenä jaosvetäjälle. Metodin lopussa vielä näytetään käyttäjälle 
     * erilliseen näyttöikkunaan tieto tulostetusta tiedostosta ja sen 
     * sijainnista kovalevyllä 
     * @throws IOException 
     */    
   public static void tulostaJaosvetajalle() throws IOException{
       FileWriter tulostus = new FileWriter("c:\\jaosvetajalle.txt");
        PrintWriter ulos = new PrintWriter(tulostus);
        
             
        if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Motocross")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.motocross){
                ulos.println(jasen);
                
        }
            }
        }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Enduro")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.enduro){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Trial")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.trial){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Supermoto")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.supermoto){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("Stunt")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.stunt){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("MXJ")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.mxj){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("MX50")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.mx50){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("MX65")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.mx65){
                ulos.println(jasen);
        }
            }
       }
       if (ikkuna.jComboBox1.getSelectedItem().toString().equalsIgnoreCase("MX85")){

       for (Jasen jasen:jasenlista){
            if (jasen.jaos=jasen.mx85){
                ulos.println(jasen);
        }
            }
       }
        ulos.flush();
        ulos.close();
        
            ikkuna.ta2.setText("Valitsemasi jaoston jäsenet on tulostettu teksti"
                    + "tiedostoon hakemistoon c:\\jaosvetajalle.txt");
            ikkuna.frame2.getContentPane().add(ikkuna.ta2);
            ikkuna.frame2.pack();
            ikkuna.frame2.setVisible(true);
        }
       
      /**
    * tulostaMaksuryhmanJasenet metodilla tulostetaan hakuehtona määritetyn 
    * maksuryhmän jäsenet tekstitiedostoon, jonka voi lähettää helposti esim. sähköpostin
     * liitteenä tietoa tarvitsevalle. Metodin lopussa vielä näytetään käyttäjälle 
     * erilliseen näyttöikkunaan tieto tulostetusta tiedostosta ja sen 
     * sijainnista kovalevyllä 
    * @throws IOException 
    */   
      public static void tulostaMaksuryhmanJasenet() throws IOException{
       FileWriter tulostus = new FileWriter("c:\\maksuryhmalaiset.txt");
        PrintWriter ulos = new PrintWriter(tulostus);

       if(ikkuna.jComboBox7.getSelectedItem().toString().equalsIgnoreCase("Aikuiset")){
        for (Jasen jasen:jasenlista){            
                if (jasen.maksuryhma=jasen.aikuiset){
                ulos.println(jasen);
            }
        }
       }
        if(ikkuna.jComboBox7.getSelectedItem().toString().equalsIgnoreCase("Juniorit")){
        for (Jasen jasen:jasenlista){ 
            if (jasen.maksuryhma=jasen.juniorit){
                ulos.println(jasen);
            }
        }
        }
        if(ikkuna.jComboBox7.getSelectedItem().toString().equalsIgnoreCase("Naiset")){
        for (Jasen jasen:jasenlista){ 
            if (jasen.maksuryhma=jasen.naiset){
                ulos.println(jasen);
            }
        }
        }
        
        if(ikkuna.jComboBox7.getSelectedItem().toString().equalsIgnoreCase("Ainaisjäsenet")){
        for (Jasen jasen:jasenlista){ 
            if (jasen.maksuryhma=jasen.ainaisjasenet){
                ulos.println(jasen);
            }
        }
        }
        ulos.flush();
        ulos.close();
        ikkuna.ta3.setText("Valitsemaasi maksuryhmään kuuluva jäsenet on "
                + "tulostettu tekstitiedostoon hakemistoon c:\\maksuryhmalaiset.txt");
            ikkuna.frame3.getContentPane().add(ikkuna.ta3);
            ikkuna.frame3.pack();
            ikkuna.frame3.setVisible(true);
    }
     
   /**
       * lueKortistosta metodi lukee kovalevylle tallennetusta csv-tiedostosta
       * kortiston tiedot ohjelmaan
       */   
    public static void lueKortistosta() {
        jasenlista = new ArrayList<Jasen>();
        BufferedReader br = null;
        FileReader fr = null;

        try {
            String rivi;
            fr = new FileReader(kortistonNimi);
            br = new BufferedReader(fr);
            while ((rivi = br.readLine()) != null) {
                System.out.println(rivi);
                String[] s = rivi.split("[|,]+");

                Jasen jasen = new Jasen();
                jasen.jasennumero = Integer.parseInt(s[0]);
                jasen.etunimi = s[1];
                jasen.sukunimi = s[2];
                jasen.osoite = s[3];
                jasen.postinumero = s[4];
                jasen.kaupunki = s[5];
                jasen.sposti = s[6];
                jasen.puhelin = s[7];
                jasen.syntymapv = Integer.parseInt(s[8]);
                jasen.syntymakk = Integer.parseInt(s[9]);
                jasen.syntymavuosi = Integer.parseInt(s[10]);
                jasen.liittymisvuosi = Integer.parseInt(s[11]);
                if (s[12].equalsIgnoreCase("true")) {
                    jasen.motocross = true;
                } else {
                    jasen.motocross = false;
                }

                if (s[13].equalsIgnoreCase("true")) {
                    jasen.enduro = true;
                } else {
                    jasen.enduro = false;
                }

                if (s[14].equalsIgnoreCase("true")) {
                    jasen.trial = true;
                } else {
                    jasen.trial = false;
                }

                if (s[15].equalsIgnoreCase("true")) {
                    jasen.supermoto = true;
                } else {
                    jasen.supermoto = false;
                }

                if (s[16].equalsIgnoreCase("true")) {
                    jasen.stunt = true;
                } else {
                    jasen.stunt = false;
                }

                if (s[17].equalsIgnoreCase("true")) {
                    jasen.mxj = true;
                } else {
                    jasen.mxj = false;
                }

                if (s[18].equalsIgnoreCase("true")) {
                    jasen.mx50 = true;
                } else {
                    jasen.mx50 = false;
                }

                if (s[19].equalsIgnoreCase("true")) {
                    jasen.mx65 = true;
                } else {
                    jasen.mx65 = false;
                }

                if (s[20].equalsIgnoreCase("true")) {
                    jasen.mx85 = true;
                } else {
                    jasen.mx85 = false;
                }

                if (s[21].equalsIgnoreCase("true")) {
                    jasen.aikuiset = true;
                } else {
                    jasen.aikuiset = false;
                }

                if (s[22].equalsIgnoreCase("true")) {
                    jasen.juniorit = true;
                } else {
                    jasen.juniorit = false;
                }

                if (s[23].equalsIgnoreCase("true")) {
                    jasen.naiset = true;
                } else {
                    jasen.naiset = false;
                }

                if (s[24].equalsIgnoreCase("true")) {
                    jasen.ainaisjasenet = true;
                } else {
                    jasen.ainaisjasenet = false;
                }

                if (s[25].equalsIgnoreCase("true")) {
                    jasen.jasenmaksu = true;
                } else {
                    jasen.jasenmaksu = false;
                }

                jasenlista.add(jasen);

            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }

            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
/**
     * kirjoitaKortistoon metodilla kirjoitetaan kortiston tiedot csv-tiedostoon
     * kovalevylle. Tiedot kirjoitetaan ja tiedosto suljetaan aina muutettaessa 
     * tai lisättäessä jäseniä kortistoon.
     * @throws IOException 
     */
    public static void kirjoitaKortistoon() throws IOException {

        FileWriter writer = new FileWriter(kortistonNimi);
        PrintWriter pw = new PrintWriter(writer);

        for (Jasen jasen : jasenlista) {
            pw.println(jasen);
        }

        pw.flush();
        pw.close();
    }
/**
     * actionListener metodi lisää tarvittavat kuuntelijat käyttöliittymän
     * painikkeille
     * @param kuuntelija
     * @return kuuntelija
     */
    public static ActionListener actionListener(ActionListener kuuntelija) {
        ikkuna.jButton1.addActionListener(kuuntelija);
        ikkuna.jComboBox2.addActionListener(kuuntelija);
        ikkuna.jButton3.addActionListener(kuuntelija);
        ikkuna.jButton2.addActionListener(kuuntelija);        
        ikkuna.jComboBox1.addActionListener(kuuntelija);
        ikkuna.jComboBox7.addActionListener(kuuntelija);
        ikkuna.jButton4.addActionListener(kuuntelija);
        ikkuna.jButton5.addActionListener(kuuntelija);
                
        return kuuntelija;
    }
    
    /**
     * listListener metodi lisää hakutuloslistan kuuntelijan
     * @param listakuuntelija
     * @return listakuuntelija
     */
    public static ListSelectionListener listListener (ListSelectionListener 
            listakuuntelija){
        ikkuna.jList1.addListSelectionListener(listakuuntelija);
        return listakuuntelija;
    } 
    
 
    /** 
     * actionPerformed metodi kutsuu metodeja, jotka toteuttavat käyttöliittymän
     * kautta pyydettyjä eli valittuja toimintoja. Näitä toimintoja tai tehtäviä 
     * on nyt jäsenen lisäys, jäsenen etsiminen kortistosta, jäsenen tietojen 
     * muuttaminen, jaokseen ja maksuryhmiin kuuluvien jäsenien tietojen kirjoitus
     * tekstitiedostoon
     * @param e 
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ikkuna.jButton1) {
            lisaaJasen();
            ikkuna.jTextField1.setText("");
            
        }
        if (e.getSource() == ikkuna.jButton3) {
            etsiJasen();
            
            
        }
        if (e.getSource()== ikkuna.jButton2){
            muutaJasen();
            ikkuna.jTextField1.setText("");           
        }
        if (e.getSource()== ikkuna.jButton5){
            try {
                tulostaMaksuryhmanJasenet();                
            }catch (IOException exc){
                exc.printStackTrace();
        }  
        }
        
        if (e.getSource() == ikkuna.jButton4) {
             try {
                tulostaJaosvetajalle();               
        } catch (IOException ex) {
            ex.printStackTrace();
            
        }
         
        }
    }
    /**
     * listaValinta metodi näyttää hakutuloslistalta valitun jäsnen tiedot
     * @param event 
     */
   public void listaValinta (ListSelectionEvent event) {
        
        
                   
        Jasen etsitty=(Jasen)ikkuna.jList1.getSelectedValue();
        ikkuna.jTextField1.setText(etsitty.etunimi);
        ikkuna.jTextField2.setText(etsitty.sukunimi);
        ikkuna.jTextField3.setText(etsitty.osoite);
        ikkuna.jTextField4.setText(etsitty.postinumero);
        ikkuna.jTextField5.setText(etsitty.kaupunki);
        ikkuna.jTextField6.setText(etsitty.puhelin);
        ikkuna.jTextField7.setText(etsitty.sposti);
        ikkuna.jComboBox3.setSelectedItem(etsitty.syntymapv);
        ikkuna.jComboBox4.setSelectedItem(etsitty.syntymakk);
        ikkuna.jComboBox5.setSelectedItem(etsitty.syntymavuosi);
        ikkuna.jComboBox6.setSelectedItem(etsitty.liittymisvuosi);
        if (etsitty.jaos=etsitty.motocross){
            ikkuna.jCheckBox1.isSelected();
        }
        if (etsitty.jaos=etsitty.enduro){
            ikkuna.jCheckBox2.isSelected();
        }
        if (etsitty.jaos=etsitty.trial){
            ikkuna.jCheckBox3.isSelected();
        }
        if (etsitty.jaos=etsitty.supermoto){
            ikkuna.jCheckBox4.isSelected();
        }
        if (etsitty.jaos=etsitty.stunt){
            ikkuna.jCheckBox5.isSelected();
        }
        if (etsitty.jaos=etsitty.mxj){
            ikkuna.jCheckBox10.isSelected();
        }
        if (etsitty.jaos=etsitty.mx50){
            ikkuna.jCheckBox7.isSelected();
        }
        if (etsitty.jaos=etsitty.mx65){
            ikkuna.jCheckBox8.isSelected();
        }
        if (etsitty.jaos=etsitty.mx85){
            ikkuna.jCheckBox9.isSelected();
        }
        if (etsitty.maksuryhma=etsitty.aikuiset){
            ikkuna.jComboBox2.setSelectedIndex(1);            
        }
        if (etsitty.maksuryhma=etsitty.juniorit){
            ikkuna.jComboBox2.setSelectedIndex(2);
        }
        if (etsitty.maksuryhma=etsitty.naiset){
            ikkuna.jComboBox2.setSelectedIndex(3);            
        }
        if (etsitty.maksuryhma=etsitty.ainaisjasenet){
            ikkuna.jComboBox2.setSelectedIndex(4);            
        }
        if (etsitty.jasenmaksu=true){
            ikkuna.jCheckBox6.isSelected();
        }
        }   
        
    
    
/** 
    * lisaaJasen metodi lisää uuden jäsenen kortistoon. Jäsenen tiedot luetaan
    * käyttöliittymän tietokentistä, joita ovat tekstikentät, monivalinta kentät
    * sekä valintalistat.
    * Metodin lopussa kutsutaan kirjoitaKortistoon -metodia tallentamaan 
    * kortisto csv-tiedostoon kovalevylle.
    */
    public void lisaaJasen() {
        Jasen jasen = new Jasen();
        int nro = jasenlista.size();
        int numero = nro + 1;
        jasen.asetaJasennumero(numero);
        jasen.asetaEtunimi(ikkuna.jTextField1.getText());
        jasen.asetaSukunimi(ikkuna.jTextField2.getText());
        jasen.asetaOsoite(ikkuna.jTextField3.getText());
        jasen.asetaPostinumero(ikkuna.jTextField4.getText());
        jasen.asetaKaupunki(ikkuna.jTextField5.getText());
        jasen.asetaPuhelin(ikkuna.jTextField6.getText());
        jasen.asetaSposti(ikkuna.jTextField7.getText());
        jasen.asetaSyntymapv(Integer.parseInt(ikkuna.jComboBox3.getSelectedItem().toString()));
        jasen.asetaSyntymakk(Integer.parseInt(ikkuna.jComboBox4.getSelectedItem().toString()));
        jasen.asetaSyntymavuosi(Integer.parseInt(ikkuna.jComboBox5.getSelectedItem().toString()));
        jasen.asetaLiittymisvuosi(Integer.parseInt(ikkuna.jComboBox6.getSelectedItem().toString()));
        if(ikkuna.jCheckBox1.isSelected()){
            jasen.motocross=true;
        }else jasen.motocross=false;
        if (ikkuna.jCheckBox2.isSelected()){
        jasen.enduro=true;
        }else jasen.enduro=false;
        if (ikkuna.jCheckBox3.isSelected()){
            jasen.trial=true;
        }
        if (ikkuna.jCheckBox4.isSelected()){
            jasen.supermoto=true;
        }
        if (ikkuna.jCheckBox5.isSelected()){
            jasen.stunt=true;
        }
        if (ikkuna.jCheckBox10.isSelected()){
            jasen.mxj=true;
        }
        if (ikkuna.jCheckBox7.isSelected()){
            jasen.mx50=true;
        }
        if (ikkuna.jCheckBox8.isSelected()){
            jasen.mx65=true;
        }
        if (ikkuna.jCheckBox9.isSelected()){
            jasen.mx85=true;
        }

        if (ikkuna.jComboBox2.getSelectedItem().toString().equalsIgnoreCase("aikuiset")) {
            jasen.aikuiset = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("juniorit")) {
            jasen.juniorit = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("naiset")) {
            jasen.naiset = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("ainaisjasenet")) {
            jasen.ainaisjasenet = true;
        }
        if(ikkuna.jCheckBox6.isSelected()){
            jasen.jasenmaksu=true;
        }

        jasenlista.add(jasen);

        try {
            kirjoitaKortistoon();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
/**
     * muutaJasen metodilla muutetaan kortistossa olevan jäsenen tietoja, esim.
     * osoitetta. Metodin lopussa kutsutaan kirjoitaKortistoon -metodia tallentamaan 
     * kortisto csv-tiedostoon kovalevylle.
     */
    public static void muutaJasen() {
        Jasen muutettava= (Jasen)ikkuna.jList1.getSelectedValue();
        int i = jasenlista.indexOf(muutettava);
        muutettava.asetaEtunimi(ikkuna.jTextField1.getText());
        muutettava.asetaSukunimi(ikkuna.jTextField2.getText());
        muutettava.asetaOsoite(ikkuna.jTextField3.getText());
        muutettava.asetaPostinumero(ikkuna.jTextField4.getText());
        muutettava.asetaKaupunki(ikkuna.jTextField5.getText());
        muutettava.asetaPuhelin(ikkuna.jTextField6.getText());
        muutettava.asetaSposti(ikkuna.jTextField7.getText());
        muutettava.asetaSyntymapv(Integer.parseInt(ikkuna.jComboBox3.getSelectedItem().toString()));
        muutettava.asetaSyntymakk(Integer.parseInt(ikkuna.jComboBox4.getSelectedItem().toString()));
        muutettava.asetaSyntymavuosi(Integer.parseInt(ikkuna.jComboBox5.getSelectedItem().toString()));
        muutettava.asetaLiittymisvuosi(Integer.parseInt(ikkuna.jComboBox6.getSelectedItem().toString()));
        if(ikkuna.jCheckBox1.isSelected()){
            muutettava.motocross=true;
        }else muutettava.motocross=false;
        if (ikkuna.jCheckBox2.isSelected()){
        muutettava.enduro=true;
        }else muutettava.enduro=false;
        if (ikkuna.jCheckBox3.isSelected()){
            muutettava.trial=true;
        }
        else muutettava.trial=false;
        if (ikkuna.jCheckBox4.isSelected()){
            muutettava.supermoto=true;
        }
        if (ikkuna.jCheckBox5.isSelected()){
            muutettava.stunt=true;
        }
        if (ikkuna.jCheckBox10.isSelected()){
            muutettava.mxj=true;
        }
        if (ikkuna.jCheckBox7.isSelected()){
            muutettava.mx50=true;
        }
        if (ikkuna.jCheckBox8.isSelected()){
            muutettava.mx65=true;
        }
        if (ikkuna.jCheckBox9.isSelected()){
            muutettava.mx85=true;
        }

        if (ikkuna.jComboBox2.getSelectedItem().toString().equalsIgnoreCase("aikuiset")) {
            muutettava.aikuiset = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("juniorit")) {
            muutettava.juniorit = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("naiset")) {
            muutettava.naiset = true;
        } else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("ainaisjasenet")) {
            muutettava.ainaisjasenet = true;
        }
        if(ikkuna.jCheckBox6.isSelected()){
            muutettava.jasenmaksu=true;
        }

        jasenlista.set(i, muutettava);
        
        try {
            kirjoitaKortistoon();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

/**
     * main metodissa luodaan käyttöliittymästä ilmentymä, jolle annetaan
     * parametreina ilmentymä sovelluslogiikasta eli Jasenkortisto2 luokasta sekä 
     * jasenlista eli varsinainen kortisto. Metodissa lisäksi kutsutaan 
     * lueKortistosta metodia, kortiston tiedot luetaan ohjelmaan vain kerran 
     * aloitettaessa ohjelman suoritus.
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        
        ikkuna = new Jasenikkuna2(new Jasenkortisto2 (),jasenlista);
        ikkuna.setVisible(true);
        lueKortistosta();
    }
}