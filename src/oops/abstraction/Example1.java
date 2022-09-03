package oops.abstraction;

abstract class A{
	
	public String name = "abc";
	
	abstract public void test();
	
	public void test1() {
		System.out.println("test1");
	}
}

public class Example1 extends A{

	public static void main(String[] args) {
		
		A a = new Example1(); //auto upcasting
		
		a.test();
		a.test1();
	
	}
	
	public void test() {
		System.out.println("test");
	}

}
