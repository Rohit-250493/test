package BasicJava;

public class BasicOperator {

	public static void main(String[] args) {
		
		int x=0/9;
		System.out.println(x);
		
		int p=9;
		int q=p%2;
		
		System.out.println(q);
		
		int num=10;
		if(num%2==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		
		//Ternary operator
		
		int z=12;
		String s=(z>10) ? "hi" : "bye";
		System.out.println(s);
		
		int n1=5;
		int n2=10;
		int max;
		max=(n1>n2) ? n1 : n2;
		System.out.println("max number is:"+max);
		
		String browser = "chrome";
		String s1=(browser.equals("chrome")) ? "launch chrome" : "launch ff";
		System.out.println(s1);

	}

}
