package javasessions;

public class SwitchCase {

	public static void main(String[] args) {
		String browser="IE";
		switch (browser.toUpperCase()) {
		case "CHROME":
			System.out.println("Launch chrome");
			break;
		case "IE":
			System.out.println("Launch IE");
			String version="v.0.1";
			switch (version.toUpperCase()) {
			case "V.0.1":
				System.out.println("launched the updated browser V0.1");
				break;
				
			case "v.0.2":
				System.out.println("launched the browser:" +version);
				break;

			default:
				System.out.println("launch the default browser");
				break;
			}
		break;
		default:
			System.out.println("launch the default browser :"+browser);
			break;
		case "Edge":
			System.out.println("Launch Edge");
			
		}

	}

}
