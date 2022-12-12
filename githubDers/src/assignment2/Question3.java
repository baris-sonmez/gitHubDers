package assignment2;

import java.util.Scanner;

public class Question3 {
	public static void main(String[]args) {
		
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter mile value that will be converted to kilometer");
	double mileValue=scan.nextDouble();
	
	     double km=mileValue * 1.6;
	     System.out.println("km="+km);
	}

}
