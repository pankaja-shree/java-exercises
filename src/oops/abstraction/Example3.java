package oops.abstraction;

interface D{
	
	public abstract void test();
}

interface D2{
	
	public void test2(); //abstract by default
}

interface D3{
	
	abstract void test2(); //public by default
}

interface D4{
	String n = "abc"; //public static final by default
	int test3();//public abstract by default
}

interface D5{
	//java 8 onwards features
	public static void t1(){
		
	}
	
	default void t2(){
		
	}
	
}
public class Example3 implements D, D2, D3, D4 {

	public void test() {
		// TODO Auto-generated constructor stub
	}

	public void test2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int test3() {
		// TODO Auto-generated method stub
		return 0;
	}

}
