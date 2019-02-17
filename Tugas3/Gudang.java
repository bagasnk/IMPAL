package tugas3;
/**
*
* @author Naufal Hisyam
*/
public class Gudang {
	public static void main(String[] args){
		// Membuat object
        Gudang Gudang1 = new Gudang();
        /* memanggil atribut dan memberi nilai */
         Gudang1.Nama_sepatu = "Brodo Casual";
         Gudang1.Stock = "100";
        
         System.out.println("Nama_sepatu: " + Gudang1.Nama_sepatu);
         System.out.println("Stock: " + Gudang1.Stock);
         
 		Gudang Gudang2 = new Gudang();
 		/* memanggil atribut dan memberi nilai */
 		 Gudang2.Nama_sepatu = "Jager";
         Gudang2.Stock = "100";
         
 		 System.out.println("Nama_sepatu: " + Gudang2.Nama_sepatu);
         System.out.println("Stock: " + Gudang2.Stock);
         
         Gudang Gudang3 = new Gudang();
  		/* memanggil atribut dan memberi nilai */
  		 Gudang3.Nama_sepatu = "Mokasino";
         Gudang3.Stock = "100";
          
  		 System.out.println("Nama_sepatu: " + Gudang3.Nama_sepatu);
         System.out.println("Stock: " + Gudang3.Stock);
	}
        private String Nama_sepatu;
 	    private String Stock;
 	    
}
