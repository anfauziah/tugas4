import java.util.Scanner;

public class BuatProgram {
	

	

	void tampil1(){
	
		System.out.print("Inputan merupakan bilangan ganjil");
	
		}

	
	void tampil2(){
	
		System.out.print("Inputan merupakan bilangan genap");
	
		}
	
	

	
	public static void main(String args[]){
	
		int a;
	
		Scanner scan = new Scanner(System.in);
    	
		
	System.out.print("Masukkan sebuah bilangan : ");
    	
		a = scan.nextInt();
	
		BuatProgram lagi = new BuatProgram();
	
			if(a%2 == 0) {
		
			lagi.tampil2();	
	
		} else {
 
			lagi.tampil1();	
		
			}

	
}


}
