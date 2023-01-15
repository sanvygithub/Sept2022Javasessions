package Oops_Encapsulation;

public class LoginPage {
	private String Username;
	private String Password;
	public String role;
	
	public LoginPage(String username, String password, String role) {
		this.Username = username;
		this.Password = password;
		this.role = role;
		
		
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getInfo() {
		System.out.println("get info method");
		return Username+" "+Password+" "+role;
	}
	
	
	
	

}
