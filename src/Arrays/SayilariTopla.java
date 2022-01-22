package Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SayilariTopla {

	public static void main(String[] args) {
		int[] diziDegiskeni = {2,3,4,5};
		diziIleTopla(diziDegiskeni);
		System.out.println("sonuc: "+diziElemanlariniTopla(diziDegiskeni));
	}
	
	public static void diziIleTopla(int[] diziDegiskeni) {
		Scanner giris = new Scanner(System.in);
		
		int[] sayiDizisi = new int [3];
		int toplam,i;
		toplam = 0;
		for (i = 1; i<= 3; i++) {
			System.out.println("Bir sayi giriniz: ");
			sayiDizisi[i-1] = giris.nextInt();
			toplam = toplam + sayiDizisi[i-1];
		}
		
	}
	
	public static int diziElemanlariniTopla(int [] dizi) {
		int toplam = 0;
		for (int i = 0; i < dizi.length; i++) {
			toplam += dizi[i];
		}
		return toplam;
	}
}
