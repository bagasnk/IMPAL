/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDiagram;

/**
 *
 * @author bagas
 */

public class Perusahaan {
    public static void main(String[] args){
        // Membuat object
           Perusahaan Perusahaan1 = new Perusahaan();
        /* memanggil atribut dan memberi nilai */
                Perusahaan1.Nama = "JAB";
                Perusahaan1.Alamat = "Jl.Ciganitri Bandung no 43";
                Perusahaan1.No = "082323598893";
        System.out.println("Nama: " + Perusahaan1.Nama);
        System.out.println("Alamat: " + Perusahaan1.Alamat);
        System.out.println("No: " + Perusahaan1.No);
        
        Perusahaan Perusahaan2 = new Perusahaan();
        /* memanggil atribut dan memberi nilai */
                Perusahaan2.Nama = "JAE";
                Perusahaan2.Alamat = "Jl PuriAsih 1 No 10";
                Perusahaan2.No = "082216139304";
        System.out.println("Nama: " + Perusahaan2.Nama);
        System.out.println("Alamat: " + Perusahaan2.Alamat);
        System.out.println("No: " + Perusahaan2.No);
        
        Perusahaan Perusahaan3= new Perusahaan();
        /* memanggil atribut dan memberi nilai */
                Perusahaan3.Nama = "JAS";
                Perusahaan3.Alamat = "Jl Cigodenwah no 42 Bandung";
                Perusahaan3.No = "0822154423";
        System.out.println("Nama: " + Perusahaan3.Nama);
        System.out.println("Alamat: " + Perusahaan3.Alamat);
        System.out.println("No: " + Perusahaan3.No);
    }
    private String Nama;
    private String Alamat;
    private String No;
}


