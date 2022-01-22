package com.medipol.operators;

import java.util.Scanner;

public class AritmetikOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner giris = new Scanner(System.in);
		int a,b;
		System.out.println("A sayisini giriniz: ");
		a = giris.nextInt();
		System.out.println("B sayisini giriniz: ");
		b = giris.nextInt();
		System.out.println("a + b ="+ (a+b));

	}

}
