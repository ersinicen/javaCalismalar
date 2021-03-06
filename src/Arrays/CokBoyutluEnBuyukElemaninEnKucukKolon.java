package Arrays;

import java.util.Arrays;


public class CokBoyutluEnBuyukElemaninEnKucukKolon {

	public static void main(String[] args) {
		int[][] matris = {
				{56,23,678,231},
				{234,21,78,23},
				{654,11,22,67},
				{189,35,56,89},
		};
		
		int sutun = enBuyukElemaninBulunduguSutunuBul(matris);
		
		//System.out.println(sutundakiEnKucukElemaniBul(matris,sutun));
		System.out.println(enKucuk2Bul(matris));
		
		int [] dizi = cokBoyutluDizidekiTekElemanlariDiziOlarakDon(matris);
		System.out.println(Arrays.toString(dizi));
	}
	
	public static int enKucuk2Bul(int[][] dizi){
		int enKucukSayi = dizi[0][0];
		int satir= 0, sutun=0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(enKucukSayi > dizi[i][j]) {
					enKucukSayi = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		dizi[satir][sutun] = 10000000;
		enKucukSayi = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(enKucukSayi > dizi[i][j]) {
					enKucukSayi = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		return enKucukSayi;	
	}
	
	public static int enBuyukElemaninBulunduguSutunuBul(int[][] dizi) {
		int enBuyukSayi = dizi[0][0];
		int sutun = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[i].length; j++) {
				if(enBuyukSayi < dizi[i][j]) {
					enBuyukSayi = dizi[i][j];
					sutun = j;
				}
			}
		}
		System.out.println("en buyuk eleman: " + enBuyukSayi);
		return enBuyukSayi;
	}
	
	public static int sutundakiEnKucukElemaniBul(int[][] dizi,int sutun) {
		int enKucukSayi = dizi[0][sutun];
		for (int i = 0; i < dizi.length; i++) {
			if(enKucukSayi > dizi[i][sutun]) {
				enKucukSayi = dizi[i][sutun];
			}
		}
		return enKucukSayi;	
	}
	
	public static int[] cokBoyutluDizidekiTekElemanlariDiziOlarakDon(int[][] matris) {
		int count = 0;
		int[] tekSayilarDizisi;
		int k = 0;
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				if(matris[i][j] % 2 != 0) {
					count++;
				}
			}
		}
		tekSayilarDizisi = new int [count];
		
		for (int i = 0; i < tekSayilarDizisi.length; i++) {
			for (int j = 0; j < tekSayilarDizisi.length; j++) {
				if(matris[i][j] % 2 != 0) {
					tekSayilarDizisi[k] = matris[i][j];
				}
			}
		}
		return tekSayilarDizisi;
	}
}