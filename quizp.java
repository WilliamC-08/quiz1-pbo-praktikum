import java.util.Scanner;

public class quizp{
	public static void main (String [] args){
		Scanner input = new Scanner (System.in);
		System.out.println("	 MERK		|    TIPE	|   HARGA");
		System.out.println("	  G		| Meja  (M)	| Rp. 95000");
		System.out.println("			| Kursi (K)	| Rp.125000");
		System.out.println("			| Lemari(L)	| Rp.450000");
		System.out.println("----------------------------------------------------");
		System.out.println("  	  O		| Meja  (M)	| Rp.115000");
		System.out.println("			| Kursi (K)	| Rp.135000");
		System.out.println("			| Lemari(L)	| Rp.550000");
		
		String nama; char tipe,merk; int m,k,l,jumlah,bayar,total,kembalian;
		m=0; k=0; l=0; jumlah=0; bayar=0; total=0; kembalian=0;
		System.out.println();
		System.out.println("FORM PEMESANAN");
		System.out.print("Nama: ");
		nama=input.nextLine();
		System.out.print("Merk: ");
		merk=input.next().charAt(0);
		if (merk == 'G' || merk == 'g' ) {
			m=95000; k=125000; l=450000;
		}
		else if (merk == 'O' || merk == 'o'){
			m=115000; k=135000; l=550000;	
		}
		else {
			System.out.println("Merk tidak ada di menu");
		}
		System.out.print("Tipe: ");
		tipe=input.next().charAt(0);
		System.out.print("Jumlah: x");
		jumlah=input.nextInt();
		if (tipe == 'm' || tipe == 'M'){
			total=m*jumlah;
		}
		else if (tipe == 'k' || tipe == 'K'){
			total=k*jumlah;
		}
		else if (tipe == 'l' || tipe == 'L'){
			total=l*jumlah;
		}
		else {
			System.out.println("Tidak ada Tipe "+tipe);
		}
		System.out.println("====================================");
		System.out.println("FORM PEMBAYARAN");
		System.out.println("Nama: "+nama);
		System.out.println("Pesanan: ");
		System.out.print("Merk: "+merk); System.out.println("| Tipe: "+tipe+" x "+jumlah+" pcs");
		System.out.println("TOTAL	Rp. "+total);
		
		while(bayar<total){
		System.out.print("Bayar: ");
		bayar=input.nextInt();
			if (bayar> total){
				kembalian=bayar-total;
			}
			else if(bayar<total) {
			System.out.println("Uang Tidak Cukup");
			}
		}
		System.out.println("========== LUNAS ==========");
		System.out.println("Nama: "+nama);
		System.out.println("Pesanan: ");
		System.out.print("Merk: "+merk); System.out.println("| Tipe: "+tipe+" x "+jumlah+" pcs");
		System.out.println("TOTAL	Rp. "+total);
		System.out.println("Bayar: "+bayar);
		System.out.println("Kembalian: "+kembalian);
	}
}