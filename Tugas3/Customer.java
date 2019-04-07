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

public class Customer {
    public static void main(String[] args){
        Customer Customer1 = new Customer();
            Customer1.nama = "bagas";
            Customer1.id = "01";
            Customer1.alamat = "sukabirus";
    System.out.println("Nama : " + Customer1.nama);
    System.out.println("ID : " + Customer1.id);
    System.out.println("Alamat : " + Customer1.alamat);
    
    Customer Customer2 = new Customer();
            Customer2.nama = "jeri";
            Customer2.id = "02";
            Customer2.alamat = "pbb";
    System.out.println("Nama : " + Customer2.nama);
    System.out.println("ID : " + Customer2.id);
    System.out.println("Alamat : " + Customer2.alamat);
    
    Customer Customer3 = new Customer();
            Customer3.nama = "opal";
            Customer3.id = "03";
            Customer3.alamat = "umayah";
    System.out.println("Nama : " + Customer3.nama);
    System.out.println("ID : " + Customer3.id);
    System.out.println("Alamat : " + Customer3.alamat);
    
    }
    
    private String nama;
    private String id;
    private String alamat;
}
