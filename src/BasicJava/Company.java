package BasicJava;

import java.util.ArrayList;

public class Company {
	
	String name;
	String ceo;
	String product;
	long revenue;
	int empCount;
	
	ArrayList<String> branchList;
	
	// constructor of class
	//name: class name
	// can not return any value
	//dont write any return type
	//its look like a function but its not a function
	public Company() {
		System.out.println("default const....");
	}
	
	public Company(int a) {
		System.out.println("one param const...."+ a);
	}
	
	//create the const with class variables
	 
	public Company(String name,String ceo,String product,long revenue,int empCount) {
		this.name=name;
		this.ceo=ceo;
		this.product=product;
		this.revenue=revenue;
		this.empCount=empCount;
	}
	public Company(String name,String ceo,String product,long revenue,int empCount, ArrayList<String> branchList) {
		this.name=name;
		this.ceo=ceo;
		this.product=product;
		this.revenue=revenue;
		this.empCount=empCount;
		this.branchList=branchList;
	}
	
	public Company(String name,String ceo,String product) {
		this.name=name;
		this.ceo=ceo;
		this.product=product;
	}
	

	public static void main(String[] args) {

		Company c1= new Company(10);
		Company c2= new Company("Google","sundar pichai","Google cloud", 1000000,10000);
		Company c3= new Company("MS","satya nadella","MS Azure", 2000000,20000);
		Company c4= new Company("XYZ COMP","Rohan Kumar","Apple", 500000,500);
		Company c5= new Company("ABC COMP","steve","Samsung");
		
		
		System.out.println(c2.name);
		System.out.println(c2.ceo);
		System.out.println(c2.product);
		System.out.println(c2.revenue);
		System.out.println(c2.empCount);
		
		ArrayList<String> branches = new ArrayList<String>();
		branches.add("CA");
		branches.add("Pune");
		branches.add("London");
		Company comp1 = new Company("Google","Sundar","Chrome",6500000,3000, branches); 
		
		System.out.println(comp1.name + " "+comp1.branchList);
	}

}
