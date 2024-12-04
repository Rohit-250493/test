package BasicJava;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		// ArrayList- default class in java
		//dynamic array
		//create the object of ArrayList class
		
		ArrayList ar= new ArrayList();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		
		ar.add(500);
		ar.add(600);
		
		System.out.println(ar.size());
		System.out.println(ar.get(0));
		
//		ar.remove(4);
	//	System.out.println(ar.size());
		
		// ArrayList with integer
		ArrayList<Integer> MarksList= new ArrayList<Integer>();
		MarksList.add(10);
		MarksList.add(40);
		
		// ArrayList with string
		
		ArrayList<String> studentList= new ArrayList<String>();
		studentList.add("Ram");
		studentList.add("shyam");
		studentList.add("nandu");
		
		// ArrayList with object
		ArrayList<Object> empList=new ArrayList<Object>();
		empList.add("Tom");
		empList.add(25);
		empList.add('M');
		empList.add(true);
	}

}
