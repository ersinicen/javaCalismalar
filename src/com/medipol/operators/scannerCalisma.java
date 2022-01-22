package com.medipol.operators;

import java.util.Scanner;

public class scannerCalisma {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		String sonuc; 
		double not;
		
		System.out.println("Sýnav notunu giriniz(0-100) :");
		not = giris.nextDouble();
		sonuc = not >= 50 ? "Baþarýlý" : "Baþarýsýz";
		
		System.out.println("sonuç: "+sonuc);

	}

}
