package WebDriverArch;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("launch google chrome");
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
	
	public void plugin() {
		System.out.println("chrome -- plugin");
	}

}
