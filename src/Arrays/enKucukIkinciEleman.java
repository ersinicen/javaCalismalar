package Arrays;

public class enKucukIkinciEleman {

	public static void main(String[] args) {
		
		int [][] matris = {
			{56, 23, 678, 231},
			{234, 21, 78, 23},
			{654, 33, 22, 67},
			{189, 35, 56, 89}
		};
		System.out.println(enKucukEleman(matris));
	}
	
	public static int enKucukEleman(int[][] dizi) {
		int enKucukEleman = dizi[0][0];
		int satir = 0, sutun = 0;
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(enKucukEleman > dizi[i][j]) {
					enKucukEleman = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		dizi[satir][sutun] = 1000000;
		enKucukEleman = dizi[0][0];
		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi.length; j++) {
				if(enKucukEleman > dizi[i][j]) {
					enKucukEleman = dizi[i][j];
					satir = i;
					sutun = j;
				}
			}
		}
		System.out.println(++satir+".satirin"+ ++sutun +".sutunundadir.");
		return enKucukEleman;
	}
}
