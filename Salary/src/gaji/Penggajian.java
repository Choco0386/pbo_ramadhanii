/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaji;

/**
 *
 * @author W11
 */
public class Penggajian {
    
    // variabel global
    private int gapok;
    private int tunjanganStatus;
    private int tunjanganAnak;
    private int tunjanganMasaKerja;
    
    public Penggajian(){}//constructur class
    

    public Penggajian(String Golongan){
        setGapok(Golongan);
    }
    
    public Penggajian(String Golongan, String Status){
        setStatus(Status);
        setGapok(Golongan);
    }
    
    public Penggajian(String Golongan, String Status, int masa ){
        setMasaKerja(masa);
        setStatus(Status);
        setGapok(Golongan);
    }
    
    public Penggajian(String Golongan, String Status, int masa, int jumlah ){
        setTunjAnak(jumlah);
        setMasaKerja(masa);
        setStatus(Status);
        setGapok(Golongan);
    }
    
    public void setGapok(String golongan){
        if (golongan.equals("Gol. 1")){
            this.gapok=3500000;
        }else if (golongan.equals("Gol. 2")){
            this.gapok=4000000;
        }else{
            this.gapok=4500000;
        }
    }
    
    public int getGapok(){
        return this.gapok;
    }
    
    public void setMasaKerja(int masa){
        if (masa>0 && masa<=3){
            this.tunjanganMasaKerja=400000;
        }else if (masa>=4 && masa<=7){
            this.tunjanganMasaKerja=600000;
        }else{
            this.tunjanganMasaKerja=900000;
        }
    }
    public int getMasaKerja(){
        return this.tunjanganMasaKerja;
    }
    
    public void setStatus(String status){
        if (status.equals("menikah")){
            this.tunjanganStatus=500000;
        }
    }
    
    public int getStatus(){
        return this.tunjanganStatus;
    }
    public void setTunjAnak(int jumlah){
        if (jumlah<=0 && jumlah<=3){
            this.tunjanganAnak=350000;
        }else if(jumlah>=4 && jumlah<=7){
            this.tunjanganAnak=500000;
        }else{
            this.tunjanganAnak=750000;
        }
    }
    
    public int getTunjAnak(){
        return this.tunjanganAnak;
    }
    
    public int gajiTotal(){
        return getGapok()+getMasaKerja()+getStatus()+getTunjAnak();
    }
    
     public int gajiTotal(String Golongan, String Status, int masa, int jumlah ){
         setGapok(Golongan);
         setMasaKerja(masa);
         setStatus(Status);
         setTunjAnak(jumlah);
        return getGapok()+getMasaKerja()+getStatus()+getTunjAnak();
    }
     
     
}



