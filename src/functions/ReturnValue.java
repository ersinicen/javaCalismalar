package functions;

public class ReturnValue {
	
	public static void printSquare(double x) {
		System.out.println("void method icinde: "+x * x);
	}
	
	public static void main(String[] arguments) {
		printSquare(5);
		double sonuc = square(6);
		System.out.println("main method icinde: "+sonuc);
	}
	
	public static double square (double x) {
		System.out.println("Square method icinde: "+x * x);
		return x * 4;
	}
	
}
