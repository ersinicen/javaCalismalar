package functions;

public class SystemPrintln {

	public static void main(String[] args) {
		String kelime = "Test verisi";
		int kelimeUzunlugu = kelime.length();
		println(kelime);
		
		println("test abc");

	}
	 
	public static void println(String input) { //public olmazsa sadece burda calisir.
		
		System.out.printf(input + "%n");
		System.out.printf("-------------- %n");
	}

}
