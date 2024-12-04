package OOPSEncapsulation;

public class UserTest {

	public static void main(String[] args) {

		User u1 = new User();
		
		u1.setName("Vijay");
		u1.setAge(28);
		u1.setPhone(7766);
		
		System.out.println(u1.getName() + " " + u1.getAge() + " " + u1.getPhone());
		
		u1.getUserSalaryInfo();
	}

}
