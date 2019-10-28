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
public class Sepeda {
    private String merek;
    private String warna;
    private int kecepatan;
    private int gear;
    private int harga;
   
    public void setMerek(String newValue)
    {
        merek = newValue;
	System.out.println("Hallooo");
    }
    public  void setWarna(String warnaspd)
    {
        warna = warnaspd;
    }
    public void setHarga(int hargaSepeda, int Diskon)
    {
        harga = hargaSepeda - Diskon;
    }
    public void posisiGear(int newValue)
    {
        gear = newValue;
    }
    public void tambahKecepatan(int increment)
    {
        kecepatan = kecepatan + increment;
    }
    public void Rem(int decrement)
    {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatus ()
    {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan + "km/h");
        System.out.println("Gear: " + gear);
        System.out.println("Harga:Rp " + harga);
        System.out.println("Warna: " + warna);
    }
}
