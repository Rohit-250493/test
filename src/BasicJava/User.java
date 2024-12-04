package BasicJava;

public class User {
	
	// Class variables
	String name;
	String emailId;
	long phoneNumber;
	boolean isActive;
	
	//class Method
	public String getUserOrderDetails(String userName) {
		if(userName.equals("Tom")) {
			return "Mack Book";
		}
		else if(userName.equals("Steve")){
			return "Samsung s8";
		}
		else {
			System.out.println(userName + "user not found");
			return "user not found";
		}
		
	}
	public long getUserPhoneNumber(String userName) {
		if(userName.equals("Tom")) {
			return 887766;
		}
		else if(userName.equals("Steve")){
			return 554433;
		}
		else {
			System.out.println(userName + "user not found");
			return -1;
		}
		
	}

	public static void main(String[] args) {
		User user1 = new User();
		user1.name="Tom";
		String itemName=user1.getUserOrderDetails(user1.name);
		System.out.println(itemName);
		
		long ph=user1.getUserPhoneNumber(user1.name);
		System.out.println(ph);

	}

}
