package Arrays;
import java.util.Scanner;
import java.util.Iterator;

public class SutundakiBuyukElemaninBulunduguEnKucukDegeriBulma {

	public static void main(String[] args) {
		
		double[][] dizi = new double[][] {
			{56, 23, 678, 231},
			{234, 21, 78, 23},
			{654, 33, 22, 67},
			{189, 35, 56, 89}
		};
		System.out.println(sutundakiEnKucukSayiyiBul(dizi,enBuyukElemaninOlduguSutun(dizi)));
	}
	 public static int enBuyukElemaninOlduguSutun(double[][] parametreDizi) {
		 double enBuyukSayi = parametreDizi[0][0];
		 int sutun = 0;
		 for (int i = 0; i < parametreDizi.length; i++) {
			for (int j = 0; j < parametreDizi[0].length; j++) {
				if(enBuyukSayi < parametreDizi[i][j]) {
					enBuyukSayi = parametreDizi[i][j];
					sutun = j;
				}
			}
		}
		return sutun;
	 }
	 
	 public static int sutundakiEnKucukSayiyiBul(double[][] parametreDizi, int sutun) {
		 double enKucukSayi = parametreDizi[0][sutun];
		 for (int i = 0; i < parametreDizi.length; i++){
			 if(enKucukSayi > parametreDizi[i][sutun]) {
				 enKucukSayi = parametreDizi[i][sutun];
			}
		}
		return(int) enKucukSayi;
	 }	 
}