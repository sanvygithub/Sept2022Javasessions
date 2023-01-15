package Oops_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login const");
	}

	@Override
	public void pageTitle() {
		System.out.println("LP----pg title");

	}

	@Override
	public void pageUrl() {
		System.out.println("lp pageurl");
	}

	@Override
	public void pageTimeout() {
		System.out.println("pageTimeout");
	}
	
	public static void pageStyle() {
		System.out.println("lp---pageStyle");

	}

}
