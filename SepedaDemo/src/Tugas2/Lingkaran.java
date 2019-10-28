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
public class Lingkaran {
    private double phi;
    private double r;
    private double luas;
    private double keliling;
    
    
    public void hitungLuas(double phi, double r){
        luas = phi*r*r;
    }
    
    public void hitungKeliling(double phi, double r){
        keliling = 2*r*phi;
    }
    
    public void tampilData(){
        System.out.println("Luas Lingkaran : "+luas);
        System.out.println("Keliling Lingkaran : "+keliling);
    }
    
}
