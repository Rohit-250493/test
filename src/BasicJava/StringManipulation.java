package BasicJava;

public class StringManipulation {

	public static void main(String[] args) {

		String str = "This is my first java code and i am so happy";
		
		System.out.println("length=" +str.length());
		System.out.println("li = "+0);
		System.out.println("hi="+(str.length()-1));
		
		System.out.println(str.charAt(3));
		
		System.out.println(str.indexOf('s'));
		System.out.println(str.indexOf('s', 4));
		
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("hello"));
		
		String welcome = "welcome admin";
		
		if(welcome.indexOf("admin")>0) {
			System.out.println("admin is present in string");
		}
		else {
			System.out.println("admin is not present in string");
		}
		
		
		//trim
		String s = "  hello world  ";
		System.out.println(s.trim());
		
		String s1 = "  hello java  ";
		
		System.out.println(s1.trim().replace(" ",""));
		
		String dob = "10-10-1970";
		System.out.println(dob.replace("-","/"));
		
		
		
	}

}
