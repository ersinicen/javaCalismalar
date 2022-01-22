package Arrays;

public class FonksiyonParametresDizi {

	public static void main(String[] args) {
		int[] a = {2, 8, 3, 7, 5};
		int toplam;
		toplam = topla_dizi(a,5);
		System.out.println("Toplam: "+toplam);
		int dizininToplami = diziElemanlariniTopla(a,5);
		System.out.println(dizininToplami);

	}
	
	static int topla_dizi(int[] x, int n) {
		int i, ictoplam;
		ictoplam = 0;
		for (i = 0; i < n; i++) {
			ictoplam += x[i];
		}
		
		return ictoplam;
	}
	
	public static int diziElemanlariniTopla(int [] dizi, int j) {
		int toplam = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			toplam = toplam + dizi[i];
		}
		return toplam;
	}
	
}
