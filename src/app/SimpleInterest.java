package app;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter price");
		int p = sc.nextInt();
		
		System.out.println("Enter time in months");
		int t = sc.nextInt();
		
		System.out.println("Enter rate of interest");
		double r = sc.nextDouble();
		
		double si = p * t * r / 100;
		
		System.out.println("The SI is " + si);
	}

}
