package BasicJava;

public class Employee {
	String name;
	int age;
	String role;
	int empid;
	boolean ispermanent;

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name="Tom";
		e1.age=23;
		e1.role="QA";
		e1.empid=101;
		e1.ispermanent=true;
		
		e2.name="Komal";
		e2.age=26;
		e2.role="senior QA";
		e2.empid=102;
		e2.ispermanent= false;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.role + " " + e1.empid + " " + e1.ispermanent);
		System.out.println(e2.name + " " + e2.age + " " + e2.role + " " + e2.empid + " " + e2.ispermanent);
	}

}
