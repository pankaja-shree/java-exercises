package exception;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Main method start");
		int i = 100, j = 0;
		try {
			int k = i/j;
			System.out.println(k);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		System.out.println("Main method end");
	}
}
