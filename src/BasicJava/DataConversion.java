package BasicJava;

public class DataConversion {

	public static void main(String[] args) {

		String x= "100";
		System.out.println(x+20);
		
		//120
		
		//wrapper classes
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String total= "1000A";
		System.out.println(total+50);
		
	//	int totalval = Integer.parseInt(total); //java.lang.NumberFormatException: For input string: "1000A"
	//	System.out.println(totalval+50);
		
		//String to double:
		String y = "122.44";
		System.out.println(y+20);
		
		double d = Double.parseDouble(y);
		System.out.println(d+20);
		
		//int to String
		
		int p = 200;
		System.out.println(p+20);
		
		String str = String.valueOf(p);
		System.out.println(str+20);
		
		
		
		
		
		
		
		
		
		
		
	}

}
