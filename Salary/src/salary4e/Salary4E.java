/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salary4e;

import gaji.Penggajian;
import gaji.karyawan;
import java.util.ArrayList;

/**
 *
 * @author W11
 */
public class Salary4E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama=new String[5];
        nama[0]="Usman";
        nama[1]="Budi";
        nama[2]="Bayu";
        nama[3]="Banu";
        nama[4]="Danu";
        
        System.out.println(nama[3]);
        
        int[]tahun={2022,2023};
        System.out.println(tahun[1]);
        
        ArrayList<Integer> umur=new ArrayList<Integer>();
        
        umur.add(20);
        umur.add(30);
        umur.add(50);
        
        System.out.println(umur.get(1));
        
        umur.remove(1);
        System.out.println(umur.get(1));
        
      /*  Penggajian object = new Penggajian("Gol 2", "menikah", 2, 5);
        /*object.setGapok("Gol 1");
        object.setMasaKerja(2);
        object.setStatus("menikah");
        object.setTunjAnak(5);*/
       /* System.out.print(object.gajiTotal());*/
        // TODO code application logic here 
    }
    
    
    
}
