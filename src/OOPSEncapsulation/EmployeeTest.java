package OOPSEncapsulation;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.name="Steve";
		e.getCity();
		
		e.setAge(28);
		
		System.out.println(e.getAge());
	}

}
