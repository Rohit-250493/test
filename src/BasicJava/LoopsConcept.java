package BasicJava;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1 to 10
		//while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		// 10 to 1
		
		int k=10;
		while(k>=1) {
			System.out.println(k);
			k--;
		}
		
		// For loop
		for(int j=1;j<=10;j++) {
			System.out.println(j);
		}
			
        //Do-while loop
		int p=10;
		do {
			System.out.println(p);
			p--;
		}
		while(p>=1);
	}

}
