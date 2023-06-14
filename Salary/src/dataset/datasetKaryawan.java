package dataset;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author W11
 */
//metode setter and getter

//variabel
public class datasetKaryawan {
    
    private ArrayList<String> nip;
    private ArrayList<String> nama;
    private ArrayList<String> golongan;
    private ArrayList<String> status;
    private ArrayList<Integer> jumanak;
    private ArrayList<Integer> masakerja;
    
    //constructor class
   public datasetKaryawan(){
       nip=new ArrayList<String>();
       nama=new ArrayList<String>();
       golongan=new ArrayList<String>();
       status=new ArrayList<String>();
       jumanak=new ArrayList<Integer>();
       masakerja=new ArrayList<Integer>();
   }
   
   //method
   public void insertnip(String isi){
       this.nip.add(isi);
   }
   
   public void insertnama(String isi){
       this.nama.add(isi);
   }
   
   public void insertgolongan(String isi){
       this.golongan.add(isi);
   }
   
   public void insertstatus(String isi){
       this.status.add(isi);
   }
   
   public void insertjumanak(Integer isi){
       this.jumanak.add(isi);
   }
   
   public void insertmasakerja(Integer isi){
       this.masakerja.add(isi);
   }

   //keluaran ArrayList
   public ArrayList<String> getrecordnip(){
       return this.nip;
   }
   
   public ArrayList<String> getrecordnama(){
       return this.nama;
   }
   
   public ArrayList<String> getrecordgolongan(){
       return this.golongan;
   }
   
   public ArrayList<String> getrecordstatus(){
       return this.status;
   }
   
   public ArrayList<Integer> getrecordjumanak(){
       return this.jumanak;
   }
   
    public ArrayList<Integer> getrecordmasakerja(){
       return this.masakerja;
   }
}
