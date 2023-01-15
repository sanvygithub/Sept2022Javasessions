package Oops_Abstract;

public abstract class Page {
	//only abstract methods-100% abstraction
	//non abstract methods-0% abstraction
	//abstract +non abstract- x% partial abstraction
	
	public Page() {
		System.out.println("Page const");
	}
	
	
	public abstract void pageTitle();
	
	public abstract void pageUrl();
	
	public final void displayLogo() {
		System.out.println("Amazon Home Page");
	}
	
	public void pageTimeout() {
		System.out.println("pageTimeout");
	}
	
	public static void pageStyle() {
		System.out.println("pg pageStyle");
	}
	
	

}
