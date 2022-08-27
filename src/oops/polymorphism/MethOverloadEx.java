package oops.polymorphism;

class Parent
{
	public void test(int i) {
		System.out.println("Parent");
	}
}

public class MethOverloadEx extends Parent {

	public void test(int i) {
		System.out.println("Inside MethodOverrideEx");
	}
	
	public static void main(String[] args) {
		MethOverloadEx m = new MethOverloadEx();
		m.test(10);
	}

}
