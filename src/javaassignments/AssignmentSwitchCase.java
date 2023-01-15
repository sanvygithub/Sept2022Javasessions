package javaassignments;

public class AssignmentSwitchCase {

	public static void main(String[] args) {
		String Env = "UAT1";
		switch (Env) {
		case "DEV":
			System.out.println("launch DEV URL:" + "http//dev.0");
			break;
		case "SIT1":
			System.out.println("launch SIT1 URL1:" + "https:SIT");
			String version = "V.2.0";
			switch (version) {
			case "v.2.0":
				System.out.println("launch updated release version: v.2.0");
				break;
			case "v.1.0":
				System.out.println("launch updated release version: v.2.0.1");
				break;

			default:
				System.out.println("launch the default browser:" + version);
				break;
			case "v.0.1":
				System.out.println("the browser version is v.0.1");
				break;
			}
			break;
			
		
		case "UAT1":
			System.out.println("launch DEV URL:" + "https:UAT1");
			break;	
			
		default:
			System.out.println("Launch:" + Env);// 3
			break;
		case "UAT":
			System.out.println("launch DEV URL:" + "https:UAT");
		case "SIT":
			System.out.println("launch DEV URL1:" + "https:SIT");
			break;
		

		}

	}

}
