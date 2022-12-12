package assignment2;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("diktortgenin uzun kenarinin degerini giriniz");
		int uzunKenar=scan.nextInt();
		System.out.println("uzunKenar="+uzunKenar);
		
		System.out.println("diktortgenin kisa kenarinin degerini giriniz");
		int kisaKenar=scan.nextInt();
		System.out.println("kisaKenar="+kisaKenar);
		
		System.out.println("diktortgenin yukseklik degerini giriniz");
		int yukseklik=scan.nextInt();
		System.out.println("yukseklik="+yukseklik);
		
		int hacim=uzunKenar*kisaKenar*yukseklik;
		System.out.println("hacim="+hacim);
		
	}

}
