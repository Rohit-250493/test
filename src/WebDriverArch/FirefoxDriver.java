package WebDriverArch;

public class FirefoxDriver implements WebDriver {
	
	public FirefoxDriver() {
		System.out.println("launch firefox");
	}

	@Override
	public void get(String url) {
       System.out.println("launching url"+ url);
	}

	@Override
	public void findElement(String Element) {
      System.out.println("finding element"+ Element);		
	}

	@Override
	public String getTitle() {
     System.out.println("get the page title");	
       return "Google";
	}

}
