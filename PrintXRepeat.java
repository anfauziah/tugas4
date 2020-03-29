import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */
public class PrintXRepeat {

	public static void main(String[] args) {
	
	int Sum;
	int x;
	Scanner masukan=new Scanner(System.in);
	
	/* Program */
	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt();
	
	/* First Elmt */
	if (x == 999){
		System.out.print("Kasus kosong \n");
	}else {
		/* MInimal ada satu data yang dijumlahkan*/
		Sum = 0;
	
	/* Inisialisasi; invariant !! */
	do{
		Sum = Sum + x; /* Proses */
		System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
		x = masukan.nextInt(); /* Next Elmt */
	} while (x != 999);
		/* Kondisi pengulangan */System.out.println
		/* Terminasi */
		("Hasil penjumlahan = "+Sum);
		}
	}
}
