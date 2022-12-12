package assignment2;

import java.util.Scanner;

public class Question7 {

	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Adinizi giriniz");
		String isim=scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		String soyIsim=scan.nextLine();
		
		System.out.println("Adiniz:"+isim);
		System.out.println("Soyadiniz:"+soyIsim+"   "+"kursumuza katiliminiz alinmistir, tesekkur ederiz");
		
		
	}
}
