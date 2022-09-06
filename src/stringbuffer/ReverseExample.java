package stringbuffer;

public class ReverseExample {

	public static void main(String[] args) {
		//method 1
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		sb.append("xyz");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//method 2 - convert string to stringbuilder 
		
		String city = "Bangalore";
		StringBuilder cityb = new StringBuilder(city);
		System.out.println(cityb);
		cityb.reverse();
		
		//convert stringbuilder to string
		
		String s = cityb.toString();
		System.out.println(s);
		
		// method 3 
		String n = "word";
		for(int i =n.length()-1; i>=0; i--) {
			System.out.print(n.charAt(i));
		}
	}

}
