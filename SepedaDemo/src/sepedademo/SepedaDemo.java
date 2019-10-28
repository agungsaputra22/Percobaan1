/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sepedademo;

/**
 *
 * @author USER
 */
public class SepedaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // BUAT DUA OBJEK SEPEDA 
        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        Sepeda spd3 = new Sepeda ();
        SepedaGunung spd4 = new SepedaGunung();
        
        //PANGGIL METHOD DIDALAM OBJEK SEPEDA
        spd1.setMerek("Polygone");
        spd1.tambahKecepatan(10);
        spd1.posisiGear(2);
        spd1.setHarga(50000000, 500000);
        spd1.cetakStatus();
        
        spd2.setMerek("Wim Cycle");
        spd2.tambahKecepatan(10);
        spd2.posisiGear(2);
        spd2.tambahKecepatan(10);
        spd2.posisiGear(3);
        spd2.setHarga(50000000, 500000);
        spd2.cetakStatus();
        
        spd3.setMerek("Unto");
        spd3.posisiGear(5);
        spd3.tambahKecepatan(40);
        spd3.Rem(10);
        spd3.tambahKecepatan(90);
        spd3.Rem(20);
        spd3.tambahKecepatan(20);
        spd3.Rem(50);
        spd3.setHarga(50000000, 500000);
        spd3.cetakStatus();
        
        spd4.setMerek("United");
        spd4.tambahKecepatan(40);
        spd4.posisiGear(5);
        spd4.setTipeSuspensi("Gas Suspension ");
        spd4.setHarga(50000000, 500000);
        spd4.setWarna("Pink");
        spd4.cekStatus();
        
        
        
    }
    
    
}
