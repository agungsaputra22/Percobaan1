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
public class peminjamanDemo {
    public static void main(String[] args){
        Peminjaman mem1 = new Peminjaman();
        
        mem1.setId("MEM-01");
        mem1.setNm("Agung Saputra");
        mem1.setNg("PUBG");
        mem1.tampilData();
        System.out.println("Harga yang harus dibayar : Rp. "+mem1.setHb(2, 50000));
    }
}
