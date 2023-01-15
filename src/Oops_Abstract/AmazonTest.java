package Oops_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage();
		lp.displayLogo();
		lp.pageUrl();
		lp.pageTimeout();
		Page.pageStyle();
		LoginPage.pageStyle();
		
		System.out.println("---------------------------");
		
		Page p=new LoginPage ();
		p.pageUrl();
		p.pageTitle();
		p.pageTimeout();
		p.displayLogo();
		Page.pageStyle();
		
		

	}

}
