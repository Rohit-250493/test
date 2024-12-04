package WebDriverArch;

public class LoginPageTest {

	public static void main(String[] args) {
 
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.findElement("Username");
		driver.findElement("Password");
		driver.findElement("login");
		
		System.out.println(driver.getTitle());
	}

}
