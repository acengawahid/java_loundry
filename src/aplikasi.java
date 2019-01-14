
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ceng
 */
import java.util.Scanner;
public class aplikasi {

    /**
     * Nama     : Aceng Abdul Wahid
     * NIM      : A2.1700001
     * Kelas    : TI-III A
     * UAS      : Algoritma dan Pemrograman
     * Project  : Aplikasi Loundry Sumedang
     */
    public static void main(String[] args) {
        data struk = new data();
        hitung hasil = new hitung();
        float TotalHarga;
        Scanner input = new Scanner(System.in);
        
        System.out.println("====================================================");
        System.out.println("                   Loundry Sumedang                 ");
        System.out.println("Menerima Jasa Cucian wilayah Sumedang dan sekitarnya");
        System.out.println("====================================================");
        System.out.print("Masukkan Nama            : ");
        String nama =input.next();
        System.out.print("Masukkan Alamat          : ");
        String alamat =input.next();
        System.out.print("---Jenis Cucian --- \n - Karpet \n - Pakaian \n - Lainnya \n");
        System.out.print("Masukkan Jenis Cucian    : ");
        String jenisbarang  = input.next();
        System.out.print("Masukkan Berat Cucian(kg): ");
        double jml_kiloan = input.nextDouble();
        
        hasil.setNama(nama);
        hasil.setAlamat(alamat);
        hasil.setJenisBarang(jenisbarang);
        hasil.setJml_Kiloan(jml_kiloan);
        
        
        System.out.println();
        System.out.println("======== Struk Pembayaran Loundry Sumedang =========");
        System.out.println("***[Data Pelanggan]***");
        System.out.println("Nama         : " +hasil.getNama());
        System.out.println("Alamat       : " +hasil.getAlamat());
        System.out.println("Jenis Barang : " +hasil.getJenisBarang());
        System.out.println("Berat Cucian : " +hasil.getJml_Kiloan()+" Kg");
        System.out.println();
        
        System.out.println("Harga Kiloan  : Rp."+hasil.hargacuci(jenisbarang) +" x "+hasil.getJml_Kiloan()+" Kg");
        System.out.println("                         ***************************");
        System.out.println("                         Total Tagihan  : Rp." +hasil.TotalHarga());
        System.out.println("                         ***************************");
        
        struk.petugas();
        
    }
    
}
