package WebDriver_Architecture;

public class ChromeDriver implements WebDriver {
	
	public ChromeDriver() {
		System.out.println("Launch Chrome Browser");
	}

	@Override
	public void findElement() {
		System.out.println("click on the element");
		
	}

	@Override
	public void findElements() {
		System.out.println("click on the elements");
		
	}

	@Override
	public void get(String url) {
		System.out.println("launch Url:"+url);
		
		
	}

	@Override
	public void Launch(String Browser) {
		System.out.println("Launch Browser:"+Browser);
		
	}

	@Override
	public String getText(String ele) {
		System.out.println("Element name is:"+ele);
		return null;
	}

	@Override
	public void sendkeys(String Username, String password) {
		System.out.println("username:"+Username + password);
		
	}

	@Override
	public boolean isDispalyed() {
		System.out.println("isDisplayed");
		return true;
	}

	@Override
	public void click() {
		System.out.println("click method");
		
	}

}
