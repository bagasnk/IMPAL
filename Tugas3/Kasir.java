/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3_IMPAL;
/**
 *
 * @author N. Jeriano
 */

public class Kasir {
    public static void main(String[] args){
        Kasir Kasir1 = new Kasir();
            Kasir1.nip = "111";
            Kasir1.nama_kasir = "bagus";
            Kasir1.nota = "a11";
    System.out.println("NIP : " + Kasir1.nip);
    System.out.println("Nama : " + Kasir1.nama_kasir);
    System.out.println("Nota : " + Kasir1.nota);
    
    Kasir Kasir2 = new Kasir();
            Kasir2.nip = "112";
            Kasir2.nama_kasir = "iqbal";
            Kasir2.nota = "a22";
    System.out.println("NIP : " + Kasir2.nip);
    System.out.println("Nama : " + Kasir2.nama_kasir);
    System.out.println("Nota : " + Kasir2.nota);
    
    Kasir Kasir3 = new Kasir();
            Kasir3.nip = "113";
            Kasir3.nama_kasir = "wahyu";
            Kasir3.nota = "a33";
    System.out.println("NIP : " + Kasir3.nip);
    System.out.println("Nama : " + Kasir3.nama_kasir);
    System.out.println("Nota : " + Kasir3.nota);
    
    }
private String nip;
    private String nama_kasir;
    private String nota;
}