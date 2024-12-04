package BasicJava;

public class AmazonSearch {
	// Method Overloading: Within the class
	// Same Method name
	// different parameter name
	// different types of parameter
	// different sequence of parameter
	public void search() {
		System.out.println("0 param");
	}
	
	public void search(int a) {
		System.out.println("1 param"+ a);
	}
	
   public void search(int a,int b) {
		System.out.println("2 param"+ a + b);
	}
   
   public void search(int c,String d) {
		System.out.println("2 param"+ c +d);
  	}
   
   public void search(String c,int d) {
		
 	}

	public static void main(String[] args) {
		AmazonSearch as = new AmazonSearch();
		as.search();
		as.search(10);
		as.search(20, 30);
		as.search(50,"Apple");

	}

}
