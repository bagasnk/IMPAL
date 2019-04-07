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

    public SepatuKulitSauqi(String JenisSepatu) {
        
        //Database akses
        
        Harga = 
        Nama = 
    
    }
    
    
    
    
    public static void main(String[] args){
        // Membuat object
           SepatuKulitSauqi SepatuKulitSauqi1 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi1.Nama_Sepatu = "Brodo Casual";
                SepatuKulitSauqi1.Ukuran = "42";
                SepatuKulitSauqi1.Jumlah_Sepatu = "8";
                SepatuKulitSauqi1.Harga = "Rp. 280.000";
        
        CetakInfo(SepatuKulitSauqi1);
        
        SepatuKulitSauqi SepatuKulitSauqi2 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi2.Nama_Sepatu = "Jager";
                SepatuKulitSauqi2.Ukuran = "41";
                SepatuKulitSauqi2.Jumlah_Sepatu = "12";
                SepatuKulitSauqi2.Harga = "Rp. 200.000";
        
        CetakInfo(SepatuKulitSauqi2);
        
        SepatuKulitSauqi SepatuKulitSauqi3 = new SepatuKulitSauqi();
        /* memanggil atribut dan memberi nilai */
               SepatuKulitSauqi3.Nama_Sepatu = "Mokasino";
                SepatuKulitSauqi3.Ukuran = "40";
                SepatuKulitSauqi3.Jumlah_Sepatu = "20";
                SepatuKulitSauqi3.Harga = "Rp. 200.000";
        
        CetakInfo(SepatuKulitSauqi3);
    }
    
    private static void CetakInfo(SepatuKulitSauqi sepatuKulit){
        System.out.println("Nama Sepatu: " + sepatuKulit.Nama_Sepatu);
        System.out.println("Ukuran: " + sepatuKulit.Ukuran);
        System.out.println("Jumlah_Sepatu: " + sepatuKulit.Jumlah_Sepatu);
        System.out.println("Harga: " + sepatuKulit.Harga);
    }
    
    private String Nama_Sepatu;
    private String Ukuran;
    private String Jumlah_Sepatu;
    private String Harga;
    
    public void setHarga(String Harga){
        this.Harga = Harga;
    }
    
    
}
