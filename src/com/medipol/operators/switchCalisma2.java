package com.medipol.operators;

import java.util.Scanner;

public class switchCalisma2 {

	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		int secim;
		System.out.println("Secim Yapiniz (1-2-3)");
		secim = giris.nextInt();
		switch (secim) {
			case 1 :
				System.out.println("A s�n�f� dergilerin listesi");
			break;
			case 2 : 
				System.out.println("B s�n�f� dergilerin listesi");
			break;
			case 3 : 
				System.out.println("C s�n�f� dergilerin listesi");
			break;
			
			default: 
				System.out.println("Hatal� Se�im! 1,2 ya da 3'e bas�n�z.");
			break;
		}
	}

}
