package BasicJava;

public class IncrementalDecremental {

	public static void main(String[] args) {
		int x=1;
		int y=x++;
		
		System.out.println(x);
		System.out.println(y);

		
		int p=-1;
		int q=p++;
		
		System.out.println(p);
		System.out.println(q);
		
		int m=2;
		int n=--m;
		System.out.println(m);
		System.out.println(n);
	}

}
