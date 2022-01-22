package functions;

public class BuyukSayiyiBul {

	public static void main(String[] args) {
		int x = 12;
		int y = 25;
		System.out.println("en buyuk sayi "+enBuyukSayiyiBul(x,y));

	}
	
	public static int enBuyukSayiyiBul(int a, int b) {
		if(a > b) {
			return a;
		}
		else
		{
			return b;
		}
	}

}
