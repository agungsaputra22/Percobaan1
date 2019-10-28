/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author USER
 */
public class AcDemo {
     public static void main(String[] args) 
     {
        Ac pen1 = new Ac();
        Ac pen2 = new Ac();
        DimensiAc pen3 = new DimensiAc();
        
        pen1.setMerek("Panasonic");
        pen1.setWarna("Putih");
        pen1.setHarga(3000000, 500000);
        pen1.tambahSuhu(18);
        pen1.cetakStatus();
        
        pen2.setMerek("Sharp");
        pen2.setWarna("Putih");
        pen2.setHarga(3000000, 500000);
        pen2.tambahSuhu(18);
        pen2.cetakStatus();
        
        pen3.setMerek("LG");
        pen3.setWarna("Putih");
        pen3.setHarga(3000000, 500000);
        pen3.tambahSuhu(18);
        pen3.setDimensiAc(2);
        pen3.cekStatus();
     }
}
