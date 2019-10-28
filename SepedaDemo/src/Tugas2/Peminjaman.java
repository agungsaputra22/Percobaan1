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
public class Peminjaman {
    private String id;
    private String namaMember;
    private String namaGame;
    private int sewa,hargaBayar;
    
    public void setId(String ID){
        id = ID;
    }
    
    public void setNm(String NM){
        namaMember = NM;
    }
    
    public void setNg(String NG){
        namaGame = NG;
    }
    
    public int setHb(int setSewa,int HB){
        sewa=setSewa * HB;
        return sewa;
    }
    
    public void tampilData(){
        System.out.println("Id: " + id);
        System.out.println("Nama Member: " + namaMember);
        System.out.println("Nama Game: " + namaGame);
    }  
}
