package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExample {

	public static void main(String[] args) {
		System.out.println("Enter age");
		
		try {
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception");
		}
		System.out.println("Main method end");
		
	}
}
