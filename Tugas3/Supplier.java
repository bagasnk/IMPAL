package tugas3;
/**
*
* @author Naufal Hisyam
*/
public class Supplier {
	public static void main(String[] args){
		// Membuat object
        Supplier Supplier1 = new Supplier();
        /* memanggil atribut dan memberi nilai */
         Supplier1.Nama_supplier = "Justinus";
         Supplier1.Alamat_Supplier = "Sukabirus";
         Supplier1.Ongkos_pengiriman = "Rp. 10.000";
         Supplier1.ID = "001";
         System.out.println("Nama_supplier: " + Supplier1.Nama_supplier);
         System.out.println("Alamat_Supplier: " + Supplier1.Alamat_Supplier);
         System.out.println("Ongkos_pengiriman: " + Supplier1.Ongkos_pengiriman);
         System.out.println("ID: " + Supplier1.ID);
 
 		Supplier Supplier2 = new Supplier();
 		/* memanggil atribut dan memberi nilai */
 		 Supplier2.Nama_supplier = "Rangga";
         Supplier2.Alamat_Supplier = "Rajawali";
         Supplier2.Ongkos_pengiriman = "Rp. 20.000";
         Supplier2.ID = "002";
 System.out.println("Nama_supplier: " + Supplier2.Nama_supplier);
 System.out.println("Alamat_Supplier: " + Supplier2.Alamat_Supplier);
 System.out.println("Ongkos_pengiriman: " + Supplier2.Ongkos_pengiriman);
 System.out.println("ID: " + Supplier2.ID);

 		Supplier Supplier3 = new Supplier();
 		/* memanggil atribut dan memberi nilai */
 		Supplier3.Nama_supplier = "Iqbal";
 		Supplier3.Alamat_Supplier = "Jakarta";
 		Supplier3.Ongkos_pengiriman = "Rp. 30.000";
 		Supplier3.ID = "003";
 		System.out.println("Nama_Supplier: " + Supplier3.Nama_supplier);
 		System.out.println("Alamat_Supplier: " + Supplier3.Alamat_Supplier);
 		System.out.println("Ongkos_pengiriman: " + Supplier3.Ongkos_pengiriman);
 		System.out.println("ID: " + Supplier3.ID);
	}
	 private String Nama_supplier;
	    private String Alamat_Supplier;
	    private String Ongkos_pengiriman;
	    private String ID;
}
