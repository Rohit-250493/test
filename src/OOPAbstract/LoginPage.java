package OOPAbstract;

public class LoginPage extends Page {

	@Override
	public void header(String name) {
      System.out.println("login page -- header"+name);		
	}

	@Override
	public void title(String title) {
	   System.out.println("login page -- title"+title);		

	}
	
	public void doLogin() {
		System.out.println("login page -- do login");
	}

}
