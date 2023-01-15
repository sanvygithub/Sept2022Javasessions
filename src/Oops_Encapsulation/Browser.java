package Oops_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launch Browser");
		checkVersion();
		checkOsVersion();
		checkOsServices();
		checkOscompatability();
		System.out.println("browser should be launched");

	}

	private void checkVersion() {
		System.out.println("checking browser version");
	}

	private void checkOsVersion() {
		System.out.println("checking os version");
	}

	private void checkOsServices() {
		System.out.println("checking os services");
	}

	private void checkOscompatability() {
		System.out.println("checking os compatability");
	}

}
