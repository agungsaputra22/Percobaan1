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
public class Ac {
    private String merek;
    private String warna;
    private int harga;
    private int suhu;
    
    public void setMerek(String newValue)
    {
        merek = newValue;
    }
    public void setWarna(String warnaAc)
    {
        warna = warnaAc;
    }
    public void setHarga(int hargaAc, int Diskon)
    {
        harga = hargaAc - Diskon;
    }
    public void tambahSuhu(int increment)
    {
        suhu = suhu + increment;
    }
    public void mengurangSuhu(int decrement)
    {
        suhu = suhu - decrement;
    } 
    
    public void cetakStatus ()
    {
        System.out.println("Merek: " + merek);
        System.out.println("Suhu: " + suhu + " C");
        System.out.println("Harga:Rp " + harga);
        System.out.println("Warna: " + warna);
    }
    
}
