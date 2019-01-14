/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ceng
 */
public class data {
    private String nama, alamat, jenisbarang, kry,telp ;
    double jml_kiloan;
   
//    Method setter dan getter = mengambil dan mengisi data kedalam object
//    Method setter tidak memiliki nilai kembalian void(kosong) karena tugasnya hanya mengisi data kedalam atribut
//    method getter memiliki nilai kembalian sesuai dengan type data yang akan diambil
    
//    this untuk menyatakan variabel yg dimaksud adalah variabel yg ada didalam class
//    this hanya bisa digunakan didalam class saja.
    
    public String getNama() {
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getJenisBarang() {
        return jenisbarang;
    }
    public void setJenisBarang(String jenisbarang){
        this.jenisbarang = jenisbarang;
    }
    
    public double getJml_Kiloan() {
        return jml_kiloan;
    }
    public void setJml_Kiloan(double jml_kiloan){
        this.jml_kiloan = jml_kiloan;
    }
    
    
   void petugas(){
        System.out.println("------- Terima kasih telah mempercayai kami --------");
        System.out.println("                      Pemilik   : Aceng Abdul Wahid ");
        System.out.println("                      Telp      : 08211877268");
    }
}
