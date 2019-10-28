/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawandemo;

/**
 *
 * @author USER
 */
public class KaryawanDemo {
    public static void main(String[] args){
        Karyawan joe = new Karyawan();
        Karyawan jono = new Karyawan();
        
        joe.setId("A123");
        joe.setNama("Jonathan");
        joe.setJk("Laki-Laki");
        joe.setJb("Office Boy");
        joe.status="Duda";
        joe.alamat="Surabaya";
        joe.tampilData();
        System.out.println("Gaji Karyawan; "+joe.setGaji(50000000));
        
        jono.setId("B123");
        jono.setNama("Jonothan");
        jono.setJk("Laki-Laki");
        jono.setJb("Manager");
        jono.status="Jomblo";
        jono.alamat="Malang";
    }
    
}
