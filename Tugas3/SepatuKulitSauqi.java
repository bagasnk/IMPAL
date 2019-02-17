/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_impal;

/**
 *
 * @author bagas
 */
public class SepatuKulitSauqi {
    public static void main(String[] args){
        // Membuat object
           SepatuKulitSauqi SepatuKulitSauqi1 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi1.Nama_Sepatu = "Brodo Casual";
                SepatuKulitSauqi1.Ukuran = "42";
                SepatuKulitSauqi1.Jumlah_Sepatu = "8";
                SepatuKulitSauqi1.Harga = "Rp. 280.000";
        System.out.println("Nama Sepatu: " + SepatuKulitSauqi1.Nama_Sepatu);
        System.out.println("Ukuran: " + SepatuKulitSauqi1.Ukuran);
        System.out.println("Jumlah_Sepatu: " + SepatuKulitSauqi1.Jumlah_Sepatu);
        System.out.println("Harga: " + SepatuKulitSauqi1.Harga);
        
        SepatuKulitSauqi SepatuKulitSauqi2 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi2.Nama_Sepatu = "Jager";
                SepatuKulitSauqi2.Ukuran = "41";
                SepatuKulitSauqi2.Jumlah_Sepatu = "12";
                SepatuKulitSauqi2.Harga = "Rp. 200.000";
        System.out.println("Nama Sepatu: " + SepatuKulitSauqi2.Nama_Sepatu);
        System.out.println("Ukuran: " + SepatuKulitSauqi2.Ukuran);
        System.out.println("Jumlah_Sepatu: " + SepatuKulitSauqi2.Jumlah_Sepatu);
        System.out.println("Harga: " + SepatuKulitSauqi2.Harga);
        
        SepatuKulitSauqi SepatuKulitSauqi3 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi3.Nama_Sepatu = "Mokasino";
                SepatuKulitSauqi3.Ukuran = "40";
                SepatuKulitSauqi3.Jumlah_Sepatu = "20";
                SepatuKulitSauqi3.Harga = "Rp. 200.000";
        System.out.println("Nama Sepatu: " + SepatuKulitSauqi3.Nama_Sepatu);
        System.out.println("Ukuran: " + SepatuKulitSauqi3.Ukuran);
        System.out.println("Jumlah_Sepatu: " + SepatuKulitSauqi3.Jumlah_Sepatu);
        System.out.println("Harga: " + SepatuKulitSauqi3.Harga);
    }
    private String Nama_Sepatu;
    private String Ukuran;
    private String Jumlah_Sepatu;
    private String Harga;
}
