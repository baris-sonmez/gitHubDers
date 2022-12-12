package assignment2;

import java.util.Scanner;

public class Question4 {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in);
		 System.out.println("please type hours that will be shown as seconds");
		long hours=scan.nextLong();
		
		long seconds=hours*60*60;
		System.out.println("seconds="+seconds);
		
		
		
	}

}
