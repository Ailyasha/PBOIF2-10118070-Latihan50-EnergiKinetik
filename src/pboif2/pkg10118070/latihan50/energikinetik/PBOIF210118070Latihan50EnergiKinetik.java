/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan50.energikinetik;

/**
 *
 * @author Ailyasha
 */
public class PBOIF210118070Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnergiKinetik energi = new EnergiKinetik();
        energi.setMassa(145);
        energi.setKecepatan(25);
        System.out.println("====Program Penghitung Energi Kinetik====");
        System.out.println("Massa Baseball = " + energi.getMassa() + " gram");
        System.out.println("Kecepatan = " + energi.getKecepatan() + " m/s");
        System.out.println("Energi Kinetik = " + energi.hitungEnergiKinetik() + " Joule");
        System.out.println("Usaha = " + energi.hitungUsaha()+ " Joule");
    }
    
}
