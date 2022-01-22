package functions;

public class Multiply {
	
	public static void times(double a, double b)
	{
		System.out.println(a * b);
	}
	
	public static void main(String[] args) {
		times(2,2);
		double a = 2;
		double b = 2;
		times(a,b);
		times(3,4);
	}

}
