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
public class DimensiAc extends Ac
{
    private int DimensiAc;
    
    public void setDimensiAc(int a)
    {
        DimensiAc = a;
    }
    public void cekStatus()
    {
        super.cetakStatus();
        System.out.println("Tipe AC: " + DimensiAc + "PK");
    }
}
