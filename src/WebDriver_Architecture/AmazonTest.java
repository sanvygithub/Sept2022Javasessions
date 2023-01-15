package WebDriver_Architecture;

public class AmazonTest {
	static WebDriver driver;

	public static void main(String[] args) {
		// ChromeDriver driver=new ChromeDriver();
		// FirefoxDriver driver=new FirefoxDriver();
		// SafariDriver driver=new SafariDriver();

		String browser = "chrome ";
		switch (browser.trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Launch correct browser:" + browser);
			break;
		}

		driver.findElement();
		driver.findElements();
		driver.get("https//amazon.com");
		driver.Launch("default");
		driver.getText("AmazonHome");
		driver.sendkeys("Sandhya", "Sanju123");
		driver.isDispalyed();
		driver.click();

	}

}
