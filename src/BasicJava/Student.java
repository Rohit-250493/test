package BasicJava;

public class Student {
	
	String name;
	int age;
	int id;
	
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}



	public static void main(String[] args) {
		
		Student s1 = new Student("Vivek",26,101);
		Student s2 = new Student("Raj",24,102);
		Student s3 = new Student("Krunal",25,103);
		
		System.out.println(s1.name + " " + s1.age +" " +s1.id);
		System.out.println(s2.name + " " + s2.age +" " +s2.id);
		System.out.println(s3.name + " " + s3.age +" " +s3.id);
		
		s1=s2;
		
		System.out.println(s1.name + " " + s1.age +" " +s1.id);
		System.out.println(s2.name + " " + s2.age +" " +s2.id);
		System.out.println(s3.name + " " + s3.age +" " +s3.id);
		
		s2=s3;
		
		System.out.println(s1.name + " " + s1.age +" " +s1.id);
		System.out.println(s2.name + " " + s2.age +" " +s2.id);
		System.out.println(s3.name + " " + s3.age +" " +s3.id);
		
		s3=s1;
		
		System.out.println(s1.name + " " + s1.age +" " +s1.id);
		System.out.println(s2.name + " " + s2.age +" " +s2.id);
		System.out.println(s3.name + " " + s3.age +" " +s3.id);
		

	}

}
