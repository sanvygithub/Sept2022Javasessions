package Oops_Encapsulation;

public class UserLogin {

	public static void main(String[] args) {
		
		LoginPage a=new LoginPage("sandy","sandy@12","admin");
		System.out.println(a.getUsername());
		System.out.println(a.getPassword());
		System.out.println(a.role);
		
		LoginPage a1=new LoginPage("Kittu","kittu@12","Superadmin");
		System.out.println(a1.getUsername());
		System.out.println(a1.getPassword());
		System.out.println(a1.role);
		
		a.setPassword("admin!23");
		System.out.println(a.getPassword());
		
		System.out.println(a1.getInfo());
		
		

	}

}
