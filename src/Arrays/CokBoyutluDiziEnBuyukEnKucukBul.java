package Arrays;

public class CokBoyutluDiziEnBuyukEnKucukBul {

	public static void main(String[] args) {
		
		double[][] matris = new double [][]{
			{34, 11, -7, 53},
			{254, 8, -65, 4},
			{110, 64, 33, 26}
		};
		System.out.println(enBuyukElemaniBul(matris));
		System.out.println(enKucukElemaniBul(matris));	
		System.out.println(satirdakiEnKucukDeger(matris, 2));	
		
		
	}
	
	public static double enBuyukElemaniBul(double[][] sayi){
		
		double enBuyukEleman = sayi[0][0];
		for (int i = 0; i < sayi.length; i++) {
			for (int j = 0; j < sayi[0].length; j++) {
				if (enBuyukEleman < sayi[i][j]) {
					enBuyukEleman = sayi[i][j];
				}
			}
		}
		return enBuyukEleman;
	}
	
	public static double enKucukElemaniBul(double [][] sayi2) {
		double enKucukEleman = sayi2[0][0];
		for (int i = 0; i < sayi2.length; i++) {
			for (int j = 0; j < sayi2[0].length; j++) {
				if(enKucukEleman > sayi2[i][j]) {
				enKucukEleman = sayi2[i][j];
				}
			}
		}
		return enKucukEleman;
	}
	public static double satirdakiEnKucukDeger(double[][] arr, int satir) {
		
		double enKucukDeger = arr[0][0];
		for (int i = 0; i < arr[satir].length; i++) {
			if(enKucukDeger > arr[satir][i]) {
				enKucukDeger = arr[satir][i];
			}
		}
		return enKucukDeger;
	}
	
		
}
