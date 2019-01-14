/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ceng
 */
public class hitung extends data {
    double hargacuci, TotalHarga;
    
     public double hargacuci(String jenisbarang){
        if(jenisbarang.equalsIgnoreCase("Karpet")){
            hargacuci = 20000;
            return hargacuci;
        } else if(jenisbarang.equalsIgnoreCase("Pakaian")){
            hargacuci = 10000;
            return hargacuci;
        } else if(jenisbarang.equalsIgnoreCase("Lainnya")){
            hargacuci = 5000;
            return hargacuci;
        }
        return 0;
    }
        
    public double TotalHarga(){
        return this.hargacuci * this.jml_kiloan;
    }
}
