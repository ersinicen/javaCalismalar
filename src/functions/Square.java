package functions;

public class Square {
	
	public static void printSquare(int x)
	{
		System.out.println(x*x);
	}

	public static void main(String[] args) {
		int x = 2;
		int value = 2;
		printSquare(value);
		printSquare(3); 
		printSquare(value*3);
		printSquare(5);

	}

}
