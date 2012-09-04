package jasenkortisto2;

import java.awt.event.*;
import java.util.*;
import java.io.*;

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
    private static Jasen jasen;

    /**
     * konstruktori, ei parametrejä
     */
    public Jasenkortisto2() {
        jasenlista = new ArrayList<Jasen>();
    }

    /**
     * 
     * @param uusiJasen 
     */
    public void asetaJasen(Jasen uusiJasen) {
        if (!jasenlista.contains(uusiJasen)) {
            jasenlista.add(uusiJasen);

        } else {
            System.out.println("Jäsen on jo kortistossa");
        }
    }

    /**
     * 
     * @param indeksi
     * @return 
     */
    public Jasen haeJasen(int indeksi) {
        if (indeksi <= jasenlista.size() && indeksi >= 0) {
            return jasenlista.get(indeksi);
        }
        return null;
    }

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
                System.out.println(jasen);
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

    public static void kirjoitaKortistoon() throws IOException {



        FileWriter writer = new FileWriter(kortistonNimi);
        PrintWriter pw = new PrintWriter(writer);



        for (Jasen jasen : jasenlista) {
            pw.println(jasen);
        }

        pw.flush();
        pw.close();


    }

    public static ActionListener actionListener(ActionListener kuuntelija) {
        ikkuna.jButton1.addActionListener(kuuntelija);
        ikkuna.jComboBox2.addActionListener(kuuntelija);
        ikkuna.jButton3.addActionListener(kuuntelija);
        return kuuntelija;

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ikkuna.jButton1) {
            lisaaJasen();

        }
    }

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
        jasen.haeMotocrossJaostosta(ikkuna.jCheckBox1.isSelected());
        jasen.haeEnduroJaostosta(ikkuna.jCheckBox2.isSelected());
        jasen.haeTrialJaostosta(ikkuna.jCheckBox3.isSelected());
        jasen.haeSupermotoJaostosta(ikkuna.jCheckBox4.isSelected());
        jasen.haeStuntJaostosta(ikkuna.jCheckBox5.isSelected());
        jasen.haeMxjJaostosta(ikkuna.jCheckBox10.isSelected());
        jasen.haeMx50Jaostosta(ikkuna.jCheckBox7.isSelected());
        jasen.haeMx65Jaostosta(ikkuna.jCheckBox8.isSelected());
        jasen.haeMx85Jaostosta(ikkuna.jCheckBox9.isSelected());
             
        if(ikkuna.jComboBox2.getSelectedItem().toString().equalsIgnoreCase
                ("aikuiset")){
            jasen.aikuiset=true;
        }else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("juniorit")){
            jasen.juniorit=true;
        }else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("naiset")){
            jasen.naiset=true;
        }else if (ikkuna.jComboBox2.getSelectedItem().toString().
                equalsIgnoreCase("ainaisjasenet")){
            jasen.ainaisjasenet=true;
        }
        jasen.haeJasenmaksu(ikkuna.jCheckBox6.isSelected());
        


        jasenlista.add(jasen);

        try {
            kirjoitaKortistoon();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {


        ikkuna = new Jasenikkuna2(new Jasenkortisto2(), jasenlista);
        ikkuna.setVisible(true);
        lueKortistosta();
        System.out.println(jasenlista);

    }
}