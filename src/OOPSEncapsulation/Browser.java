package OOPSEncapsulation;

public class Browser {
	
	private String name;
	private int version;
	
	public void launchBrowser(String browserName) {
		interactWithOS(browserName);
		System.out.println("browser is launched"+ browserName);
	}
	
	private void interactWithOS(String browserName) {
		checkRamSpace(browserName);
	}
	
	private void checkRamSpace(String browserName) {
		checkBrowserSetupFile(browserName);
	}
	
	private void checkBrowserSetupFile(String browserName) {
		checkLatestVersion(browserName);
	}
	
	private void checkLatestVersion(String browserName) {
		System.out.println("browser is found--"+ browserName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
