/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawandemo;

/**
 *
 * @author AGUNGSAPUTER
 */
public class Karyawan {
    private String id;
    private String nama;
    private String jk;
    private String jb;
    private int gaji;
    public String status;
    public String alamat;
    
    public void setId(String nilaiId){
        id = nilaiId;
    }
    
    public void setNama(String name){
        nama = name;
    }
    
    public void setJk(String jekel){
        jk = jekel;
    }
    public void setJb(String jab){
        jb = jab; 
    }
    public int setGaji(int nilaiGj){
        gaji = nilaiGj;
        return gaji;
    }
    
    public void tampilData(){
        System.out.println("Id: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("jabatan: " + jb);
        System.out.println("Status : " + status);
        System.out.println("Alamat: " + alamat);
    }
}
