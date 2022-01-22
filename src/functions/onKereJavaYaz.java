package functions;
import java.util.Scanner;
import java.util.Iterator;

public class onKereJavaYaz {

	public static void ornek(int a) {
		int i;
		for (i = 0; i < a; i++) {
			System.out.println("Java");
		}
		
	}
	
	public static void javaKelimesiniEkranaYaz(int sinirDeger) {
		for (int i = 0; i < sinirDeger; i++) {
			System.out.println("Java");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.println("Bir sayý girin");
		int a = giris.nextInt();
		
		if(a<3) {
			javaKelimesiniEkranaYaz(3);
		}
		else {
			javaKelimesiniEkranaYaz(10);
		}

	}

}
