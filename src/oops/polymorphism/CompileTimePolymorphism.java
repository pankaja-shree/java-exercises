package oops.polymorphism;

class Parent
{
	public void test(int i) {
		System.out.println("Parent");
	}
}

public class CompileTimePolymorphism extends Parent {

	public void test(int i) {
		System.out.println("Inside Child");
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism m = new CompileTimePolymorphism();
		m.test(10);
		Parent p = new CompileTimePolymorphism(); //auto upcasting
		p.test(0);
	}

}
