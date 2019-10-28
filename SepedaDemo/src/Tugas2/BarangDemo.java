/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author USER
 */
public class BarangDemo {
    public static void main(String[] args){
        Barang brg = new Barang();
        
        brg.kode="1234";
        brg.namaBarang="sofa";
        brg.hargaDasar=5000000;
        brg.diskon=0.2f;
        brg.hitungHargaJual(5000000, 0.2f);
        brg.tampilData();
    }
}
