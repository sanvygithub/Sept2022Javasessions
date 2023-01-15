package HaspMapConcept;

import java.util.HashMap;
import java.util.Map;

public class EcommerceTest {

	public static String getUserCreds(String role) {
		Map<String, String> roles = new HashMap<String,String>();
		roles.put("Seller", "Seller;Seller@123");
		roles.put("Partner", "Partner;Partner@123");
		roles.put("Manager", "Manager;Manager@123");
		roles.put("CatManager", "CatManager;CatManager@123");
		roles.put("Admin", "Admin;Admin@123");
		return roles.get(role);
	}
	
	public static String getUserName(String role) {
		String Creds=getUserCreds(role);
		String[] user=Creds.split(";");
		return user[0];
	}
	
	public static String getPwd(String role) {
		String Creds=getUserCreds(role);
		String[] user=Creds.split(";");
		return user[1];
	}
	
	public static void main(String[] args) {
//		String Creds=getUserCreds("Admin");
//		System.out.println(Creds);
		
		String un=getUserName("Manager");
		String pw=getPwd("Manager");
		
		System.out.println(un+";"+pw);
		

	}

}
