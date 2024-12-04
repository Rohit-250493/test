package BasicJava;

public class ArrayConcept {

	public static void main(String[] args) {
		//1. int array
		int i[]= new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[1]);
		System.out.println(i[0]+i[1]);
		
		System.out.println(i.length);
		
		int len=i.length;
		int HI=len-1;
		System.out.println(HI);
		
		//To print all values of array: for loop
		System.out.println("-----");
	   for(int k=0; k<i.length;k++) {
		   System.out.println(i[k]);
	   }
		int p[]= new int[10];
		p[0]=100;
		p[1]=200;
		
		System.out.println(p[0]);
		System.out.println(p[2]);
		
		
		//2. Double array:
		
		double d[]= new double[3];
		d[0]=10.00;
		d[1]=22.22;
		d[2]=68.88;
		
		System.out.println(d[2]);
		
		//3. Char array:
		
		char c[]= new char[2];
		
		//4. boolean array:
		
		boolean b[]= new boolean[3];
		
		//5. String array:
		
		String str[]= new String[4];
		str[0]="java";
		str[1]="ruby";
		str[2]="python";
		
		System.out.println(str[3]);
		
		for(int z=0;z<str.length;z++) {
			System.out.println(str[z]);
		}
		
		

	}

}
