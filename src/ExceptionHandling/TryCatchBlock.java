package ExceptionHandling;

public class TryCatchBlock {

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i = 9/0;
		}
		catch(Exception e) {
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("A");
		System.out.println("A");
		
	}

}
