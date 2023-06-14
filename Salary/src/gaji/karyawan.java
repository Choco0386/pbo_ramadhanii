/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gaji;
import javax.swing.JOptionPane;

/**
 *
 * @author W11
 */
public class karyawan extends Penggajian{
    private String nip;
    private String nama;
    
    public void setNIP(String nip){
        if (nip.equals("null")){
            JOptionPane.showInternalMessageDialog(null,"NIP Belum diisi");
        }else{
            this.nip=nip;
        }
    }
        public String getNIP(){
            return this.nip;
        }
        public void setNAMA(String nama){
            if (nama.equals("null")){
                JOptionPane.showInternalMessageDialog(null,("Nama Belum diisi"));
        }else{
                this.nama=nama;
            }
    }
       public String getNAMA(){
           return this.nama;
       }
}
