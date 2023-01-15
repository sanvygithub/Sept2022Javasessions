package javasessions;

public class MethodSwitch {
	// AC:
	// WAF:
	// name: launchBrowser
	// input param: browsername(String) --> chrome, firefox, IE, Safari
	// return: boolean

	public boolean launchBrowser(String browserName) {
		System.out.println("launch browser");
		if (browserName.equals("Chrome")) {
			return true;
		} else if (browserName.equals("IE")) {
			return true;
		} else if (browserName.equals("Edge")) {
			return true;
		} else {
			System.out.println("Please launch correct browser:" + browserName);
			return false;
		}

	}

	public static void main(String[] args) {
		MethodSwitch br = new MethodSwitch();
		boolean b = br.launchBrowser("Edge");
		System.out.println(b);

	}

}
