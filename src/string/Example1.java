package string;

public class Example1 {

	public static void main(String[] args) {
	
		String name = "abcd";
		int count = name.length();
		System.out.println(count);
		String upper = name.toUpperCase();
		System.out.println(upper);
		String cities = "Mysore#Bangalore#Hyderabad#Vizag";
		String cs[] = cities.split("#");
		for(int i=0; i<cs.length; i++) {
			if(cs[i].startsWith("H")) {
				System.out.println(cs[i]);
			}
			if(cs[i].endsWith("g")) {
				System.out.println(cs[i]);
			}
		}
		String substr1 = cities.substring(2);
		System.out.println(substr1);
		String substr2 = cities.substring(7,10);
		System.out.println(substr2);
		
		char c = name.charAt(3);
		System.out.println(c);
		int i = cities.indexOf('e');
		System.out.println(i);
		int j = cities.lastIndexOf('e');
		System.out.println(j);
		
		String s1 = "abc", s2 = "ABC";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.contains("s"));
		
		System.out.println(cities.replace('i', 'a'));
		
		int k = 10;
		String s = String.valueOf(k); 
		System.out.println(s);
		
		String a= "";
		System.out.println(a.isBlank());
		System.out.println(a.isEmpty());

		String b = null;
		// System.out.println(b.isEmpty()); no method can be used on null.
		
		String str1 = "example"; // string literal
		String str2 = new String("example"); // string object
		
		System.out.println(str1.equals(str2)); // equals method checks only content
		System.out.println(str1 == str2); // == checks object

	}
	
}
