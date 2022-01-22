package com.medipol.odevlerim;
import java.util.Scanner;

public class IkinciDerecedenBirDenkleminKokleri {

	public static void main(String[] args) {
		
		Scanner degerAl = new Scanner(System.in); 
        System.out.println("(ax+bx+c) ikinci dereceden bir denklemdir.Denklemdeki sabitleri asagidaki gibi sirayla girin"); 
        
        System.out.print("a degerini giriniz :"); 
        double a = degerAl.nextInt(); 
        System.out.print("b degerini giriniz :"); 
        double b = degerAl.nextInt(); 
        System.out.print("c degerini giriniz :"); 
        double c = degerAl.nextInt(); 

        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double kok1 = ((-b * b) - Math.sqrt(delta)) / (2 * a); 
            double kok2 = ((-b * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + kok1 + " x2= " + kok2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin gercel koku yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-b * b) / (2 * a);
            System.out.println("Cakisik iki kok var x1= x2= " + x); 
        }

	}

}
