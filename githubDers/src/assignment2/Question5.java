package assignment2;

import java.util.Scanner;

public class Question5 {                             //karenin cevresi=kenar*4
	public static void main(String[]args) {	         // karenin alani= kenar*kenar
		
		Scanner scan=new Scanner(System.in);
		System.out.println("karenin bir kenar uzunlugunu giriniz");
		int kenarUzunlugu=scan.nextInt();
		
		int kareninCevresi=kenarUzunlugu*4;
		int kareninAlani=kenarUzunlugu*kenarUzunlugu;
		
		System.out.println("kenarUzunlugu="+kenarUzunlugu);
		System.out.println("kareninCevresi="+kareninCevresi);
		System.out.println("kareninAlani="+kareninAlani);
		
		
		
		
		
		
	}

}
